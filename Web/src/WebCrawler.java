import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class WebCrawler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a URL: ");
        String url = input.nextLine();
        crawler(url);
    }
    public static void crawler(String startingURL){
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraverseURLs = new ArrayList<>();

        listOfPendingURLs.add(startingURL);

        while (!listOfPendingURLs.isEmpty() && listOfTraverseURLs.size() <= 100){
            String urlString = listOfPendingURLs.remove(0);
            if (!listOfTraverseURLs.contains(urlString)){
                listOfTraverseURLs.add(urlString);
                System.out.println("Crawl "+ urlString);


            }
        }
    }
    public static ArrayList<String> getSubURLs(String urlString) throws Exception{
        ArrayList<String> list = new ArrayList<>();

        URL url = new URL(urlString);
        Scanner input = new Scanner(url.openStream());
        int current = 0;
        while (input.hasNext()){
            String line = input.nextLine();
            current = line.indexOf("http:",current);
            while (current > 0){
                int endIndex = line.indexOf("\"",current);

            }




        }



        return list;
    }
}