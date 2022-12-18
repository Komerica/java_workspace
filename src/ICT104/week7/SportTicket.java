package ICT104.week7;

public class SportTicket extends Ticket implements MultiUseTicketing {
    private double baseCost;
    private double costPerUse;
    private int remainingUses;

    public SportTicket(double baseCost, double costPerUse, int initialUses) {
        this.baseCost = baseCost;
        this.costPerUse = costPerUse;
        this.remainingUses = initialUses;
    }

    @Override
    public void loadUp(int amount) {
        remainingUses += amount;
    }

    @Override
    public boolean useOnce() {
        if (remainingUses == 0) {
            return false;
        }
        remainingUses--;
        return true;
    }

    @Override
    public String getPurpose() {
        return "Attendance to sporting events";
    }

    @Override
    public double getCost() {
        return baseCost + costPerUse * (remainingUses + 1);
    }

    @Override
    public boolean isValid() {
        return remainingUses > 0;
    }
}
