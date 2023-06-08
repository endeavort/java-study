package cafe;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorApp {
    public static void main(String[] args) {
        // リスト作成
        ArrayList<Drink> drinkList = new ArrayList<>();

        // リストに要素の追加
        drinkList.add(new Drink("コーヒー", 350));
        drinkList.add(new Drink("紅茶", 400));
        drinkList.add(new Drink("ほうじ茶", 300));

        // イテレーター作成
        Iterator<Drink> iterator = drinkList.iterator();

        while (iterator.hasNext()) { // hasNext:次の要素があればTrue
            Drink drink = iterator.next(); // 次の要素を取得
            System.out.println(drink.name);
        }

        // マップ作成
        Map<Integer, Drink> drinkMap = new HashMap<>();

        // マップに要素の追加
        drinkMap.put(1, new Drink("コーヒー", 350));
        drinkMap.put(2, new Drink("紅茶", 400));
        drinkMap.put(3, new Drink("ほうじ茶", 300));

        // キーを取得してイテレーター作成
        Iterator<Integer> mapIterator = drinkMap.keySet().iterator();
        while (mapIterator.hasNext()) {
            Integer key = mapIterator.next();
            System.out.println(key);
        }

        // 値を取得してイテレーター作成
        Iterator<Drink> valueIterator = drinkMap.values().iterator();
        while (valueIterator.hasNext()) {
            Drink drink = valueIterator.next();
            System.out.println("name:" + drink.name + " price:" + drink.price);
        }

        // iterator:片方向に処理
        // ListIterator:両方向から処理できる（逆方向からもできる）

        // イテレーター作成
        ListIterator<Drink> listIterator = drinkList.listIterator();

        // add:next()によって返される要素(ある場合)の直前、およびprevious()によって返される要素(ある場合)の直後に挿入される。
        listIterator.add(new Drink("カフェモカ", 350));

        // 先ほど追加したカフェモカは表示されない
        // while (listIterator.hasNext()) {
        // Drink drink = listIterator.next();
        // System.out.println(drink.name);
        // }

        // previous:1つ前に戻す
        listIterator.previous();

        // 先ほど追加したカフェモカが表示される
        while (listIterator.hasNext()) {
            Drink drink = listIterator.next();
            System.out.println(drink.name);
        }

    }

}
