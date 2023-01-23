package jp.ac.uryukyu.ie.e225724;

import java.util.Scanner;
import java.io.*;

//ルーレットの数を設定する標準出力
public class TypingCharacter {
    public int getNumber() {
        Scanner scanner = new Scanner(System.in);//標準出力を行う
        System.out.println("ルーレットの説明");
        System.out.println();
        System.out.println("あなたが好きな数字を選択してください");
        System.out.println("1からあなたが選んだ数字がランダムに表示されます");
        System.out.println();
        System.out.println("ルーレットの数を設定してください");
        try {
            int number = scanner.nextInt();//int型に変換している
            return number;
        }catch (Exception e) {//String型が入寮された場合の例外
            System.out.println("数字が入力されていません。"); 
            e.printStackTrace();//エラー詳細
            return 0;
        }
    }
}
