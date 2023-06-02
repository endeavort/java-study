public class Method {
    
    // public:全てのクラスからアクセス可能
    // static:インスタンス化せずに使用可能
    // void:戻り値なし
    // main:プログラム本文
    // String[] args:コマンド引数
    public static void main(String[] args) {

        // スタティックメソッドは直接呼び出せる
        Float answer1 = calculate1(2f);
        System.out.println(answer1);

        // クラスメソッドは直接呼び出せない
        Method method2 = new Method();
        Float answer2 = method2.calculate2(2.f);
        System.out.println(answer2);

        // オーバーロードにより、適した関数が自動で呼び出される
        greet("佐藤");
        greet("田中", "晴れ");

    }

    // スタティックメソッド
    // Float:戻り値がFloat型
    public static Float calculate1(Float x) {
        Float y = x + 5;
        return y;
    }

    // クラスメソッド
    public Float calculate2(Float x) {
        Float y = x + 10;
        return y;
    }

    // 引数を2つ以上渡すときはカンマで区切る
    public static int calculateTotalPrice(int price, int amount) {
        int totalPrice = price * amount;
        return totalPrice; 
    }

    // オーバーロード:同じクラスの中で、同じ名前のメソッドを複数定義できる
    // ※引数やデータ型が違う
    public static void greet(String name) {
        String message = name + "さん、こんばんわ"; 
        System.out.println(message);
    }

    public static void greet(String name, String weather) {
        String message = name + "さん。" + "今日は" + weather + "ですね"; 
        System.out.println(message);
    }
}
