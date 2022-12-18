package ICT104.week7;

public class TouristTicket extends Ticket implements SingleUseTicketing {
    private String attractionName;
    public double price;
    public boolean used;

    public TouristTicket(String attractionName, double price) {
        this.attractionName = attractionName;
        this.price = price;
        this.used = false;
    }

    @Override
    public boolean use() {
        if (used) {
            return false;
        }
        used = true;
        return true;
    }
    @Override
    public String getPurpose() {
        return "Visit to " + attractionName;
    }

    @Override
    public double getCost() {
        return price;
    }

    @Override
    public boolean isValid() {
        return !used;
    }
}
