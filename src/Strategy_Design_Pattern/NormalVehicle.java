package Strategy_Design_Pattern;

import Strategy_Design_Pattern.Strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{
    public NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
