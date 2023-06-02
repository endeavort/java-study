// package:Javaクラスファイルを機能ごとに分類する仕組み(フォルダのようなイメージ)
package item;

import java.util.Arrays; // Arraysクラス

public class Drink {
    public static void main(String[] args) {
        // 変数の定義
        String name;
        int price;
        int amount;
        boolean isSale;

        // Array
        String[] drinks = { "コーヒー", "紅茶", "ほうじ茶" };
        // System.out.println(drinks); // 配列が出力される
        // System.out.println(Arrays.toString(drinks)); // 配列をString型に変換して出力

        // // 2番目の値を取り出す
        String selectDrink = drinks[1];
        // System.out.println(selectDrink);

        // 値の更新
        drinks[1] = "ウーロン茶";
        // System.out.println(Arrays.toString(drinks));
        // エラー発生；要素数より大きい値では代入不可
        // drinks[3] = "オレンジジュース";

        // // 要素数で初期化 ※new（新しくインスタンス化）必須
        int[] numbers = new int[3];
        System.out.println(Arrays.toString(numbers));
        numbers[0] = 50;
        numbers[1] = 70;
        numbers[2] = 80;
        numbers[0] = 90;
        System.out.println(Arrays.toString(numbers));

    }
}