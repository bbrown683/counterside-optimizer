package counterside.optimizer.types.unit;

import java.util.List;

public abstract class Unit {
    private String name;
    private MovementType movementType;
    private AttackType attackType;
    private List<EmployeeType> employeeType;
    private RoleType roleType;
    private Statistics baseStats;
    private Statistics statGrowth;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public MovementType getMovementType() {
        return movementType;
    }
    public void setMovementType(MovementType movementType) {
        this.movementType = movementType;
    }
    public AttackType getAttackType() {
        return attackType;
    }
    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }
    public List<EmployeeType> getEmployeeType() {
        return employeeType;
    }
    public void setEmployeeType(List<EmployeeType> employeeType) {
        this.employeeType = employeeType;
    }
    public RoleType getRoleType() {
        return roleType;
    }
    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
    public Statistics getBaseStats() {
        return baseStats;
    }
    public void setBaseStats(Statistics baseStats) {
        this.baseStats = baseStats;
    }
    public Statistics getStatGrowth() {
        return statGrowth;
    }
    public void setStatGrowth(Statistics statGrowth) {
        this.statGrowth = statGrowth;
    }
}
