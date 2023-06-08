package animal;

public class App {
    public static void main(String[] arg) {

        // 抽象クラスはインスタンス化不可
        // Animal animal = new Animal("太郎");

        Human tarou = new Human("太郎");
        Dog pochi = new Dog("ポチ");

        System.out.println("****太郎の処理****");
        tarou.sleep();
        tarou.eat();
        tarou.speak();

        System.out.println("****ポチの処理****");
        pochi.sleep();
        pochi.eat();
        pochi.speak();
    }
}
