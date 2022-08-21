import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalTest
{

    @Test
    public void shouldReturnZero()
    {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void shouldReturnOne()
    {
        assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void shouldReturnSumOfTwo()
    {
        assertEquals(1+2, StringCalculator.CalculateSumOfTwo("1,2"));
    }

}
