package org.example.paper;

public class A4Paper implements Paper{
    private static final String NEWLINE = "\r\n";
    private static final String NEWPAGE = "==========\r\n";
    private static final int CHAR_PER_LINE = 10;
    private static final int CHAR_PER_PAGE = 8;
    private String content = "";

    @Override
    public void putInChar(char c,int index){
        content += c;
        if(index != 0 && index % CHAR_PER_LINE == 0){
            content += NEWLINE;
        }
        if(index != 0 && index % (CHAR_PER_LINE * CHAR_PER_PAGE) == 0){
            content += NEWPAGE;
        }
    }

    @Override
    public String getContent() {
        return content;
    }
}

private int margin = 2; // 页边距默认2字符
public void setMargin(int margin) {
    this.margin = margin;
}