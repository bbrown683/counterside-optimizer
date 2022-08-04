package counterside.optimizer.types.unit;

public class Damage {
    private String description;
    private int attackCoefficient;
    private boolean trueDamage;
    public int getAttackCoefficient() {
        return attackCoefficient;
    }
    public void setAttackCoefficient(int attackCoefficient) {
        this.attackCoefficient = attackCoefficient;
    }
}
