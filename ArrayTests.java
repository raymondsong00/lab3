import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  
  @Test
  public void testReversedNums() {
    int[] input1 = {2, 1};
    assertArrayEquals(new int[]{1, 2}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlaceNums() {
    int[] input1 = {2, 3, 1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] {1, 3, 2}, input1);
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] arr = new double[] {-1, -1, 2};
    assertEquals(0.5, ArrayExamples.averageWithoutLowest(arr), 0.0001);
  } 
}
