import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class UrlUriExample {
    public static void main(String[] args) {
        try {
            // Creating a URL from a string representation
            URL url = new URL("https://example.com/path/to/resource?query=1#fragment");

            // Retrieving components of the URL
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort()); // -1 if not specified
            System.out.println("Path: " + url.getPath());
            System.out.println("Query: " + url.getQuery());
            System.out.println("Fragment: " + url.getRef());

            // Creating a URI from a string representation
            URI uri = new URI("https://example.com/path/to/resource?query=1#fragment");

            // Retrieving components of the URI
            System.out.println("\nScheme: " + uri.getScheme());
            System.out.println("Host: " + uri.getHost());
            System.out.println("Port: " + uri.getPort()); // -1 if not specified
            System.out.println("Path: " + uri.getPath());
            System.out.println("Query: " + uri.getQuery());
            System.out.println("Fragment: " + uri.getFragment());

            // Constructing a URI using URI builder
            URI uriBuilder = new URI("https", "example.com", "/path", "query=1", "fragment");
            System.out.println("\nConstructed URI: " + uriBuilder.toString());

        } catch (URISyntaxException | IllegalArgumentException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
