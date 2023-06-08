package animal2;

// インターフェースは多重継承できる
public abstract class Animal implements IEat, ISpeak {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}
