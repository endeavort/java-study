package access;

import access.entity.SuperClass;

public class SubClass extends SuperClass {
    public static void main(String[] args) {
        System.out.println(publicStr);
        System.out.println(protectedStr);

        // デフォルト(修飾子なし)のため、同じパッケージ以外からのアクセス不可
        // System.out.println(defaultStr);

        // privateのため、同じクラス以外からアクセス不可
        // System.out.println(privateStr);

    }

}
