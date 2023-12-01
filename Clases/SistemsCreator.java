public class SistemsCreator implements CareerCreator {
    @Override
    public Career CreateCareer() {
        return new SistemsDegree();
    } 
}
