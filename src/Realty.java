public abstract class Realty implements Printable {              //Недвижимость
    private String district;         //Район
    private  int price;             // Цена
    private  String landArea;           //площадь земли
    private int rooms;               //количество комнат

    public String getDistrict() {
        return district;
    }

    public int getPrice() {
        return price;
    }

    public String getLandArea() {
        return landArea;
    }

    public int getRooms() {
        return rooms;
    }

    public Realty(String district, int price, String landArea, int rooms) {
        this.district = district;
        this.price = price;
        this.landArea = landArea;
        this.rooms = rooms;
    }

    public Realty(String district, int price, int rooms) {
        this.district = district;
        this.price = price;
        this.rooms = rooms;
    }

    public Realty(String district, int price, String landArea) {
        this.district = district;
        this.price = price;
        this.landArea = landArea;
    }

}
