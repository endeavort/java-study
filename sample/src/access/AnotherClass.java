package access;

import access.entity.SuperClass;

public class AnotherClass {
    public static void main(String[] args) {

        SuperClass superClass = new SuperClass();

        System.out.println(superClass.publicStr);

        // protectedのため、同じパッケージもしくは別パッケージのサブクラス以外からアクセス不可
        // System.out.println(superClass.protectedStr);

        // デフォルト(修飾子なし)のため、同じパッケージ以外からのアクセス不可
        // System.out.println(defaultStr);

        // privateのため、同じクラス以外からアクセス不可
        // System.out.println(privateStr);

    }
}
