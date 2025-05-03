package _24_Design_Patterns._5_Creational_Patterns.Factory_Method_Pattern;

// This is low-level code that apply the Factory Method Pattern but don't violate the Open/Closed Principle
// so I call it a simple factory pattern, but it is not a real factory method pattern in GOF
// I just want to show you how to apply the factory method pattern in a simple way

public class Simple_Factory_Pattern {
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

    class VehicleFactory {
        public Vehicle createVehicle(String type) {
            if (type.equals("car")) {
                return new Car().createVehicle();
            } else if (type.equals("truck")) {
                return new Truck().createVehicle();
            }
            return null;
        }
    }
}
