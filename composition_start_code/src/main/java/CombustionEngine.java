public class CombustionEngine implements IEngine {


    private int horsePower;
    private String lastOilChange;

    //constructor
    public CombustionEngine(int horsePower, String lastOilChange){
        this.horsePower = horsePower;
        this.lastOilChange = lastOilChange;
    }



    public int getHorsePower(){
        return horsePower;
    }

    public void setHorsePower(int horsePower){
        this.horsePower = horsePower;
    }

    public String getLastOilChange(){
        return this.lastOilChange;
    }

    public void setLastOilChange(String lastOilChange){
        this.lastOilChange = lastOilChange;
    }







}
