import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LambaPracticeTest {

    private LambaPractice l = new LambaPractice();
    @Test
    void multiplyListByTwo() {
        assertEquals(List.of(2,4,6,8,10), l.multiplyListElementsByTwo(List.of(1,2,3,4,5)));
    }
}