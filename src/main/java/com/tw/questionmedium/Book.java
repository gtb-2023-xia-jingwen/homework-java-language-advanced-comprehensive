package com.tw.questionmedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Book {
    private final String isbn;
    private final String name;
    private final int price;
    private final List<String> tags = new ArrayList<>();

    public Book(String isbn, String name, int price) {
        this.isbn = Objects.requireNonNull(isbn);
        this.name = Objects.requireNonNull(name);
        this.price = price;
    }

    public void addTags(String ...tags) {
        this.tags.addAll(Arrays.asList(tags));
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public List<String> getTags() {
        return Collections.unmodifiableList(tags);
    }

    // TODO:
    //   You can add additional codes here if you want.
    // <-start-
    public boolean containTag(String specifiedTag) {
        for (String tag : tags) {
            if (tag.equals(specifiedTag)) return true;
        }
        return false;
    }

    public boolean containTag(String ... specifiedTags) {
        for (String st : specifiedTags) {
            if (containTag(st)) return true;
        }
        return false;
    }
    // --end-->

}
