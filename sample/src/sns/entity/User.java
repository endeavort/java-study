package sns.entity;

public class User {

    public String name;
    public String address;
    public String email;
    public String password;

    // ステータス設定コマンド
    // 名前
    public void setName(String name) {
        this.name = name;
    }

    // 出身地
    public void setAddress(String address) {
        this.address = address;
    }

    // メールアドレス
    public void setEmail(String email) {
        this.email = email;
    }

    // パスワード
    public void setPassword(String password) {
        this.password = password;
    }

    // ステータス取得コマンド
    // 名前 → public:全ての外部ファイルからアクセス可能
    public String getName() {
        return name;
    }

    // 出身地 → protected:同じパッケージ内、別パッケージのサブクラスはアクセス可能
    protected String getAddress() {
        return address;
    }

    // メールアドレス → デフォルト(記述なし):同じパッケージ内のみアクセス可能
    String getEmail() {
        return email;
    }

    // パスワード → private:同じクラス内のみアクセス可能
    private String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        User user = new User();
        user.setName("東京　太郎");
        user.setAddress("東京");
        user.setEmail("test@test.com");
        user.setPassword("password");

        System.out.println(user.getName());
        System.out.println(user.getAddress());
        System.out.println(user.getEmail());
        System.out.println(user.getPassword());
    }
}