package com.tw.questioneasy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HtmlEscaperTestExtended {
    @Test
    void should_not_escape_if_there_is_no_character_to_escape() {
        final String noCharacterToEscape =
            "!@#$%^*()_+=-/?\\|]}[{,.;:abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        assertEquals(noCharacterToEscape, HtmlEscaper.escape(noCharacterToEscape));
    }
}
