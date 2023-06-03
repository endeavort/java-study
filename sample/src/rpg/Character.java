package rpg;

public class Character {

    // フィールド:クラスの中でデータの値を保管するために使用
    public String name;
    public String job;
    public int hp;

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
    }
}
