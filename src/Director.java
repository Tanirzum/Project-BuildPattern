public class Director {
    WebsiteBuilder websiteBuilder;

    public void setbuilder(WebsiteBuilder builder) {
        this.websiteBuilder = builder;
    }

    Website website() {
        websiteBuilder.creatWebsite();
        websiteBuilder.buildName();
        websiteBuilder.buildCms();
        websiteBuilder.buildPrice();

        Website webSite = websiteBuilder.webSite();
        return webSite;
    }
}


