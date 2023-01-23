import jp.ac.uryukyu.ie.e225724.*;

public class Main {
    public static void main(String[] args) {
        Roulette value = new Roulette();//Rouletteのインスタンスの作成
        TypingCharacter number = new TypingCharacter();//TypingCharacterのインスタンス作成
        int num = number.getNumber();//標準出力の数字を取り出している
        value.setMaxValue(num);//標準出力から得られた数字をRouletteのフィールドに代入する
        int result = value.getIntRouletteValue();//ランダムに数を取り出す
        System.out.println(result);
    }
}

