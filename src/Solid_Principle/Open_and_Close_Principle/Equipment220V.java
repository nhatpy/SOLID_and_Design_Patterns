package Solid_Principle.Open_and_Close_Principle;

public class Equipment220V implements EquipmentVoltageManager {
    private String equipmentName;

    public Equipment220V(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    @Override
    public void plugIn(int voltage) {
        if (voltage == 220) {
            System.out.println(equipmentName + " is plugged in at 220V.");
        } else {
            System.out.println(equipmentName + " cannot be plugged in at " + voltage + "V. It requires 220V.");
        }
    }
}
