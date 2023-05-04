import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	// reversed in place test
  @Test 
	public void testReverseInPlace() {
    int[] input1 = {1, 2, 3, 4,5 };
    int[] input2 = {1,2,3,4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5,4,3,2,1}, input1); // passes
    assertArrayEquals(new int[]{1,2,3,4}, input2);
  }

  // reversedonly test
  @Test
  public void testReversed() {
    int[] input1 = { }; // passes
    int[] input2 = {1, 2, 3, 4}; // passes with even
    int[] input3 = {1,2,3,4,5};
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{4,3,2,1}, ArrayExamples.reversed(input2));
    assertArrayEquals(new int[]{5,4,3,2,1}, ArrayExamples.reversed(input3));
  }
   
  // average Without lowest tets 
  // uses assert equals insted of assertARRAYEquals
  public void testAverageWithoutLowest() { 
    double[] nothing = { };
    double[] oneItem = { 1.0 };
    double[] output = {0.0};
    assertEquals( output, ArrayExamples.averageWithoutLowest(nothing));
    assertEquals( output, ArrayExamples.averageWithoutLowest(oneItem));

     
  }
}
