import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstProgramTest {
    private String[] expectedLines = {
        "I love Java!",
        "a + b = c",
        "7 + 2 = 9",
        "Word at index i: According",
        "Word at index i: to",
        "Word at index i: all",
        "Word at index i: known",
        "Word at index i: laws",
        "Word at index i: of",
        "Word at index i: aviation",
        "My number is greater than or equal to 0",
        "The character A is equal to the character A, and the number 42 is equal to the number 42!",
        "Wait, it doesn't?!"
    };

    @Test
    public void testPrintStatement() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String[] results = outContent.toString().split(System.lineSeparator());

        for (int j = 0; j < results.length; j++) {
            assertEquals(expectedLines[j], results[j]);
        }
    }
}
