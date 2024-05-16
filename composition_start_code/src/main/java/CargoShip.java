public class CargoShip extends Vehicle implements IEngine, IWaterVehicle {


    //property
    private int numberOfContainers;
    private String hullType;
    private int horsePower;
    private IEngine engine;

    //constructors
    public CargoShip(float weight, int maxSpeed, int horsePower, String hullType, int numberOfContainers, boolean setEngine){
        super(weight, maxSpeed);
        this.numberOfContainers = numberOfContainers;
        this.hullType = hullType;
        this.horsePower = horsePower;

    }


    //methods
    public int getNumberOfContainers() {
        return numberOfContainers;
    }

    public void setNumberOfContainers(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers;
    }

    public String getHullType(){
        return this.hullType;
    }

    public void setHullType(String hullType){
        this.hullType = hullType;
    }

    public int getHorsePower(){
        return this.horsePower;
    }

    public void setHorsePower(int horsePower){
        this.horsePower = horsePower;
    }

    public IEngine getEngine(){
        return this.engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;

    }

}
