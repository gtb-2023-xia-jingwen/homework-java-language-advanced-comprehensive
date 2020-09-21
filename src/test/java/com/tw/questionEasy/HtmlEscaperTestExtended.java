package com.tw.questionEasy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HtmlEscaperTestExtended {
    @Test
    void should_not_escape_if_there_is_no_character_to_escape() {
        final String noCharacterToEscape =
            "!@#$%^*()_+=-/?\\|]}[{,.;:abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        assertEquals(noCharacterToEscape, HtmlEscaper.escape(noCharacterToEscape));
    }
}
