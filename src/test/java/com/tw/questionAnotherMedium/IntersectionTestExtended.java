package com.tw.questionAnotherMedium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.tw.questionAnotherMedium.IntersectionTestUtil.countAppearance;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IntersectionTestExtended {
    @Test
    void should_handle_null() {
        List<Integer> left = Arrays.asList(1, null, null, 3, 3, 3, 4, 4, 4, 4);
        List<Integer> right = Arrays.asList(5, 4, 4, 3, 3, 3, null, null, null, null);

        final List<Integer> intersection = Intersection.getIntersection(left, right);
        assertEquals(2, countAppearance(intersection, null));
    }

    @Test
    void should_get_overall_correct_intersection() {
        List<Integer> left = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        List<Integer> right = Arrays.asList(5, 4, 4, 3, 3, 3, 2, 2, 2, 2);

        final List<Integer> intersection = Intersection.getIntersection(left, right);
        assertEquals(7, intersection.size());
        assertEquals(0, countAppearance(intersection, 1));
        assertEquals(0, countAppearance(intersection, 5));
        assertEquals(2, countAppearance(intersection, 2));
        assertEquals(3, countAppearance(intersection, 3));
        assertEquals(2, countAppearance(intersection, 4));
    }

    @Test
    void should_get_overall_correct_intersection_another() {
        List<Integer> left = Arrays.asList(1, 2, 3, 3, 3, 3, 4, 4, 4, 5);
        List<Integer> right = Arrays.asList(5, 4, 4, 3, 3, 3, 2, 2, 2, 2);

        final List<Integer> intersection = Intersection.getIntersection(left, right);
        assertEquals(7, intersection.size());
        assertEquals(0, countAppearance(intersection, 1));
        assertEquals(1, countAppearance(intersection, 2));
        assertEquals(3, countAppearance(intersection, 3));
        assertEquals(2, countAppearance(intersection, 4));
        assertEquals(1, countAppearance(intersection, 5));
    }

    @SuppressWarnings("StringBufferReplaceableByString")
    @Test
    void should_get_overall_correct_intersection_another_type() {
        List<String> left = Arrays.asList(
            new StringBuilder("on").append("e").toString(),
            "two", "three", "three", "three", "three", "four", "four",
            new StringBuilder("fo").append("ur").toString(),
            "five");
        List<String> right = Arrays.asList(
            "five", "four", "four", "three", "three", "three",
            "two", "two", "two", "two");

        final List<String> intersection = Intersection.getIntersection(left, right);
        assertEquals(7, intersection.size());
        assertEquals(0, countAppearance(intersection, "one"));
        assertEquals(1, countAppearance(intersection, "two"));
        assertEquals(3, countAppearance(intersection, "three"));
        assertEquals(2, countAppearance(intersection, "four"));
        assertEquals(1, countAppearance(intersection, "five"));
    }
}
