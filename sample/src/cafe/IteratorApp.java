package cafe;

import java.util.ArrayList;
import java.util.Iterator;

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
    }

}
