package jp.ac.uryukyu.ie.e225724;

import java.util.Random;
import java.io.*;

//１からプレイヤーが選んだ数字までの数がランダムで出力されるクラス
public class Roulette {

    private int minValue = 1;
    private int maxValue;

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getMaxValue() {
        return this.maxValue;
    }

    /*ルーレットの値を数値として取り出す */
    public int getIntRouletteValue() {
        Random random = new Random();//インスタンス作成
        try{
        System.out.println(this.minValue + "~" + getMaxValue() + "のルーレットの結果は");
        return random.nextInt(getMaxValue()) + this.minValue;
        }catch(IllegalArgumentException e) {//0を標準出力した場合の例外処理
            System.out.println("0を選ばないでください");
            e.printStackTrace();//エラー詳細
            return 0;//int型をリターンしないといけなく仕方なく0をreturnしている
        }
    }
}

