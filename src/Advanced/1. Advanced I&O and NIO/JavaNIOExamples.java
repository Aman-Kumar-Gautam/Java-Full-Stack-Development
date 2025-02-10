import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class JavaNIOExamples {

    // Reading from a file using FileChannel and ByteBuffer
    public static void readFile(String filePath) {
        try (RandomAccessFile file = new RandomAccessFile(filePath, "r");
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

    // Writing to a file using FileChannel and ByteBuffer
    public static void writeFile(String filePath, String data) {
        try (RandomAccessFile file = new RandomAccessFile(filePath, "rw");
             FileChannel channel = file.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(1024);
            buffer.put(data.getBytes());
            buffer.flip(); // Switch to read mode
            channel.write(buffer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // String filePath = "example.txt";   Change this file location to local 
        String outputFilePath = "output.txt";
        
        // Write data to a file
        writeFile(outputFilePath, "Hello, Java NIO!");
        
        System.out.println("File Written Successfully. Reading Now:");
        
        // Read data from the file
        readFile(outputFilePath);
    }
}
