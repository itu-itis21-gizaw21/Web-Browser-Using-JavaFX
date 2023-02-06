import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Kalx {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.google.com");
        Scanner input = new Scanner(url.openStream());
        while (input.hasNext()) {
            String line = input.nextLine();
            //System.out.println("xxxxxxxxxx");
            //System.out.println(line);
            System.out.println(line);
        }
    }
}
