package tests;

import static org.junit.jupiter.api.Assertions.*;
import bridge.*;
import org.junit.Test;

public class PowerAbstractionTest {
    @Test
    public void Method1(){
     // type Loop multiplication, type 1 power
        Power power = new Power(new PowerMethodOne(new MultiplicationForLoop()));
        assertEquals(125, power.powerify(5,3));
        assertEquals(32, power.powerify(2,5));
    }
    @Test
    public void Method2(){
        // type Loop multiplication, type 2 power
        Power power = new Power(new PowerMethodTwo(new MultiplicationForLoop()));
        double a = 3;
        assertEquals(343, power.powerify(7,3));
        assertEquals(256, power.powerify(2,8));
    }
    @Test
    public void Method3(){
        // type Simple multiplication, type 1 power
        Power power = new Power(new PowerMethodOne(new MultiplicationSimpleMethod()));
        assertEquals(64, power.powerify(4,3));
        assertEquals(512, power.powerify(2,9));
    }
    @Test
    public void Method4(){
        // type Simple multiplication, type 2 power
        Power power = new Power(new PowerMethodTwo(new MultiplicationSimpleMethod()));
        assertEquals(7776, power.powerify(6,5));
        assertEquals(1024, power.powerify(2,10));
    }
}