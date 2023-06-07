package rpg2;

public class Wizard extends Character {

    public Wizard(String name) {
        // スーパークラス（親クラス）のコンストラクタを使用
        super(name);

        this.job = "wizard";
        this.hp = 30;
        this.mp = 20;
        this.attackPower = 3;
        this.defencePower = 3;
    }
}
