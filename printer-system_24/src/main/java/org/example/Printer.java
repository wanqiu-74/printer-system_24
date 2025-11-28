package org.example;

import org.example.ink.Ink;
import org.example.paper.Paper;

public class Printer {
    private Ink ink;
    private Paper paper;

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public void print (String str){
        System.out.print(ink.getColorInfo());
        for(int i = 0; i < str.length(); i++){
            paper.putInChar(str.charAt(i),i+1);
        }
        System.out.print(paper.getContent());
    }

    public Ink getInk() {
        return ink;
    }

    public Paper getPaper() {
        return paper;
    }
}
