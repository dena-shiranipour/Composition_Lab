public class Speedboat extends Vehicle implements IEngine, IWaterVehicle {

        //property
    private boolean needsCrew;
    private String hullType;
    private int horsePower;
    private IEngine engine;

    //constructor
    public Speedboat(float weight, int maxSpeed, int horsePower, boolean needsCrew, String hullType, IEngine engine){
        super(weight, maxSpeed); //we removed fibreglass
        this.hullType = hullType;
        this.needsCrew = needsCrew;
        this.horsePower = horsePower;
        this.engine = engine;
    }




    //methods
    public boolean getNeedsCrew() {
        return needsCrew;
    }

    public void setNeedsCrew(boolean needsCrew) {
        this.needsCrew = needsCrew;
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

//why is the setter in the brackets
// answer:we use a setter bc it is PRIVATE..... its all on a seperate database, not one file.
//where do we actually define the different hull types eg shallow / deep etc?
// for boolean, where do we define the boolean, and do if statement?
//....asnwer: dont need to do that just yet but would be in java file, not test.
////why test...
//answer: to see if acc works....DONT RELY ON ERRORS because might be incorrect 'right' code.therefore it is needed to do tests even for the most basi stuff
