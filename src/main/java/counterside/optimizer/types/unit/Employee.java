package counterside.optimizer.types.unit;

import java.util.List;

import counterside.optimizer.types.Rarity;

public class Employee extends Unit {
    private int deploymentCost;
    private int multiUnitCount;
    private Rarity rarity;
    private LimitBreakLevel limitBreakLevel;
    private boolean maxLoyalty;
    private Skill basicSkill;
    private List<Skill> passiveSkills;
    private Skill specialSkill;
    private Skill ultimateSkill;
    private String faction;
    public int getDeploymentCost() {
        return deploymentCost;
    }
    public void setDeploymentCost(int deploymentCost) {
        this.deploymentCost = deploymentCost;
    }
    public int getMultiUnitCount() {
        return multiUnitCount;
    }
    public void setMultiUnitCount(int multiUnitCount) {
        this.multiUnitCount = multiUnitCount;
    }
    public Rarity getRarity() {
        return rarity;
    }
    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }
    public LimitBreakLevel getLimitBreakLevel() {
        return limitBreakLevel;
    }
    public void setLimitBreakLevel(LimitBreakLevel limitBreakLevel) {
        this.limitBreakLevel = limitBreakLevel;
    }
    public boolean isMaxLoyalty() {
        return maxLoyalty;
    }
    public void setMaxLoyalty(boolean maxLoyalty) {
        this.maxLoyalty = maxLoyalty;
    }
    public Skill getBasicSkill() {
        return basicSkill;
    }
    public void setBasicSkill(Skill basicSkill) {
        this.basicSkill = basicSkill;
    }
    public List<Skill> getPassiveSkills() {
        return passiveSkills;
    }
    public void setPassiveSkills(List<Skill> passiveSkills) {
        this.passiveSkills = passiveSkills;
    }
    public Skill getSpecialSkill() {
        return specialSkill;
    }
    public void setSpecialSkill(Skill specialSkill) {
        this.specialSkill = specialSkill;
    }
    public Skill getUltimateSkill() {
        return ultimateSkill;
    }
    public void setUltimateSkill(Skill ultimateSkill) {
        this.ultimateSkill = ultimateSkill;
    }
    public String getFaction() {
        return faction;
    }
    public void setFaction(String faction) {
        this.faction = faction;
    }
}
