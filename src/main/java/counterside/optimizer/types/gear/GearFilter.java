package counterside.optimizer.types.gear;

import counterside.optimizer.types.Rarity;
import counterside.optimizer.types.unit.EmployeeType;
import lombok.Data;

@Data
public class GearFilter {
    private String name;
    private EmployeeType employeeType;
    private GearSlot gearSlot;
    private int tier;
    private Rarity rarity;
}
