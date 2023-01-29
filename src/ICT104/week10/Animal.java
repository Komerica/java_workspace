package ICT104.week10;

public class Animal {
    private static int ID = 0;
    private String species;
    private double price;
    private boolean beingInShow;

    // Two most necessary constructors
    public Animal() {
    }
    public Animal(String species, double price, boolean beingInShow) {
        Animal.ID = ID + 1;
        this.species = species;
        this.price = price;
        this.beingInShow = beingInShow;
    }

    public static int getID() {
        return ID;
    }
    public static void setID(int ID) {
        Animal.ID = ID;
    }

    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBeingInShow() {
        return beingInShow;
    }
    public void setBeingInShow(boolean beingInShow) {
        this.beingInShow = !beingInShow;
    }

    public double increasePrice(){
        return 0;   // dummy return value
    }

    public static void main(String[] args) {
        Animal a = new Animal("Cat", 200, false);
        a.setBeingInShow(a.beingInShow);
        System.out.println(a.beingInShow);  // true
    }
}
