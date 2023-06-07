package rpg2;

import java.util.Random;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name);
        this.job = "warrior";
        this.hp = 50;
        this.mp = 0;
        this.attackPower = 7;
        this.defencePower = 3;
    }

    // Override：スーパークラスのメソッドを上書きしたり、機能追加して実行できる
    @Override
    public void attack(Character character) {

        int attackPower = this.attackPower;

        // 1/5の確率で攻撃力を2倍
        Random rand = new Random();
        if (rand.nextInt(5) == 0)
            this.attackPower = attackPower * 2;

        super.attack(character);

        this.attackPower = attackPower;
    }
}