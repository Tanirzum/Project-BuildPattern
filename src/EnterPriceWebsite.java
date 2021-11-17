public class EnterPriceWebsite extends WebsiteBuilder {
    @Override
    void buildName() {
        webSite.setName("EnterPrice Website");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(19000);
    }
}
