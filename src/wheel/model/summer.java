package wheel.model;

/**
 * Created by Kevin on 07.11.2016.
 */
public class summer extends wheel {
    private int diameterSteel;
    //1. default constructor
    public summer() {
    }
    //2. constructor with all parameters
    public summer(String name, int cost, int treadDepth, boolean used, int diameterSteel) {
        this.name = name;
        this.cost = cost;
        this.treadDepth = treadDepth;
        this.used = used;
        this.diameterSteel = diameterSteel;
    }

    public int getDiameterSteel() {
        return diameterSteel;
    }
    public void setDiameterSteel(int diameterSteel) {
        this.diameterSteel = diameterSteel;
    }
    //4. equal and hash
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        summer summer = (summer) o;
        if (cost != summer.cost) return false;
        if (treadDepth != summer.treadDepth) return false;
        if (used != summer.used) return false;
        if (diameterSteel != summer.diameterSteel) return false;
        return name != null ? name.equals(summer.name) : summer.name == null;
    }
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + cost;
        result = 31 * result + treadDepth;
        result = 31 * result + diameterSteel;
        return result;
    }
    //5. String
    @Override
    public String toString() {
        return "summer{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", treadDepth=" + treadDepth +
                ", used=" + used +
                ", diameterSteel=" + diameterSteel +
                '}';
    }
    public void diameterSteel(String diameter){
        System.out.println("Your diameter for steel wheels is "+diameter);
    }
}
