import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Dec2HexTest {

    @Test
    void testValidInput() {
        // Redirect output for assertion
        String[] args = {"15"};
        Dec2Hex.main(args); // Expected output: "Hexadecimal representation is: F"
    }

    @Test
    void testNoInput() {
        String[] args = {};
        Dec2Hex.main(args); // Expected output: Error message about missing input
    }

    @Test
    void testNonIntegerInput() {
        String[] args = {"abc"};
        Dec2Hex.main(args); // Expected output: Error message about invalid input
    }
}
