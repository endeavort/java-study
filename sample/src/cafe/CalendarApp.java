package cafe;

import java.util.Map;
import java.util.HashMap;
import java.util.Calendar;
import java.util.Iterator;

public class CalendarApp {

    public static void main(String[] args) {
        Map<Integer, String> weekdays = new HashMap<>();
        weekdays.put(Calendar.SUNDAY, "日"); // Calendar.SUNDAY == 1
        weekdays.put(Calendar.MONDAY, "月"); // Calendar.MONDAY == 2
        weekdays.put(Calendar.TUESDAY, "火"); // Calendar.TUESDAY == 3
        weekdays.put(Calendar.WEDNESDAY, "水"); // Calendar.WEDNESDAY == 4
        weekdays.put(Calendar.THURSDAY, "木"); // Calendar.THURSDAY == 5
        weekdays.put(Calendar.FRIDAY, "金"); // Calendar.FRIDAY == 6
        weekdays.put(Calendar.SATURDAY, "土"); // Calendar.SATURDAY == 7

        // キーを取得してイテレーター作成
        Iterator<Integer> weekKeyIterator = weekdays.keySet().iterator();
        while (weekKeyIterator.hasNext()) {
            Integer key = weekKeyIterator.next();
            System.out.println(key);
        }

        // 値を取得してイテレーター作成
        Iterator<String> weekValueIterator = weekdays.values().iterator();
        while (weekValueIterator.hasNext()) {
            String weekday = weekValueIterator.next();
            System.out.println(weekday);
        }

    }
}
