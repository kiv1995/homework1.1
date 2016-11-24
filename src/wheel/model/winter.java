package wheel.model;

/**
 * Created by Kevin on 07.11.2016.
 */
public class winter extends wheel {
    private int diameterAlu;
    //1. default constructor
    public winter() {
    }
    //2. constructor with all parameters
    public winter(String name, int cost, int treadDepth, boolean used, int diameterAlu) {
        this.name = name;
        this.cost = cost;
        this.treadDepth = treadDepth;
        this.used = used;
        this.diameterAlu = diameterAlu;
    }
    //3. getter and setter
    public int getDiameterAlu() {
        return diameterAlu;
    }
    public void setDiameterAlu(int diameterAlu) {
        this.diameterAlu = diameterAlu;
    }
    //4. equal and hash
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        winter winter = (winter) o;
        if (cost != winter.cost) return false;
        if (treadDepth != winter.treadDepth) return false;
        if (used != winter.used) return false;
        if (diameterAlu != winter.diameterAlu) return false;
        return name != null ? name.equals(winter.name) : winter.name == null;
    }
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + cost;
        result = 31 * result + treadDepth;
        result = 31 * result + diameterAlu;
        return result;
    }
    //5. toString
    @Override
    public String toString() {
        return "winter{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", treadDepth=" + treadDepth +
                ", used=" + used +
                ", diameterAlu=" + diameterAlu +
                '}';
    }
    public void diameterAlu(String diameter){
        System.out.println("Your diameter for alu wheels is "+diameter);
    }
}
