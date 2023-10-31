package Builder.cars;

import Builder.components.Engine;
import Builder.components.GPSNavigator;
import Builder.components.Transmission;
import Builder.components.TripComputer;

public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final GPSNavigator gpsNavigator;
    private final TripComputer tripComputer;
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator)
    {
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.carType = carType;
        if(this.tripComputer !=null)
        {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    public CarType getCarType()
    {
        return carType;
    }

    public double getFuel()
    {
        return fuel;
    }

    public void setFuel(double fuel)
    {
        this.fuel = fuel;
    }

    public int getSeats()
    {
        return seats;
    }

    public Engine getEngine()
    {
        return engine;
    }

    public Transmission geTransmission()
    {
        return transmission;
    }

    public TripComputer getTripComputer()
    {
        return tripComputer;
    }

    public GPSNavigator geGpsNavigator()
    {
        return gpsNavigator;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }
}

