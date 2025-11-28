package org.example.ink;

public class ColorInk implements Ink{
    private int r;
    private int g;
    private int b;

    public void setR(int r) {
        this.r = r;
    }

    public void setG(int g) {
        this.g = g;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void setColor(int r, int g, int b){
        this.r = Math.max(0, Math.min(255, r));
        this.g = Math.max(0, Math.min(255, g));
        this.b = Math.max(0, Math.min(255, b));
    }

    @Override
    public String getColorInfo(){
        return "打印颜色：彩色，rgb(" + r + "," + g + "," + b + ")\r\n";
    }
}
