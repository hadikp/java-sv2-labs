package stringmethods.url;

public class UrlManagerMain {
    public static void main(String[] args) {
        UrlManager url = new UrlManager("https://earthquake.usgs.gov/");
        System.out.println(url);
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());

    }
}
