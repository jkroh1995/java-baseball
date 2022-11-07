package baseball;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BallTest {

    @Test
    public void underRangeBall() {
        assertThrows(IllegalArgumentException.class, () -> new Ball(-1));
    }

    @Test
    public void overRangeBall() {
        assertThrows(IllegalArgumentException.class, () -> new Ball(10));
    }

    @Test
    public void validRangeBall() {
        assertDoesNotThrow(() -> new Ball(1));
        assertDoesNotThrow(() -> new Ball(2));
        assertDoesNotThrow(() -> new Ball(3));
        assertDoesNotThrow(() -> new Ball(4));
        assertDoesNotThrow(() -> new Ball(5));
        assertDoesNotThrow(() -> new Ball(6));
        assertDoesNotThrow(() -> new Ball(7));
        assertDoesNotThrow(() -> new Ball(8));
        assertDoesNotThrow(() -> new Ball(9));
    }
}