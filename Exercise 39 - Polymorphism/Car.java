public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        engine = true;
        this.cylinders = cylinders;
        this.name = name;
        wheels = 4;
    }
    public void startEngine(){
        System.out.println("Car Engine Starting");
    }
    public void accelerate(){
        System.out.println("Car Accelerating");
    }
    public void brake(){
        System.out.println("Car Braking");
    }
    public int getCylinders(){
        return cylinders;
    }
    public String getName(){
        return name;
    }
}
