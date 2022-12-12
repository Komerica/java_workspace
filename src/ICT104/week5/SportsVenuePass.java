package ICT104.week5;


public class SportsVenuePass {
    private boolean used;
    private static int passId;

    SportsVenuePass() {
        this.useThisPass();
        passId++;
    }
    public void useThisPass() {
        used = true;
    }

    public boolean isUsed() {
        return used;
    }
    public void setUsed(boolean used) {
        this.used = used;
    }
    public int getPassId() {
        return passId;
    }
    public void setPassId(int passId) {
        this.passId = passId;
    }
    public static void main(String[] args) {
        SportsVenuePass pass1 = new SportsVenuePass();
        System.out.println(pass1.getPassId());
        SportsVenuePass pass2 = new SportsVenuePass();
        System.out.println(pass2.getPassId());
        SportsVenuePass pass3 = new SportsVenuePass();
        System.out.println(pass3.getPassId());
    }
}
