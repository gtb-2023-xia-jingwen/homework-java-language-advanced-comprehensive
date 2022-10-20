package com.tw.questioneasy;

public class HtmlEscaper {
    // TODO:
    //   You can add additional members or blocks of code here if you want.
    // <-start-

    // --end-->

    /**
     * This function will try escaping characters according to the rules defined in HTML 4.01
     * The rules are as follows:
     *
     * (1) Every `"` character will be escaped to `&quot;`
     * (2) Every `'` character will be escaped to `&#39;`
     * (3) Every `&` character will be escaped to `&amp;`
     * (4) Every `<` character will be escaped to `&lt;`
     * (5) Every `>` character will be escaped to `&gt;`
     *
     * @param text The text to escape.
     * @return The escaped string. Note that this method returns {@code null} if {@code text}
     *         is {@code null}.
     */
    public static String escape(String text) {
        // TODO:
        //   Please implement the method
        // <-start-
        if (text == null) return null;
        String escapedStr = text.replaceAll("&", "&amp;")
                .replaceAll("\"", "&quot;")
                .replaceAll("'", "&#39;")
                .replaceAll("<", "&lt;")
                .replaceAll(">", "&gt;");
        return escapedStr;
        // --end-->
    }
}
