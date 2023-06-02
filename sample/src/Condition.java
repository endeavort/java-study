import java.util.Calendar; // Calendar クラス

public class Condition {

    public static void main(String[] args) {
        // if
        int price = 100; // 価格
        int maxPrice = 10000000; // 最大価格
        int money = 1000; // 所持金
        String message = ""; // メッセージ

        // ||:OR, &&:AND, !:NOT
        if (price <= 0 || price >= maxPrice) {
            message = "価格が正しくありません。";
        } else if (money >= price) {
            message = "お買い上げありがとうございます。";
        } else {
            message = "所持金が足りません。";
        }
        System.out.println(message);

        // switch
        Calendar cal = Calendar.getInstance(); // 生成時の日付・時刻インスタンス
        // インスタンスから曜日を取得(int型)
        // SUNDAY:1, MONDAY:2, TUESDAY:3, WEDNESDAY:4, THURSDAY:5), FRIDAY:6, SATURDAY:7
        int weekIndex = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(weekIndex);

        String garbage = "";
        switch (weekIndex) {
            case Calendar.MONDAY: // weekIndex == 2 のときと
            case Calendar.FRIDAY: // weekIndex == 6 のとき
                garbage = "燃えるゴミ";
                break;

            case Calendar.WEDNESDAY: // weekIndex == 4 のとき
                garbage = "燃えないゴミ";
                break;

            default: // それ以外
                garbage = "回収なし";
                break;
        }
        System.out.println(garbage);
    }

}
