package Solid_Principle.Open_and_Close_Principle;

public class Equipment110V implements EquipmentVoltageManager {
    private String equipmentName;

    public Equipment110V(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    @Override
    public void plugIn(int voltage) {
        if (voltage == 110) {
            System.out.println(equipmentName + " is plugged in at 110V.");
        } else {
            System.out.println(equipmentName + " cannot be plugged in at " + voltage + "V. It requires 110V.");
        }
    }

}
