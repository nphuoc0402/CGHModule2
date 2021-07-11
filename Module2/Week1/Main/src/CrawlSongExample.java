import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            Scanner input = new Scanner(new InputStreamReader(url.openStream()));
            input.useDelimiter("\\Z");
            String content = input.next();
            String link = input.next();
            input.close();
            FileWriter fw = new FileWriter("F:\\JAVA\\Module2\\Week1\\Main\\src\\List_Song.html");
            BufferedWriter bw = new BufferedWriter(fw);

            content = content.replaceAll("\\n+","");
            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
//            Pattern p = Pattern.compile("(http://|https://)(www.)?([a-zA-Z0-9]+).[a-zA-Z0-9]*.[a-z]{3}.?([a-z]+)?");
            Matcher m = p.matcher(content);

            bw.write("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "  <meta charset=\"UTF-8\">\n" +
                    "  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                    "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "  <title>Document</title>" +
                    "</head>\n" +
                    "<body>\n" );
            while(m.find()){
//                System.out.println(m.group(1));
                bw.write("\t\t" +"<a href='#'>");
                bw.write(m.group(1) + "</a>" + "\n" );

            }
            bw.write("</body>\n" +
                    "</html>");
            bw.close();
            fw.close();
            System.out.println("Successful!");
        }catch(MalformedURLException e){
            e.printStackTrace();
        }catch(UnsupportedEncodingException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
