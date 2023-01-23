package jp.ac.uryukyu.ie.e225724;

import javax.swing.*;//swingはGUIコンポネートでフレームやボタンを作る
import java.awt.*;//awtはGUIアプリケーションを作成するためのクラスライブラリ

public class ContentDisplay extends JFrame {//JFrameはswingのサブラクラスで、フレームの作成を行う
    /*このクラスは、ルーレットの詳細説明を行う。 */
    private String gameInfo = "<html>1.ルーレットの数を設定します。2.Enterキーを入力するとルーレットが開始します。";
    JFrame jframe;
    JLabel jLabel = new JLabel();//フレームのラベル作成を行う

    private StringBuilder buf = new StringBuilder();//StringBuilderメソッドはそれぞれ与えられたデータを効率的に文字列に変換し、文字列中の文字を文字列ビルダーに追加または挿入します

    public ContentDisplay() {
		this.setTitle("ルーレットの説明");
		this.setLayout(new FlowLayout());
		this.setSize(500, 300); // フレームのサイズを指定
		this.setResizable(false); // フレームのResizeを禁止
		this.setLocationRelativeTo(null); // フレームの表示位置を中央に
		this.setVisible(true); // フレームの表示・非表示を指定
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ×を押した時の処理
    }

    public void setLetter() {
        StringBuilder showLetter = new StringBuilder();
        showLetter.append(gameInfo);

        jLabel.setText(showLetter.toString());//toStringメソッドはオブジェクトをテキストで表すための文字列を返すメソッドです。

        this.add(jLabel);
        this.repaint();//repaint()は、引数になにも指定しなかった場合、早急にコンポーネントのupdate()を呼び出します
    }


}
