package rpg;

public class Character {

    // フィールド:クラスの中でデータの値を保管するために使用
    public String name;
    public String job;
    public int hp;
    public int level;

    // 初期化ブロック:コンストラクタよりも先に実行される処理
    // オーバロード等でコンストラクタが2つ以上あるときに共通の処理を行える
    {
        level = 1;
    }

    // コンストラクタ
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

    public void attack(Character character) {
        int damage = 5;
        character.hp -= damage;
        System.out.println(character + "に" + damage + "のダメージ!");
    }
}
