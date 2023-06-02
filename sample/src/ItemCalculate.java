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

        // 複合演算
        answer = 1 + 2;
        answer += 3;
        answer -= 2;
        answer *= 5;
        answer /= 2;
        // System.out.println(answer);

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
        // System.out.println(amount++ + amount++); // 11 + 10
        amount = 10;
        // System.out.println(++amount + ++amount); // 11 + 12

        // 論理演算
        boolean is_match = false;
        is_match = (price == 100);
        // System.out.println(is_match);
        // 左項と右項が等しくないか
        is_match = (price != 100);
        // 左項が右項より小さいか
        is_match = (price < 100);
        // System.out.println(is_match);
        // 左項が右項以上か
        is_match = (price >= 100);
        // System.out.println(is_match);

        // 同値
        String str1 = "20";
        String str2 = "20";
        int number1 = 20;
        int number2 = 30;

        is_match = (str1 == str2);
        // System.out.println(is_match);
        is_match = (number1 == number2);
        // System.out.println(is_match);

        // 型が違うとコンパイルエラー
        // is_match = (str1 == number1);

        // Integer.parseInt:str → intに変換
        is_match = (Integer.parseInt(str1) == number1);
        // System.err.println(is_match);

        // 三項演算
        // 商品価格
        price = 550;
        // 所持金
        int money = 1000;
        // 値 = (比較演算) ? true のときの値 : false のときの値
        String message1 = (price <= money) ? "購入できます。" : "所持金が足りません";
        System.out.println(message1);
    }
}
