package Mobile;

public class Mobile {

    private String model;
    private String name;
    private int numberOfSims;
    private int memory;
    private int battery;
    private String color;
    public Mobile(String model, String name, int numberOfSims, int memory, int battery, String color){
        this.model = model;
        this.name = name;
        this.numberOfSims = numberOfSims;
        this.memory = memory;
        if(battery>=1 && battery <=100){
            this.battery = battery;
        }else {
           System.out.printf("battery = %d isn't valid value!\n",battery);
           this.battery = 0;
        }
        this.color = color;
    }
    public void chargeBattery(){
        if(battery<100){
            battery++;
        }
    }

    public void setBattery(int battery){
        this.battery = battery;
    }
    public int getBattery(){
        return this.battery;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

    public void setMemory(int memory){
        this.memory = memory;
    }

    public int getMemory(){
        return this.memory;
    }

    public String display(){
        return
        String.format("Model: %s\nName: %s\nNumberOfSims: %d\nMemory: %dGb\nBattery: %d%%\nColor: %s", model, name, numberOfSims, memory, battery,color);
    }

}


