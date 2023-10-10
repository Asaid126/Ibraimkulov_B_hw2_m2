public class Flat extends Realty{ //квартиры

    private int floorNumber;               //номер этажа
    private String series;                 //серия этажки

    public Flat(String district, int price, int rooms, int floorNumber, String series) {
        super(district, price, rooms);
        this.floorNumber = floorNumber;
        this.series = series;
    }

    @Override
    public void print() {
        System.out.println("Flat🏢(этажная квартира)"+
                "\nDistrict: "+ getDistrict() +
                "\n  Prise: "+ getPrice()+
                "\n    Land area: "+getLandArea()+
                "\n      Rooms: "+getRooms()+
                "\n        Floor Namber: "+floorNumber+
                "\n          Series: "+series);
    }
}
