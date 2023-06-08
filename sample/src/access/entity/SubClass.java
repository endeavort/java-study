package access.entity;

public class SubClass extends SuperClass {
    public static void main(String[] args) {
        System.out.println(publicStr);
        System.out.println(protectedStr);
        System.out.println(defaultStr);

        // privateのため、同じクラス以外からアクセス不可
        // System.out.println(privateStr);

    }

}
