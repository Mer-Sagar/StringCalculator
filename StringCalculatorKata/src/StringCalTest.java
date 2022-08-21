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


}
