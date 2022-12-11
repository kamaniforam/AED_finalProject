/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uiComponents.PHC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author foram
 */
public class News {
    
    
	private static final String USER_AGENT = "Mozilla/5.0";

	private static final String GET_URL = "https://www.healthcare.gov/glossary/childrens-health-insurance-program-chip.json";

	private static final String POST_URL = "https://www.healthcare.gov/glossary/childrens-health-insurance-program-chip.json";

	private static final String POST_PARAMS = "";

	private static void sendGET() throws IOException {
            String result ="";
            URL obj = new URL(GET_URL);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", USER_AGENT);
            int responseCode = con.getResponseCode();
            System.out.println("GET Response Code :: " + responseCode);
            if (responseCode == HttpURLConnection.HTTP_OK) { // success
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                }
                in.close();

                // print result
                System.out.println(response.toString());
                result = response.toString();
            } else {
                System.out.println("GET request did not work.");
            }
	}
        
        private static String title;
        private static String content;
        
        public static String getTitle() {
            if(title == null) {
                try {
                    sendGET();
                } catch(IOException e) {}
            }
            
            return title;
        }
        
        public static String getContent() {
            if(content == null) {
                try {
                    sendGET();
                } catch(IOException e) {}
            }
            
            return content;
        }
}
