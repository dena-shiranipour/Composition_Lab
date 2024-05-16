import java.sql.SQLOutput;

public class Runner {

    public static void main(String[] args) {


        IEngine fastEngine = new CombustionEngine(600, "02/01/2023");
        CargoShip yacht = new Speedboat(1200.0f, 170, 20, "True", "Fibre");

        System.out.println(yacht.getHorsePower());

        IEngine electricEngine = new ElectricEngine(1300, 110);
        yacht.setEngine(electricEngine);

        System.out.println(yacht.getHorsePower());





//        IEngine hondaEngine = new CombustionEngine(99, "01/01/2023");
//        Car jazz = new Car(1100.0f, 160, "hatchback", hondaEngine);
//
//        System.out.println(jazz.getHorsePower());
//
//
//
//        IEngine electricEngine = new ElectricEngine(1000, 100);
//        jazz.setEngine(electricEngine);
//
//        System.out.println(jazz.getHorsePower());


    }

}

