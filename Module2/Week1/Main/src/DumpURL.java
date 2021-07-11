import java.io.*;
import java.net.*;

public class DumpURL {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://www.w3schools.com/html/default.asp");
            URLConnection conn = url.openConnection();

            InputStream stream = conn.getInputStream();
            InputStreamReader ir = new InputStreamReader(stream);
            BufferedReader reader = new BufferedReader(ir);

            FileWriter fw = new FileWriter("List_Song.html");
            BufferedWriter bw = new BufferedWriter(fw);
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);

            }
            System.out.println("Success");
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
