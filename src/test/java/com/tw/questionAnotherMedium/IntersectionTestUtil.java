package com.tw.questionAnotherMedium;

import java.util.List;
import java.util.Objects;

class IntersectionTestUtil {
    public static <T> int countAppearance(List<T> list, T item) {
        return (int)list.stream().filter(i -> Objects.equals(i, item)).count();
    }
}
