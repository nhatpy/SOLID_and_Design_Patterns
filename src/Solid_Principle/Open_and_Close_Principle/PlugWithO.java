package Solid_Principle.Open_and_Close_Principle;

public class PlugWithO {
    private String equipment;

    private EquipmentVoltageManager equipmentVoltageManager;

    PlugWithO(String equipment, EquipmentVoltageManager equipmentVoltageManager) {
        this.equipment = equipment;
        this.equipmentVoltageManager = equipmentVoltageManager;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public void plugIn(int voltage) {
        equipmentVoltageManager.plugIn(voltage);
    }
}
