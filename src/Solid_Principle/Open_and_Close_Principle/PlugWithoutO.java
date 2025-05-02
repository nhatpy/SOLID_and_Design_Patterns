package Solid_Principle.Open_and_Close_Principle;

public class PlugWithoutO {
    private String equipment;

    PlugWithoutO(String equipment) {
        this.equipment = equipment;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public void PlugIn(int voltage) {
        if (voltage == 220) {
            System.out.println("Plugging in " + equipment + " with voltage " + voltage + "V.");
        } else if (voltage == 110) {
            System.out.println("Plugging in " + equipment + " with voltage " + voltage +
                    "V.");
        } else {
            System.out.println("Voltage not supported for " + equipment);
        }
    }
}
