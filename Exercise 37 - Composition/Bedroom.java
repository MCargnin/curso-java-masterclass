public class Bedroom {
    private String name;
    private WallArea wall1;
    private WallArea wall2;
    private WallArea wall3;
    private WallArea wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, WallArea wall1, WallArea wall2, WallArea wall3, WallArea wall4, Ceiling ceiling, Bed bed, Lamp lamp){
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp(){
        return lamp;
    }
    public void makeBed(){
        System.out.println("Bed is being made");
        bed.make();
    }
}