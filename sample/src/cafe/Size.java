package cafe;

// Enum:複数の定数をひとつにまとめるデータ型
public enum Size {
    LARGE("大"), MEDIUM("中"), SMALL("小");

    private final String value;

    // コンストラクタ追加
    private Size(String value) {
        this.value = value;
    }

    // getter追加
    public String getValue() {
        return this.value;
    }
}
