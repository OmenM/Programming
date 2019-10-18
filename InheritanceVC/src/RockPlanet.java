public class RockPlanet extends Planet{
    private boolean habitable;

    public RockPlanet(int orbitTime, String designation,boolean habitable) {
        this.habitable = habitable;
    }

    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
