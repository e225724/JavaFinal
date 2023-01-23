package jp.ac.uryukyu.ie.e225724;

import java.util.Random;

public class Roulette extends TypingCharacter{

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
        System.out.println(this.minValue + "~" + getMaxValue() + "のルーレットの結果は");
        return random.nextInt(getMaxValue()) + this.minValue;
    }
}

