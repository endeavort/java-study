package access.entity;

public class SuperClass {
    // public:全ての外部ファイルからアクセス可能
    public static String publicStr = "publicのフィールドです。";
    // protected:同じパッケージ内、別パッケージのサブクラスはアクセス可能
    protected static String protectedStr = "protectedのフィールドです。";
    // デフォルト(記述なし):同じパッケージ内のみアクセス可能
    static String defaultStr = "defaultのフィールドです。";
    // private:同じクラス内のみアクセス可能
    private static String privateStr = "privateのフィールドです。";

    public static void main(String[] args) {

        System.out.println(publicStr);
        System.out.println(protectedStr);
        System.out.println(defaultStr);
        System.out.println(privateStr);

    }
}
