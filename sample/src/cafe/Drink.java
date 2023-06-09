package cafe;

public class Drink {
    public String name;
    public Integer price;

    // Size型のプロパティ
    public Size size;

    // コンストラクタにsiza追加
    public Drink(String name, Integer price, Size size) {
        super();
        this.name = name;
        this.price = price;
        this.size = size;
    }
}
