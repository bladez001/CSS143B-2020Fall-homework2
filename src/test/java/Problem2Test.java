import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem2Test {
    @Test
    public void testRemoveDuplicates() {
        int[][] inputs = {
                // DO NOT REMOVE OR CHANGE THE GIVEN TEST CASES!
                {0, 0, 1, 1, 1, 2, 2, 4, 4, 6},
                // add more test cases
                {},
                {0, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 2, 3, 3, 3, 4},
                {1, 1, 1, 2, 4, 4, 5},
                {34, 34, 35, 35, 35, 400},
                {1, 2, 2, 2, 6, 6, 9, 9, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},



        };

        int[][] expects = {
                {0, 1, 2, 4, 6},
                // add more test cases
                {},
                {0},
                {1},
                {1, 2, 3, 4},
                {1, 2, 4, 5},
                {34, 35, 400},
                {1, 2, 6, 9},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},


        };

        assertEquals(expects.length, inputs.length);

        for (int i = 0; i < inputs.length; i++) {
            int actualLength = Problem2.remove(inputs[i]);
            String caseId = "case " + i;
            assertEquals(caseId + " output length FAILED", expects[i].length, actualLength);
            for (int j = 0; j < actualLength; j++) {
                assertEquals(caseId + " element comparison FAILED", expects[i][j], inputs[i][j]);
            }
        }
    }
}
