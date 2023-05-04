import static org.junit.Assert.*;
import org.junit.*;

public class MethodsTests {
  @Test 
  public void testSumEvensLength4() {
    int[] input1 = { 12, 13, 7, 2};
    assertEquals(EvensExample.sumEvenIndices(input1), 19);
  }
  @Test 
  public void testSumEvenLength5() {
    int[] input1 = { 12, 13, 7, 2, 33};
    assertEquals(EvensExample.sumEvenIndices(input1), 52);
  }
  @Test
  public void testSumEvenLength6() {
    int[] input1 = { 12, 13, 7, 8, 5, 3};
    assertEquals(EvensExample.sumEvenIndices(input1), 24);
  }

  @Test
  public void testReverse2() { 
    int[] input = {1,2,3,4,5};
    int[] output = ArrayExamples.reversed(input);
    assertArrayEquals(new int[]{5,4,3,2,1}, output);
    
  }

  @Test
  public void testReversed() { 
    int[] input1 = {};
    assertArrayEquals(new int[]{}, ArrayExamples.reversed(input1));
  }
}