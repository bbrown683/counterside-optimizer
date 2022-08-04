package counterside.optimizer.types.unit;

import java.util.List;

public class Skill {
    private String name;
    private Integer validHits;
    private List<Damage> damageInstances;
    private List<Buff> buffs;
    private List<Debuff> debuffs;
    private Integer cooldown;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getValidHits() {
        return validHits;
    }
    public void setValidHits(int validHits) {
        this.validHits = validHits;
    }
    public List<Damage> getDamageInstances() {
        return damageInstances;
    }
    public void setDamageInstances(List<Damage> damageInstances) {
        this.damageInstances = damageInstances;
    }
    public List<Buff> getBuffs() {
        return buffs;
    }
    public void setBuffs(List<Buff> buffs) {
        this.buffs = buffs;
    }
    public List<Debuff> getDebuffs() {
        return debuffs;
    }
    public void setDebuffs(List<Debuff> debuffs) {
        this.debuffs = debuffs;
    }
}
