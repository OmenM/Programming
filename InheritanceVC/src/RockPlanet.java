public class RockPlanet extends Planet{
    private boolean habitable;

    RockPlanet(int orbitTime, String designation, boolean habitable ){
        this.habitable = habitable;

    }

    public RockPlanet(boolean habitable) {
        this.habitable = habitable;
    }

}
