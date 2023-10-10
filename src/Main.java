public class Main {
    public static void main(String[] args) {
        Printable[] printables={createObject("House"),createObject("Flat"),createObject("Plat")};
        for (Printable printable :printables) {
            printable.print();
        }
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "House":
                House house=new House("Lenina",3000000,"6 соток",4,"сарай и баня","Свет,водопровод,газ");
            return  house;
            case "Flat":
                Flat flat=new Flat("3mkr",1200000,2,1,"Хрущевка");
                return flat;
            case "Plat":
                Plat plat=new Plat("Золотая осень",560000,"1 гектар,=","для сельского хозяйства");
                return plat;
        }
           return null;

    }
}
