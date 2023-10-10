public class House extends Realty{        //Частный дом
    private  String outbuildings;          //хозяйственные постройки
    private  String communications;   // комуникации(свет,вода,газ)

    public House(String district, int price, String landArea, int rooms, String outbuildings, String communications) {
        super(district, price, landArea, rooms);
        this.outbuildings = outbuildings;
        this.communications = communications;
    }

    @Override
    public void print() {
        System.out.println( "House\uD83C\uDFE0(Частный дом)"+
                "\n          District: "+ getDistrict() +
                "\n        Prise: "+ getPrice()+
                "\n      Land area: "+getLandArea()+
                "\n    Rooms: "+getRooms()+
                "\n  Outbuildings: "+outbuildings+
                "\nCommunications: "+communications);


    }
}
