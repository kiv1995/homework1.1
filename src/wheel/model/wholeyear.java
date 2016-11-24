package wheel.model;

/**
 * Created by Kevin on 07.11.2016.
 */
public class wholeyear extends wheel{
    private String spikesOrStollen;
    //1. default constructor
    public wholeyear() {
    }
    //2. constructor with all parameters
    public wholeyear(String name, int cost, int treadDepth, boolean used, String spikesOrStollen) {
        this.name = name;
        this.cost = cost;
        this.treadDepth = treadDepth;
        this.used = used;
        this.spikesOrStollen = spikesOrStollen;
    }
    //3. getter and setter
    public String getSpikesOrStollen() {
        return spikesOrStollen;
    }
    public void setSpikesOrStollen(String spikesOrStollen) {
        this.spikesOrStollen = spikesOrStollen;
    }
    //4. equal and hash
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        wholeyear wholeyear = (wholeyear) o;
        if (cost != wholeyear.cost) return false;
        if (treadDepth != wholeyear.treadDepth) return false;
        if (used != wholeyear.used) return false;
        if (name != null ? !name.equals(wholeyear.name) : wholeyear.name != null) return false;
        return spikesOrStollen != null ? spikesOrStollen.equals(wholeyear.spikesOrStollen) : wholeyear.spikesOrStollen == null;
    }
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + cost;
        result = 31 * result + treadDepth;
        result = 31 * result + (spikesOrStollen != null ? spikesOrStollen.hashCode() : 0);
        return result;
    }
    //5. toString
    @Override
    public String toString() {
        return "wholeyear{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", treadDepth=" + treadDepth +
                ", used=" + used +
                ", spikesOrStollen='" + spikesOrStollen + '\'' +
                '}';
    }
    public void area(String text){
        System.out.println("You are driving in the area with "+text);
    }
}
