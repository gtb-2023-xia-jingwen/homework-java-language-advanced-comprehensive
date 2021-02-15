package com.tw.questionanothermedium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.tw.questionanothermedium.IntersectionTestUtil.countAppearance;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IntersectionTest {
    @Test
    void should_not_contain_elements_that_exist_in_just_one_iterable() {
        List<Integer> left = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        List<Integer> right = Arrays.asList(5, 4, 4, 3, 3, 3, 2, 2, 2, 2);

        final List<Integer> intersection = Intersection.getIntersection(left, right);
        assertEquals(0, countAppearance(intersection, 1));
        assertEquals(0, countAppearance(intersection, 5));
    }

    @Test
    void should_get_correct_appearance() {
        List<Integer> left = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        List<Integer> right = Arrays.asList(5, 4, 4, 3, 3, 3, 2, 2, 2, 2);

        final List<Integer> intersection = Intersection.getIntersection(left, right);
        assertEquals(2, countAppearance(intersection, 2));
        assertEquals(3, countAppearance(intersection, 3));
        assertEquals(2, countAppearance(intersection, 4));
    }
}
