package counterside.optimizer.types.gear;

import java.util.List;
import java.util.Map;

import counterside.optimizer.types.Rarity;
import counterside.optimizer.types.unit.EmployeeType;
import lombok.Data;

@Data
public class Gear {
    private String name;
    private EmployeeType employeeType;
    private GearCategory category;
    private String imageUri;
    private GearSlot slot;
    private int tier;
    private List<Rarity> rarities;
    private GearStat primaryStat;
    private Map<Rarity,GearGrowth> primaryStatGrowthByRarity;
    private List<GearStat> substat1Options;
    private Map<Rarity, Map<GearStat,GearTuningRange>> substat1RangeByRarity;
    private List<GearStat> substat2Options;
    private Map<Rarity, Map<GearStat,GearTuningRange>> substat2RangeByRarity;
    private List<GearSet> setOptions;    
}
