package jp.ac.uryukyu.ie.e225724;

import java.util.Random;

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
        return random.nextInt(getMaxValue()) + this.minValue;
    }

    public String getStrRouletteValue() {
        int v = this.getIntRouletteValue();
        return Integer.toString(v);
    }
}
