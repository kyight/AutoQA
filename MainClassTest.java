import org.junit.Assert;
import org.junit.Test;

public class MainClassTest

{
    MainClass getLocalNumberForTest = new MainClass();
    @Test
    public void testGetLocalNumber()
    {
            int actual = getLocalNumberForTest.getLocalNumber();
            int expected = 14;
       Assert.assertTrue("getLocalNumber != 14, проверка не пройдена", expected == actual);

    }

}
