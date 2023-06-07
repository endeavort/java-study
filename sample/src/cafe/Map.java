package cafe;

import java.util.HashMap;

public class Map {
    // Map:キーと値で構成されたインターフェース（抽象的なため、実装が必要）
    // → HashMapなどで実装することで辞書型の配列として利用可能

    public static void main(String[] args) {
        HashMap<String, Drink> drinkMap = new HashMap<>();

        drinkMap.put("D0001", new Drink("コーヒー", 350)); // put:Mapに追加
        drinkMap.put("D0002", new Drink("紅茶", 400));
        drinkMap.put("D0003", new Drink("ほうじ茶", 300));

        for (String key : drinkMap.keySet()) { // keySet:全てのキーを取得
            System.out.println(key);
        }

        for (Drink drink : drinkMap.values()) { // values:全ての値を取得
            System.out.println(drink.name);
        }

        Drink selectDrink = drinkMap.get("D0001"); // get:キーを指定して値を取得
        System.out.println(selectDrink.name);

        int count = drinkMap.size(); // size:データ数の取得
        System.out.println(count);

        drinkMap.remove("D0001");// remove:キーを指定して値を削除
        System.out.println("======== remove ========");
        for (Drink drink : drinkMap.values()) {
            System.out.println(drink.name);
        }
    }

}
