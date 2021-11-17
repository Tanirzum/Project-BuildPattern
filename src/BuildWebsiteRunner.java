public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setbuilder(new EnterPriceWebsite());
        Website website = director.website();

        System.out.println(website);
    }
}
