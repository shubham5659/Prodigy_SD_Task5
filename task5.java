import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class task5 {

    public static void main(String[] args) {
        String url = "http://books.toscrape.com/";
        String csvFile = "books.csv";

        try {
            FileWriter writer = new FileWriter(csvFile);
            writer.append("Title,Price,Rating\n");

            // Connect to the website
            Document doc = Jsoup.connect(url).get();

            // Select all product containers
            Elements products = doc.select("article.product_pod");

            for (Element product : products) {
                String title = product.select("h3 a").attr("title");
                String price = product.select(".price_color").text().replace("£", "");
                String rating = product.select(".star-rating").attr("class").replace("star-rating", "").trim();

                writer.append(title).append(",").append(price).append(",").append(rating).append("\n");
            }

            writer.flush();
            writer.close();
            System.out.println("Scraping complete. Data saved to books.csv");

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
