package jp.ac.uryukyu.ie.e225724;

import java.util.Scanner;
import java.io.*;

public class TypingCharacter {
    public int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ルーレットの数を設定してください");
        try {
            int number = scanner.nextInt();
            return number;
        }catch (Exception e) {
            System.out.println("数字が入力されていません。"); 
            e.printStackTrace();
            return 0;
        }
    }
}
