package rpg;

public class App {
    public static void main(String[] args) {

        // コンストラクタに設定した数の引数を渡す
        Character wizard = new Character("アリス", "wizard");
        Character warrior = new Character("ボブ", "warrior");

        wizard.walk("left");
        wizard.talk(warrior, "勝負しましょう！");

        // 攻撃前のwarriorのHP
        System.out.println(warrior.hp);
        // wizardがwarriorに攻撃
        wizard.attack(warrior);
        // 攻撃後のwarriorのHP
        System.out.println(warrior.hp);
    }
}