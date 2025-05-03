package _24_Design_Patterns._5_Creational_Patterns.Factory_Method_Pattern;

// apply Factory Method Pattern + Open/Closed Principle

// Description:
// Factory Method is a creational design pattern that provides an interface for creating objects in a superclass,
// but allows subclasses to alter the type of objects that will be created.

public class Factory_Method_Pattern {
    interface Vehicle {
        Vehicle createVehicle();
    }

    class Car implements Vehicle {
        @Override
        public Vehicle createVehicle() {
            return new Car();
        }
    }

    class Truck implements Vehicle {
        @Override
        public Vehicle createVehicle() {
            return new Truck();
        }
    }

    interface VehicleFactory {
        Vehicle createVehicle();
    }

    class CarFactory implements VehicleFactory {
        @Override
        public Vehicle createVehicle() {
            return new Car().createVehicle();
        }
    }

    class TruckFactory implements VehicleFactory {
        @Override
        public Vehicle createVehicle() {
            return new Truck().createVehicle();
        }
    }
}
