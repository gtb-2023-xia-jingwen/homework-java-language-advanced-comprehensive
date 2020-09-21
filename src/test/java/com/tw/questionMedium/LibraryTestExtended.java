package com.tw.questionMedium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class LibraryTestExtended {
    private Library library;
    private static final Book windows2009Book =
        new Book("978-1838550912", "Windows Server 2019 Administration Fundamentals", 40);
    private static final Book problemManagementBook =
        new Book("978-1780172415", "Problem Management", 45);
    private static final Book groupsBook =
        new Book("978-1305865709", "Groups: Process and Practice", 173);

    @BeforeAll
    static void initializeTags() {
        windows2009Book.addTags("business", "computer", "technology", "network", "cloud");
        problemManagementBook.addTags("business", "money", "management", "leadership");
        groupsBook.addTags("social", "psychology");
    }

    @BeforeEach
    void initializeLibrary() {
        library = new Library();
    }

    @Test
    void should_find_book_if_its_price_is_lower_than_or_equal_to_price_given_non_number_style_isbn() {
        library.addAll(windows2009Book, problemManagementBook, groupsBook);
        assertIterableEquals(
            Collections.singletonList(windows2009Book),
            library.findBooksCheaperThan(42)
        );
    }

    @Test
    void should_find_multiple_books_by_multiple_tags_given_ordered_by_isbn_number() {
        library.addAll(windows2009Book, problemManagementBook, groupsBook);
        assertIterableEquals(
            Arrays.asList(groupsBook, windows2009Book),
            library.findBooksByTag("computer", "technology", "psychology"));
    }
}
