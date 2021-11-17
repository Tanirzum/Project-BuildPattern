public abstract class WebsiteBuilder {
    Website webSite;

    void creatWebsite() {
        webSite = new Website();
    }

    abstract void buildName();

    abstract void buildCms();

    abstract void buildPrice();

    Website webSite() {
        return webSite;
    }
}
