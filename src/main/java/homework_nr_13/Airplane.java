package homework_nr_13;

public class Airplane {
    
    String manufacturer;
    String model;
    Integer nrOfEngines;
    
    
    public Airplane() {
    
    }
    
    public Airplane(String manufacturer, String model, int nrOfEngines) throws Exception {
        if (manufacturer.isEmpty() || manufacturer == null)
            throw new InvalidManufacturerException("Invalid manufacturer name!");
        this.manufacturer = manufacturer;
        
        if (model.isEmpty() || model == null) throw new InvalidModelException("Invalid model name!");
        this.model = model;
        
        if (nrOfEngines < 0) throw new InvalidNrOfEnginesException("Invalid number of engines!");
        this.nrOfEngines = nrOfEngines;
    }
    
    private static Airplane createAirPlaneLBYL(String manufacturer, String model, int nrOfEngines) throws Exception {
        if (manufacturer.isEmpty() || manufacturer == null) {
            throw new Exception();
        }
        if (model.isEmpty() || model == null) {
            throw new Exception();
        }
        if (nrOfEngines <= 0) {
            
            throw new Exception();
        }
        try {
            return new Airplane(manufacturer, model, nrOfEngines);
        } catch (Exception e) {
            System.out.println("Fail!");
            return new Airplane();
        }
    }
    
    public static void main(String[] args) {
        
        try {
            Airplane plane1 = createAirPlaneLBYL("Boieng", "", 5);
            System.out.println(plane1.toString());
        } catch (Exception e) {
            System.out.println("Creating a new airplane failed, please try again!");
        }
        Airplane plane2 = createAirPlaneEAFP("Boieng", "666", -1);
    }
    
    public static Airplane createAirPlaneEAFP(String manufacturer, String model, int nrOfEngines) {
        try {
            return new Airplane(manufacturer, model, nrOfEngines);
        } catch (Exception message) {
            System.out.println("Creating a new airplane failed, please try again!");
            return new Airplane();
        }
    }
    
    @Override
    public String toString() {
        return "Airplane{" + manufacturer + ", " + model + ", " + ",nrOfEngines=" + nrOfEngines + '}';
    }
    
    
}