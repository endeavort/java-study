package rpg2;

public class Monster {
    public String name;
    public int hp;
    public int mp;
    public int attackPower;
    public int defencePower;

    public Monster(String name) {
        this.name = name;
        this.hp = 5;
        this.mp = 0;
        this.attackPower = 5;
        this.defencePower = 1;
    }

    public void attack(Character character) {
        int damage = this.attackPower - character.defencePower;
        if (damage > 0)
            character.hp -= damage;
    }
}
