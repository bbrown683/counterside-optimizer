package counterside.optimizer.types.unit;

import java.util.List;

public class Debuff {
    private Statistics debuff;
    private List<EmployeeType> affectedEmployeeTypes;
    public Statistics getDebuff() {
        return debuff;
    }
    public void setDebuff(Statistics debuff) {
        this.debuff = debuff;
    }
}
