import jp.ac.uryukyu.ie.e225724.*;

public class Main {
    public static void main(String[] args) {
        Roulette value = new Roulette();
        TypingCharacter number = new TypingCharacter();
        int num = number.getNumber();
        value.setMaxValue(num);
        int result = value.getIntRouletteValue();
        System.out.println(result);
    }
}

