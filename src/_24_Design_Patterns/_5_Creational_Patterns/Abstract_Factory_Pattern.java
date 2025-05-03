package _24_Design_Patterns._5_Creational_Patterns;

// Description:
// Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.

// Abstract Factory Pattern always works with some Factory Method Pattern.

public class Abstract_Factory_Pattern {
    interface Vehicle {
        Vehicle createVehicle();
    }

    interface Environment {
        Environment createEnvironment();
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

    class Road implements Environment {
        @Override
        public Environment createEnvironment() {
            return new Road();
        }
    }

    class Water implements Environment {
        @Override
        public Environment createEnvironment() {
            return new Water();
        }
    }

    interface VehicleFactory {
        Vehicle createVehicle();
    }

    interface EnvironmentFactory {
        Environment createEnvironment();
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

    class RoadFactory implements EnvironmentFactory {
        @Override
        public Environment createEnvironment() {
            return new Road().createEnvironment();
        }
    }

    class WaterFactory implements EnvironmentFactory {
        @Override
        public Environment createEnvironment() {
            return new Water().createEnvironment();
        }
    }

    interface AbstractFactory {
        void createVehicleAndEnvironment();
    }

    class CarRoadFactory implements AbstractFactory {
        private VehicleFactory vehicleFactory;
        private EnvironmentFactory environmentFactory;

        public CarRoadFactory(VehicleFactory vehicleFactory, EnvironmentFactory environmentFactory) {
            this.vehicleFactory = vehicleFactory;
            this.environmentFactory = environmentFactory;
        }

        @Override
        public void createVehicleAndEnvironment() {
            Vehicle vehicle = vehicleFactory.createVehicle();
            Environment environment = environmentFactory.createEnvironment();
            System.out.println("Vehicle created: " + vehicle.getClass().getSimpleName());
            System.out.println("Environment created: " + environment.getClass().getSimpleName());
        }
    }

    class TruckWaterFactory implements AbstractFactory {
        private VehicleFactory vehicleFactory;
        private EnvironmentFactory environmentFactory;

        public TruckWaterFactory(VehicleFactory vehicleFactory, EnvironmentFactory environmentFactory) {
            this.vehicleFactory = vehicleFactory;
            this.environmentFactory = environmentFactory;
        }

        @Override
        public void createVehicleAndEnvironment() {
            Vehicle vehicle = vehicleFactory.createVehicle();
            Environment environment = environmentFactory.createEnvironment();
            System.out.println("Vehicle created: " + vehicle.getClass().getSimpleName());
            System.out.println("Environment created: " + environment.getClass().getSimpleName());
        }
    }
}
