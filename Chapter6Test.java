package chapterFour;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Chapter6Test {

    Chapter6 chapter6 = new Chapter6();

    @Test
    void canCalculatePythagorasTheorem(){
        chapter6.pythagoras(3,4);
        assertEquals(5, chapter6.pythagoras(3,4));
        assertEquals(13, chapter6.pythagoras(5, 12));
        assertEquals(17, chapter6.pythagoras(8, 15));
    }

    @Test
    void canCalculatePowerOfInteger(){
        chapter6.getPowerOfInteger(3, 4);
        assertEquals(81, chapter6.getPowerOfInteger(3,4));
        assertEquals(0,chapter6.getPowerOfInteger(0, 2));
        assertEquals(9, chapter6.getPowerOfInteger(-3, 2));
    }

    @Test
    void canRecogniseMultiplesOf(){
        chapter6.isMultipleOf(24, 2);
        assertEquals(true, chapter6.isMultipleOf(24, 4));
    }

    @Test
    void isEven(){
        assertEquals(true, chapter6.getEvenNumbers(92));
    }

    @Test
    void circleArea(){
        chapter6.getCircleArea(10);
        assertEquals(314.1592653589793, chapter6.getCircleArea(10));
    }
}