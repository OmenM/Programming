public class Moon {
    private Planet planet;
    private int orbitTime = 0;
    private boolean atmosphere ;
    private String designation ;


   Moon(planet Planet,int orbitTime,boolean atmosphere,String designation){
       this.planet = Planet;
       this.orbitTime = orbitTime;
       this.atmosphere = atmosphere;
       this.designation = designation;
   }

    public void setAtmosphere(boolean atmosphere) {
        this.atmosphere = atmosphere;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }
}
