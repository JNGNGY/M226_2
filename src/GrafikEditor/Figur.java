package GrafikEditor;

import java.awt.*;

public abstract class Figur {
    protected int x;
    protected int y;
    protected Color farbe;
    protected boolean ausgefuellt;

    public Figur(int x, int y, Color farbe, boolean ausgefuellt) {
        this.x = x;
        this.y = y;
        this.farbe = farbe;
        this.ausgefuellt = ausgefuellt;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getfarbe() {
        return farbe;
    }

    public boolean istAusgefuellt() {
        return ausgefuellt;
    }

    public void setAusgefuellt(boolean ausgefuellt) {
        this.ausgefuellt = ausgefuellt;
    }

    public void move(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
    }

    public abstract void draw(Graphics g);
}
