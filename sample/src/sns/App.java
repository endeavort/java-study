package sns;

import sns.entity.User;

public class App {

    public static void main(String[] args) {
        User user = new User();
        user.setName("東京　太郎");
        user.setAddress("東京");
        user.setEmail("test@test.com");
        user.setPassword("password");

        System.out.println(user.getName());
        // System.out.println(user.getAddress());
        // System.out.println(user.getEmail());
        // System.out.println(user.getPassword());
    }

}