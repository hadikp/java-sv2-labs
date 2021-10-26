package composition.realestate;

public class Details {
    private String description;
    private int squareMeter;
    private int areaOfSite; //telek mérete
    private Address address;

    public Details(String description, int squareMeter, int areaOfSite, Address address) {
        this.description = description;
        this.squareMeter = squareMeter;
        this.areaOfSite = areaOfSite;
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    public int getAreaOfSite() {
        return areaOfSite;
    }

    public Address getAddress() {
        return address;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSquareMeter(int squareMeter) {
        this.squareMeter = squareMeter;
    }

    public void setAreaOfSite(int areaOfSite) {
        this.areaOfSite = areaOfSite;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Részletek:" +
                "Leírás: " + description +
                ", Négyzetméter: " + squareMeter +
                ", Telek mérete: " + areaOfSite +
                ", Cím: " + address;
    }
}
