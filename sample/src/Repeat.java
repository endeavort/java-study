public class Repeat {

    public static void main(String[] args) {
        // for（foriで予測出てくる）
        // 初期値:i = 0, 条件:i < 10の間, iを1ずつ増加
        for (int i = 0; i < 10; i++) {
            // System.out.println(i);
        }

        // forのネスト;10 x10 の座標を表示
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                String plot = "(" + i + ", " + j + ")";
                // System.out.print(plot);
            }
            // System.out.println("");
        }

        // 配列の繰り返し
        String[] drinks = { "コーヒー", "紅茶", "ほうじ茶" };
        // .length:要素数の取得
        for (int i = 0; i < drinks.length; i++) {
            // System.out.println(drinks[i]);
        }

        // foreach:インデックスなしで配列の要素を取得
        for (String drink : drinks) {
            // System.out.println(drink);
        }

        // while
        int currentNumber = 1;
        int maxNumber = 1000;
        int div = 7;
        int index = 0;
        int limit = 5;
        // currentNumber < maxNumberがTrueの間ずっと繰り返す
        while (currentNumber < maxNumber) {
            if (currentNumber % div == 0) {
                // System.out.println(currentNumber);
                index++;
            }
            // break:ループから抜ける（index == limit のときループから抜ける）
            // if (index == limit) {
            // break;
            // }
            currentNumber++;
        }

        // do while:処理をした後に条件を判定
        int i = 0;
        do {
            i++;
        } while (i <= 10);
        // System.out.println("whileの結果:" + i);
    }

}