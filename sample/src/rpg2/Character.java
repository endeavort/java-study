package rpg2;

public class Character {

    // フィールド:クラスの中でデータの値を保管するために使用
    public String name;
    public String job;
    public int hp;
    public int mp;
    public int level;
    public int exp;
    public int attackPower;
    public int defencePower;

    // 初期化ブロック
    {
        level = 1;
    }

    // コンストラクタ①
    public Character(String name) {
        this.name = name;
        this.level = 1;
        this.exp = 0;
    }

    // コンストラクタ②
    public Character(String name, String job) {
        System.out.print("<<キャラクタ新規作成>>");
        this.name = name;
        this.job = job;
        this.hp = 50;
        System.out.println("Name:" + this.name + " Job:" + this.job + " HP:" + this.hp);
    }

    // インスタンスメソッドだとthisではアクセスできないので、クラスメソッドで定義する
    public void walk(String direction) {
        String message = this.name + " move to " + direction;
        System.err.println(message);
    }

    public void talk(Character character, String message) {
        message = character.name + "!" + message;
        System.out.println(message);

    }

    public void status(Character character) {
        System.out.println("=========================");
        System.out.println("Name:" + this.name);
        System.out.println("Job:" + this.job);
        System.out.println("HP:" + this.hp);
        System.out.println("MP:" + this.mp);
        System.out.println("Level:" + this.level);
        System.out.println("Exp:" + this.exp);
        System.out.println("AP:" + this.attackPower);
        System.out.println("DP:" + this.defencePower);
        System.out.println("=========================");
    }

    public void attack(Character character) {
        int damage = 5;
        character.hp -= damage;
        System.out.println(character + "に" + damage + "のダメージ!");
    }
}
