package sns;

import sns.entity.User;

public class App {

    public static void main(String[] args) {
        User user = new User();

        // privateに直接アクセスできないのでコンパイルエラーになる
        // user.name = "東京 太郎";
        // user.email = "test@example.com";
        // user.password = "pass12345";

        // 新たに作成はできるが、元のデータは操作されない
        user.setName("東京 太郎");
        user.setEmail("test@example.com");
        user.setPassword("pass12345");
    }

}
