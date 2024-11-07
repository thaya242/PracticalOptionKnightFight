public class MOB implements Attributes {
    private String name;
    private int maxHP;
    private int armor;
    private int hitModifier;
    private DiceType damageDie;

    public MOB(String name, int maxHP, int armor, int hitModifier, DiceType damageDie) {
        this.name = name;
        this.maxHP = maxHP;
        this.armor = armor;
        this.hitModifier = hitModifier;
        this.damageDie = damageDie;
    }

    @Override
    public int getArmor() {
        return armor;
    }

    @Override
    public int getMaxHP() {
        return maxHP;
    }

    @Override
    public DiceType getDamageDie() {
        return damageDie;
    }

    @Override
    public int getHitModifier() {
        return hitModifier;
    }

    @Override
    public String toString() {
        return String.format("MOB: %s, HP: %d, Armor: %d, Hit Modifier: %d, Damage Die: %s", 
                              name, maxHP, armor, hitModifier, damageDie);
    }

    public static void main(String[] args) {
        MOB mob = new MOB("Orc", 25, 5, 2, DiceType.D6);
        System.out.println(mob);
    }
}
