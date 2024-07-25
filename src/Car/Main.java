package Car;

public class Main {
    public static void main(String[] args) {
        Car gv80 = new Car();

        gv80.setConstructor("Genessis");
        gv80.setModel("GV80");
        gv80.setYear(2024);
        gv80.setColor("Red");
        gv80.start();
        gv80.gasPedal(140);
        gv80.carInfo();

        Car LaFerrari = new Car();

        LaFerrari.setConstructor("Ferrari");
        LaFerrari.setModel("LaFerrari");
        LaFerrari.setYear(2009);
        LaFerrari.setColor("Red");
        LaFerrari.start();
        LaFerrari.carInfo();

    }
}
