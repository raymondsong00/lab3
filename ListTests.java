import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;

public class ListTests {
    @Test 
    public void testFilter() {
        List<String> input1 = new ArrayList<String>();
        CheckerA checkA = new CheckerA();
        input1.add("as");
        input1.add("se");
        input1.add("aeiow");
        assertArrayEquals(new String[] {"as", "aeiow"}, ListExamples.filter(input1, checkA).toArray());
    }

    @Test
    public void testMerge() {
        List<String> input1 = new ArrayList<String>();
        List<String> input2 = new ArrayList<String>();
        input1.add("m");
        input1.add("o");
        input2.add("a");
        input2.add("b");
        input2.add("z");
        assertArrayEquals(new String[] {"a", "b", "m", "o", "z"}, ListExamples.merge(input1, input2).toArray());
    }
}
