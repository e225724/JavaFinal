package jp.ac.uryukyu.ie.e225724;

import java.lang.NullPointerException;

public class Report5 {
    public static void main(String[] args){
        String str = null;
        try{
            str.length();
        }catch (NullPointerException e) {
            System.out.println("エラーが発生しました。");
            System.out.println(e.getMessage());
        }
    }
}