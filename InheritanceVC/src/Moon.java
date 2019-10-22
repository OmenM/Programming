import java.util.Objects;

public class Moon {
    private Planet Planet;
    private int orbitTime = 0;
    private boolean atmosphere ;
    private String designation ;


   Moon(Planet Planet,int orbitTime,boolean atmosphere,String designation){
       this.Planet = Planet;
       this.orbitTime = orbitTime;
       this.atmosphere = atmosphere;
       this.designation = designation;
   }

    public void setAtmosphere(boolean atmosphere) {
        this.atmosphere = atmosphere;
    }

    public boolean isAtmosphere() {
        return atmosphere;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public int getOrbitTime() {
        return orbitTime;
    }

    public void setPlanet(Planet planet) {
        this.Planet = planet;
    }

    public Planet getPlanet() {
        return Planet;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moon moon = (Moon) o;
        return orbitTime == moon.orbitTime &&
                atmosphere == moon.atmosphere &&
                Objects.equals(Planet, moon.Planet) &&
                Objects.equals(designation, moon.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Planet, orbitTime, atmosphere, designation);
    }
}
