package rpg;

public class App {
    public static void main(String[] args) {
        // インスタンス新規作成
        Character wizard = new Character();
        // System.out.println(wizard);

        // フィールドにデータを代入
        wizard.name = "アリス";
        wizard.job = "wizard";
        wizard.hp = 30;
        // System.out.println(wizard.name);
        // System.out.println(wizard.job);
        // System.out.println(wizard.hp);

        // warriorインスタンスを生成
        Character warrior = new Character();
        warrior.name = "ボブ";
        warrior.job = "warrior";
        warrior.hp = 50;
        // System.out.println(warrior.name);
        // System.out.println(warrior.job);
        // System.out.println(warrior.hp);

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