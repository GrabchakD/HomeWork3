package HomeWork3WithTest;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task1Test extends TestCase {

    @Test
    public void testCheckOutputIfInputCorrect() {
        String expected = "Output is correct";
        String actual = Task1.inputCheck("()");
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckOutputIfInputNotCorrect() {
        String expected = "Output isn`t correct";
        String actual = Task1.inputCheck("(}");
        assertEquals(expected, actual);
    }
}