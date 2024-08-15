package Strategy_Design_Pattern;

import Strategy_Design_Pattern.Strategy.NormalDriveStrategy;
import Strategy_Design_Pattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super (new SportsDriveStrategy());
    }
}
