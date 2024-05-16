public class Kayak extends Vehicle implements IWaterVehicle {


    //properties
    private int numberOfPaddles;
    private String hullType;

    //constructor
    public Kayak(float weight, int maxSpeed, String hullType){
        super(weight, maxSpeed);
        this.numberOfPaddles = 1;
        this.hullType = hullType;
    }

    //methods
    public int getNumberOfPaddles() {
        return numberOfPaddles;
    }

    public void setNumberOfPaddles(int numberOfPaddles) {
        this.numberOfPaddles = numberOfPaddles;
    }

    public String getHullType(){
        return this.hullType;
    }

    public void setHullType(String HullType){
        this.hullType = hullType;
    }


}
