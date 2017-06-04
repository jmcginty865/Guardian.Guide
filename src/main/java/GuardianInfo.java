import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by jennifermcginty on 6/2/17.
 */
public class GuardianInfo {

     final String apiKey = "3dd05513f63849db9ea0f9a1ca9fd482";


    String url = "https://www.bungie.net/en/Legend/Gear/1/4611686018433946292/2305843009217444787";
    URL obj = new URL(url);
    HttpURLConnection con = (HttpURLConnection) obj.openConnection();

    con.setRequestMethod("GET");
    con.setRequestProperty("X-API-Key", apiKey)
}
