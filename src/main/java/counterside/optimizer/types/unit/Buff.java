package counterside.optimizer.types.unit;

import java.util.List;

public class Buff {
    private Statistics buff;
    private BuffTarget target;
    private List<EmployeeType> affectedEmployeeTypes;
    public Statistics getBuff() {
        return buff;
    }
    public void setBuff(Statistics buff) {
        this.buff = buff;
    }
    public BuffTarget getTarget() {
        return target;
    }
    public void setTarget(BuffTarget target) {
        this.target = target;
    }
    public List<EmployeeType> getAffectedEmployeeTypes() {
        return affectedEmployeeTypes;
    }
    public void setAffectedEmployeeTypes(List<EmployeeType> affectedEmployeeTypes) {
        this.affectedEmployeeTypes = affectedEmployeeTypes;
    }
}
