package rpg2;

public class Monster extends Character {

    public Monster(String name) {
        super(name);
        this.hp = 100;
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
