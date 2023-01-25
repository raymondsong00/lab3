import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTest {
    @Test
    public void LinkedListTester() {
        LinkedList l = new LinkedList();
        l.first();
        l.append(2);
        l.append(1);
        l.prepend(3);
        l.prepend(232);
        l.prepend(2);
        assertEquals(2, l.first());
        assertEquals(1, l.last());
        assertEquals("2 232 3 2 1 ", l.toString());
        assertEquals(5, l.length());
    }
}
