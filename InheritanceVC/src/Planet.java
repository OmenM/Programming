import java.util.ArrayList;

public class Planet {
    private int orbitTime = 0;
    private ArrayList<Moon> Moon = new ArrayList<Moon>();
    private String designation ;

    Planet(int orbitTime,String designation){
        this.orbitTime = orbitTime;
        this.designation = designation;

    }

    Planet(){
        designation = null;
        orbitTime = 0;


    }

    public int getOrbitTime() {
        return orbitTime;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setMoon(ArrayList<Moon> moon) {
        Moon = moon;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
