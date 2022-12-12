package ICT104.week6.partC1;

public class CompactDisc implements RetailItem {
    String CDTitle;
    String CDArtist;
    double retailPrice;
    CompactDisc() {
        CDTitle = "Haha";
        CDArtist = "Lee";
        retailPrice = 100;
    }

    public double getRetailPrice() {
        return retailPrice;
    }
    public String getCDTitle() {
        return CDTitle;
    }
    public String getCDArtist() {
        return CDArtist;
    }
}
