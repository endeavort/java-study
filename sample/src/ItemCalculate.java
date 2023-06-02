public class ItemCalculate {
    public static void main(String[] args) {

        // 四則演算
        int answer = 1 + 2;
        answer = answer + 3;
        answer = answer - 2;
        answer = answer * 5;
        answer = answer / 2;
        // System.out.println("答えは" + answer);
        int mod = answer % 3;
        // System.out.println("余りは" + mod);

        // キャスト:型の変換
        int price = 200;
        float pointRate = 0.05f;
        // price を float にキャスト
        float point = (float) price * pointRate;
        // point を int にキャスト
        // System.out.println((int) point + "pt");

        // 自動キャスト機能もある
        float point_auto = price * pointRate;
        // System.out.println(point_auto + "pt");

        // Stringとintも可能
        String itemName = "コーヒー";
        String message = itemName + "の価格は" + price + "円です。";
        // System.out.println(message);

        // 単項演算
        int amount = 5;
        // amount に 1 足した結果を amount に代入
        amount++;
        // System.out.println(amount);
        // amount から 1 引いた結果を amount に代入
        amount--;
        // System.out.println(amount);

        // 変数の前につけることもでき、値を最初に演算してから処理される
        amount = 10;
        System.out.println(amount++ + amount++); // 11 + 10
        amount = 10;
        System.out.println(++amount + ++amount); // 11 + 12
    }
}
