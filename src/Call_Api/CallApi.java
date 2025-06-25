package Call_Api;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CallApi {
    public static void main(String[] args) throws URISyntaxException {
        String uri = "https://jsonplaceholder.typicode.com/posts";
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(new URI(uri))
                .header("Content-Type", "application/json")
                .build();

        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(response -> {
                    System.out.println("Response code: " + response.statusCode());
                    System.out.println("Response body: " + response.body());
                    return null;
                })
                .join();
    }
}
