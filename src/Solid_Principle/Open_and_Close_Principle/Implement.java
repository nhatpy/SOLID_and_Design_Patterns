package Solid_Principle.Open_and_Close_Principle;

public class Implement {
    public static void main(String[] args) {
        // PlugWithoutO is a class that represents a plug for an electrical device. It
        // has a constructor that takes the name of the equipment and its voltage as
        // parameters. The class has methods
        // Currently, the class only supports 220V voltag. In the future, if we want to
        // add support for 110V, we must modify directly int the class.
        // You can see that changes in the class
        PlugWithoutO plug = new PlugWithoutO("Fridge");
        plug.PlugIn(220);
        PlugWithoutO plug2 = new PlugWithoutO("Laptop");
        plug2.PlugIn(110);

        // To follow the Open/Closed Principle, we can create an interface called
        // EquipmentVoltageManager that defines a method called plugIn. This interface
        // can
        // be implemented by different classes that handle the voltage for different
        // equipment. This way, we can add new equipment with different voltage
        // requirements without modifying the existing code.
        Equipment110V equipment110V = new Equipment110V("Laptop");
        Equipment220V equipment220V = new Equipment220V("Fridge");
        equipment110V.plugIn(110);
        equipment220V.plugIn(220);
    }
}
