import org.junit.Test;

import static org.junit.Assert.*;


public class TestCases {

    //1 -> 2 -> 3 -> 4 -> 5 -> 3 -> 4 -> 5 -> 3 -> 4 -> 5 -> 3 -> 4 -> 6 -> 3 -> 7 -> 8
    @Test
    public void nodeCoveragePath1() {
        char[] input = {'a', 'a', 'a', 'b'};
        char target = 'a';
        int actualOutput = NumOfOccurrences.countNumOccurrences(input, target);
        assertEquals(3, actualOutput);
    }

    //1 -> 2 -> 3 -> 4 -> 6 -> 3 -> 4 -> 5 -> 3 -> 4 -> 5 -> 3 -> 4 -> 6 -> 3 -> 7 -> 8
    @Test
    public void nodeCoveragePath2() {
        char[] input = {'b', 'a', 'a', 'b'};
        char target = 'a';
        int actualOutput = NumOfOccurrences.countNumOccurrences(input, target);
        assertEquals(2, actualOutput);
    }


    //1 -> 2 -> 3 -> 4 -> 5 -> 3 -> 4 -> 6 -> 3 -> 7 -> 8
    @Test
    public void edgeCoveragePath1() {
        char[] input = {'b'};
        char target = 'b';
        int actualOutput = NumOfOccurrences.countNumOccurrences(input, target);
        assertEquals(1, actualOutput);
    }

    //1 -> 2 -> 3 -> 4 -> 5 -> 3 -> 4 -> 6 -> 3 -> 4 -> 6 -> 3 -> 7 -> 8
    @Test
    public void edgeCoveragePath2() {
        char[] input = {'b', 'a', 'a'};
        char target = 'b';
        int actualOutput = NumOfOccurrences.countNumOccurrences(input, target);
        assertEquals(1, actualOutput);
    }

    //1 -> 2 -> 3 -> 4 -> 5 -> 3 -> 4 -> 6 -> 3 -> 7 -> 8
    @Test
    public void edgePairCoveragePath1() {
        char[] input = {'a', 'b'};
        char target = 'a';
        int actualOutput = NumOfOccurrences.countNumOccurrences(input, target);
        assertEquals(1, actualOutput);
    }

    //1 -> 2 -> 3 -> 4 -> 6 -> 3 -> 4 -> 5 -> 3 -> 7 -> 8
    @Test
    public void edgePairCoveragePath2() {
        char[] input = {'b', 'a'};
        char target = 'a';
        int actualOutput = NumOfOccurrences.countNumOccurrences(input, target);
        assertEquals(1, actualOutput);
    }

    //1 -> 2 -> 3 -> 7 -> 8
    @Test
    public void edgePairCoveragePath3() {
        char[] input = {};
        char target = 'f';
        int actualOutput = NumOfOccurrences.countNumOccurrences(input, target);
        assertEquals(0, actualOutput);
    }

    //1 -> 2 -> 3 -> 4 -> 5 -> 3 -> 7 -> 8
    @Test
    public void edgePairCoveragePath4() {
        char[] input = {'a'};
        char target = 'a';
        int actualOutput = NumOfOccurrences.countNumOccurrences(input, target);
        assertEquals(1, actualOutput);
    }
}
