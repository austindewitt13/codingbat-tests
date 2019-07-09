package edu.cnm.deepdive;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Array2Test {

    Array2 array = new Array2();

    Object[][] input = {
            {new int[]{1,2,3}, true},
            {new int[]{4,4,1}, true},
            {new int[]{4,4,1,2,2}, false},
            {new int[]{1,2,3,4}, false},
            {new int[]{3,5,9}, false},
            {new int[]{}, false}
    };

    private static Object[][] either24(){
        return input;
    }

    @ParameterizedTest
    @MethodSource("either24Source")
    void either24(int[] nums, boolean expected) {
        boolean actual = array.either24(nums);
        if (expected) {
            assertTrue(actual);
        }else{
            assertFalse(actual);
        }
    }

    @Test
    void pre4() {

        
    }
}