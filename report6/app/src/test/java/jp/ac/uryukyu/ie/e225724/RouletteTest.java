package jp.ac.uryukyu.ie.e225724;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RouletteTest {
    @Test void rouletteHasIntValue(){
        Roulette classUnder = new Roulette();
        classUnder.setMaxValue(10);
        assertEquals(10, classUnder.getMaxValue());//seterrがgetterに反映されているかの確認
       }
}
