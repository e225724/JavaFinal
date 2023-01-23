package jp.ac.uryukyu.ie.e225724;

import java.util.Random;
import java.io.*;

public class Roulette {

    private int minValue = 0;
    private int maxValue;

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getMaxValue() {
        return this.maxValue;
    }

    /*ルーレットの値を数値として取り出す */
    public int getIntRouletteValue() {
        Random random = new Random();
        try{
        System.out.println(this.minValue+1 + "~" + getMaxValue() + "のルーレットの結果は");
        return random.nextInt(getMaxValue()) + this.minValue;
        }catch(IllegalArgumentException e) {
            System.out.println("0を選ばないでください");
            e.printStackTrace();
            return 0;//何かをリターンしないといけなく仕方なく0をreturnしている
        }
    }
}

