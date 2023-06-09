package sample;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileLoadApp {

    public static void main(String[] args) {
        String path = "sample/data/sample.txt";
        loadFile(path);

        // throwsの場合はtry-catchが必要
        try {
            loadFile2(path);
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが開けませんでした。");
        } catch (IOException e) {
            System.out.println("処理が終了しました");
        }
    }

    public static void loadFile(String path) {
        try {
            // FileInputStream:外部ファイルを開くためのクラス
            FileInputStream file = new FileInputStream(path);

            // InputStreamReader(file, encode):ファイルを読み込むクラス, file=開くファイル, encode=文字エンコード
            InputStreamReader reader = new InputStreamReader(file, "UTF-8");

            System.out.println("ファイルを開きました。");

            // BufferedReader:InputStreamReaderからデータを行単位で読み込む
            BufferedReader buffer = new BufferedReader(reader);

            // 文字がなくなるまで繰り返し出力
            String line;
            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
            }

            // 最後に全てcloseする
            buffer.close();
            reader.close();
            file.close();

            // FileNotFoundException:指定したファイルが開けないエラー
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが開けませんでした。");

            // IOException:なんらかの入出力例外
        } catch (IOException e) {
            System.out.println("ファイル読み込みエラー");

        } finally {
            System.out.println("処理が終了しました");
        }
    }

    public static void loadFile2(String path)
            // throws:例外発生時に呼び出し元に例外を投げる
            throws FileNotFoundException, IOException {

        FileInputStream file = new FileInputStream(path);
        InputStreamReader reader = new InputStreamReader(file, "UTF-8");
        System.out.println("ファイルを開きました。");

        BufferedReader buffer = new BufferedReader(reader);

        String line;
        while ((line = buffer.readLine()) != null) {
            System.out.println(line);
        }

        buffer.close();
        reader.close();
        file.close();
    }

}