package homework_nr_12;

public enum FuelTypes {
    
    GASOLINE(true),
    ETHANOL(true),
    LPG(true),
    DIESEL(true),
    PROPANE(false),
    METHANE(false);
    
    public final boolean isLiquidFuel;
    
    FuelTypes(boolean isLiquidFuel) {
        this.isLiquidFuel = isLiquidFuel;
    }
    
    
}