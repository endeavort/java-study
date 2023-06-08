package animal;

// abstract:抽象クラスの設定
// 抽象クラスを直接インスタンス化はできないが、共通処理を定義することができる
public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    // 共通メソッド
    public void sleep() {
        System.out.println("寝る");
    }

    // 抽象メソッドは実装不可
    // public abstract void sleep1() {
    // System.out.println("寝る");
    // }

    // 抽象メソッド(テスト用)
    // これを記述すると具象クラスでsleep2をオーバーライドしろというエラー発生
    // public abstract void sleep2();

    // 抽象メソッド:そのまま実装できないので具象クラスでオーバライドする必要あり
    public abstract void speak();

    // 抽象メソッド
    public abstract void eat();
}
