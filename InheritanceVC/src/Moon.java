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
}
