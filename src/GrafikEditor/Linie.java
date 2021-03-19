package GrafikEditor;

import java.awt.Color;
import java.awt.Graphics;

public final class Linie extends Figur {
    private int endX;
    private int endY;
    private int width;

    public Linie(int x, int y, int endX, int endY, Color farbe, int width) {
        super(x, y, farbe, false);
        this.setEndX(endX);
        this.setEndY(endY);
    }

    //public int setWidth(int width){
   //     this.width = width;
    //}

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    @Override
    public void draw(Graphics g) {
        g.drawLine(x, y, endX, endY);
    }

    @Override
    public void move(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
        endX += deltaX;
        endY += deltaY;
    }

    @Override
    public String generateSavingString(){
        return this.getClass().getSimpleName() + ";" +
                this.getX() + ";" +
                this.getY();
    }
}
