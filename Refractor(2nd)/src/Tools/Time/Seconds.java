package Tools.Time;

public class Seconds implements Theticker{
    int z;
    public Seconds(){
        z = 0;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Seconds(int z) {
        this.z = z;
    }
    public String toString(){
        if(z < 10){
            return "0"+z;
        }
        else
            return ""+z;
    }
    public void tick(){
        z++;
    }
}
