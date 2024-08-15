//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import Strategy_Design_Pattern.NormalVehicle;
import Strategy_Design_Pattern.SportsVehicle;
import Strategy_Design_Pattern.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new NormalVehicle();
        vehicle.drive();
    }
}