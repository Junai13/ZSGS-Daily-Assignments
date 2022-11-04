package threenovmber;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ApiCall {
    public static void main(String[] args) {
        ApiCall apiCall = new ApiCall();
        apiCall.doGet();
    }

    private void doGet() {
        try {
            URL url = new URL("https://reqres.in/api/unknown ");
            URLConnection connect = url.openConnection();
            InputStreamReader input = new InputStreamReader(connect.getInputStream());
            BufferedReader buffer = new BufferedReader(input);
            String response = buffer.readLine();
            while (response != null) {
                System.out.println(response);
                response = buffer.readLine();
            }
            buffer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
