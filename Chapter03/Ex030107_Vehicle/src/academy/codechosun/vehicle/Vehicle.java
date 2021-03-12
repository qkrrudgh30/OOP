package academy.codechosun.vehicle;

import java.util.ArrayList;

public class Vehicle {
    public VehicleType type;
    public ArrayList<Passenger> passengers;
    public double fuelAmount;
    public int mileage;

    public Vehicle(VehicleType type) {
        this(type, new ArrayList<Passenger>(), 0.0);
    }

    public Vehicle(VehicleType type, ArrayList<Passenger> passengets) {
        this(type, passengets, 0.0);
    }

    public Vehicle(VehicleType type, double fuelAmount) {
        this(type, new ArrayList<Passenger>(), fuelAmount);
    }

    public Vehicle(VehicleType type, ArrayList<Passenger> passengers, double fuelAmount) {
        this.type = type;
        this.passengers = passengers;
        this.fuelAmount = fuelAmount;
        this.mileage = 0;
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public void removePassenger(String name) {
        for (Passenger p : this.passengers) {
            if (p.name.equals(name)) {
                this.passengers.remove(p);
                break;
            }
        }
    }

    public void addFuel(double fuelAmount) {
        this.fuelAmount += fuelAmount;
    }

    public void drive(int distance) {
        System.out.printf("Traveling %dkm%s", distance, System.lineSeparator());

        double gasMileage = 100000.0;

        switch (this.type) {
            case MOTORCYCLE:
                gasMileage = 0.05;
                break;

            case SEDAN:
                gasMileage = 0.07;
                break;
            case MINIVAN:
                gasMileage = 0.1;
                break;
            default:
                assert (false) : "Unrecognized vehicle type: " + this.type;
                break;

        }

        double requiredFuel = gasMileage * distance + this.passengers.size() * 0.01;

        if (requiredFuel > this.fuelAmount) {
            System.out.println("Not enough fuel to travel that far!");
            return;
        }

        this.fuelAmount -= requiredFuel;
        this.mileage += distance;

        System.out.printf("FuelAmount: %.2fL.%s", this.fuelAmount, System.lineSeparator());
        System.out.printf("Mileage: %dkm.%s", this.mileage, System.lineSeparator());

    }

}



