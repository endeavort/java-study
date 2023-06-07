package rpg2;

public class App {
    public static void main(String[] args) {

        // コンストラクタに設定した数の引数を渡す
        // Wizard wizard = new Wizard("アリス");
        Warrior warrior = new Warrior("ボブ");

        // wizard.status(wizard);
        warrior.status(warrior);

        Monster slime = new Monster("スライム");

        for (int i = 0; i < 10; i++) {
            slime.status(slime);
            warrior.attack(slime);
        }

    }
}