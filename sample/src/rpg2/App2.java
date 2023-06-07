package rpg2;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class App2 {

    // List:インターフェース（抽象的なため、実装が必要）
    // → ArrayListやLinkedListなどで実装することで配列として利用可能
    // ArrayList:データアクセス・検索が高速
    // LinkedList:データ追加・削除などが高速

    public static void main(String[] args) {
        // List<Integer> sampleList1 = new ArrayList<Integer>(); //
        // 宣言の型にListを使うとLinkedListに変換したりできる

        // ArrayList<Integer> sampleList2 = new ArrayList<Integer>(); //
        // 宣言の型にArrayListを使うと専用のメソッドが使える

        ArrayList<Character> characterList = new ArrayList<Character>();
        characterList.add(new Wizard("アリス")); // add:リストへ追加
        characterList.add(new Wizard("テリー"));
        characterList.add(new Warrior("ボブ"));

        // 配列の繰り返し
        for (Character character : characterList) {
            System.out.println(character.name);
        }

        int dataCount = characterList.size(); // size:リストの要素数
        System.out.println(dataCount);

        Character selectCharacter = characterList.get(1); // get:インデックス指定の値を取得
        selectCharacter.status(selectCharacter);

        characterList.set(0, new Warrior("スミス")); // set:インデックス指定の値を更新
        for (Character character : characterList) {
            System.out.println(character.name);
        }

        characterList.remove(2); // remove:インデックス指定の値を削除
        System.out.println("======== remove ========");
        for (Character character : characterList) {
            System.out.println(character.name);
        }

        characterList.clear(); // clear:全てのデータを削除
        System.out.println("======== clear ========");
        for (Character character : characterList) {
            System.out.println(character.name);
        }
    }
}
