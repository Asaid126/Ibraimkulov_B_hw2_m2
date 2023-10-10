public class Plat extends Realty{    //земельный участок
    private String purposeOfland;  //назначение земли(с/х,строительство,под бизнес)


    public Plat(String district, int price, String landArea, String purposeOfland) {
        super(district, price, landArea);
        this.purposeOfland = purposeOfland;
    }
    public void print() {
        System.out.println("Plat\uD83C\uDF33(земельный участок)"+
                "\nDistrict: "+ getDistrict() +
                 "\nPrise: "+ getPrice()+
                  "\nLand area: "+getLandArea()+
                   "\nRooms: "+getRooms()+
                    "\nPurpose of land: "+purposeOfland);
    }
}
