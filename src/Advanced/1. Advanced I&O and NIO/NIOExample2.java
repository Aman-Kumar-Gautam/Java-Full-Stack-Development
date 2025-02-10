import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Iterator;
import java.util.Set;

public class NIOExample2 {
    public static void main(String[] args) {
        fileReadExample();
        fileWriteExample();
        nioSelectorExample();
        asyncFileWriteExample();
    }

    public static void fileReadExample() {
        try (RandomAccessFile file = new RandomAccessFile("example.txt", "r");
             FileChannel channel = file.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(1024);
            int bytesRead = channel.read(buffer);

            while (bytesRead != -1) {
                buffer.flip(); // Switch to read mode
                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get());
                }
                buffer.clear(); // Clear buffer for next read
                bytesRead = channel.read(buffer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void fileWriteExample() {
        String data = "Hello, Java NIO!";
        try (RandomAccessFile file = new RandomAccessFile("output.txt", "rw");
             FileChannel channel = file.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(1024);
            buffer.put(data.getBytes());
            buffer.flip(); // Switch to read mode
            channel.write(buffer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void nioSelectorExample() {
        try {
            Selector selector = Selector.open();
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.bind(null);
            serverSocketChannel.configureBlocking(false);
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

            while (true) {
                int readyChannels = selector.select();
                if (readyChannels == 0) {
                    continue;
                }

                Set<SelectionKey> selectedKeys = selector.selectedKeys();
                Iterator<SelectionKey> keyIterator = selectedKeys.iterator();
                while (keyIterator.hasNext()) {
                    SelectionKey key = keyIterator.next();
                    if (key.isAcceptable()) {
                        ServerSocketChannel serverChannel = (ServerSocketChannel) key.channel();
                        SocketChannel socketChannel = serverChannel.accept();
                        socketChannel.configureBlocking(false);
                        socketChannel.register(selector, SelectionKey.OP_READ);
                    } else if (key.isReadable()) {
                        SocketChannel socketChannel = (SocketChannel) key.channel();
                        ByteBuffer buffer = ByteBuffer.allocate(1024);
                        @SuppressWarnings("unused")
                        int bytesRead = socketChannel.read(buffer);
                        buffer.flip();
                        while (buffer.hasRemaining()) {
                            System.out.print((char) buffer.get());
                        }
                        buffer.clear();
                    }
                    keyIterator.remove();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void asyncFileWriteExample() {
        try {
            Path path = Paths.get("asyncfile.txt");
            AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(path,
                    StandardOpenOption.CREATE, StandardOpenOption.WRITE);

            ByteBuffer buffer = ByteBuffer.allocate(1024);
            buffer.put("Hello, Asynchronous I/O!".getBytes());
            buffer.flip(); // Switch to read mode

            fileChannel.write(buffer, 0, buffer, new CompletionHandler<Integer, ByteBuffer>() {
                @Override
                public void completed(Integer result, ByteBuffer attachment) {
                    System.out.println("Write operation completed");
                }

                @Override
                public void failed(Throwable exc, ByteBuffer attachment) {
                    System.err.println("Write operation failed: " + exc.getMessage());
                }
            });

            Thread.sleep(1000); // Wait for write operation to complete
            fileChannel.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
