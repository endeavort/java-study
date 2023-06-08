package animal2;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    // 抽象メソッドをオーバライド
    @Override
    public void speak() {
        System.out.println("私の名前は" + name + "だワン！！");
    }

    // 抽象メソッドをオーバライド
    @Override
    public void eat() {
        System.out.println("ガブガブガブ");
    }
}
