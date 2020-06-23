package Lesson;
import org.junit.*;
import org.junit.Test;

import java.util.*;
import java.util.Collections;
import static org.junit.Assert.*;

public class LessonTest{
    int[] intArray = new int[]
            {1,2,3,4,5,12};
    int[] sortIntArray = new int[]
            {1,2,4,3,5,12};


    @Test
    public void checkSort() {
        System.out.println(sortIntArray);
        Arrays.sort(sortIntArray);
        System.out.println(sortIntArray);
        assertTrue(Arrays.equals(intArray, sortIntArray));
    }
}