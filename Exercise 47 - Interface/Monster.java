import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(getName());
        list.add(String.valueOf(getHitPoints()));
        list.add(String.valueOf(getStrength()));
        return list;
    }

    @Override
    public void read(List<String> list) {
        if (list != null && list.size() > 0){
            this.name = list.get(0);
            this.hitPoints = Integer.valueOf(list.get(1));
            this.strength = Integer.valueOf(list.get(2));
        }
    }

    @Override
    public String toString(){
        List<String> list = write();
        return "Monster{name='" + list.get(0) + "', hitPoints=" + list.get(1) + ", strength=" + list.get(2) + "'}";
    }
}
