package org.example.paper;

public class B5Paper implements Paper{
    private static final String NEWLINE = "\n";
    private static final String NEWPAGE = "----------\n";
    private static final int CHAR_PER_LINE = 8;
    private static final int LINE_PER_PAGE = 6;
    private String content = "";

    @Override
    public void putInChar(char c, int index) {
        content += c;
        // 满行换行
        if (index != 0 && index % CHAR_PER_LINE == 0) {
            content += NEWLINE;
        }
        // 满页分页
        if (index != 0 && index % (CHAR_PER_LINE * LINE_PER_PAGE) == 0) {
            content += NEWPAGE;
        }
    }

    @Override
    public String getContent() {
        return content;
    }
}
