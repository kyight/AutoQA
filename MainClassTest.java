import org.junit.Assert;
import org.junit.Test;

public class MainClassTest

{
    MainClass getClassNumberForTest = new MainClass();
    @Test
    public void testGetClassNumber()
    {
            int actual = getClassNumberForTest.getClassNumber();
            int expected = 45;
       Assert.assertTrue("Номер класса < 45, проверка не пройдена", expected < actual);

    }

}
