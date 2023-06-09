package sample;

public class throwApp {
    public static void main(String[] args) {
        int score = 100;
        int count = -1;
        float average = 0;

        average = calculateAverage(score, count);
        System.out.println(average);
    }

    public static float calculateAverage(int score, int count) {
        try {
            if (count < 0) {
                // throw:0未満の時はIllegalArgumentException()エラーを発生させる
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("個数がマイナスです。");
            return 0;
        }
        if (count > 0) {
            return (float) score / count;
        } else {
            System.out.println("個数が間違っています。");
            return 0;
        }
    }
}
