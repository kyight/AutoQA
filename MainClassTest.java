import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    MainClass getClassStringForTest = new MainClass();

    @Test
    public void testGetClassString() {
        String actual = getClassStringForTest.getClassString();


        if (actual.contains("hello")) {
            Assert.assertTrue("В подстроке нет слова hello", actual.contains("hello"));

        }
        if (actual.contains("Hello")) {
            Assert.assertTrue("В подстроке нет слова Hello", actual.contains("Hello"));

        } else Assert.fail("нет Hello или hello в переданном сообщении");


    }
}