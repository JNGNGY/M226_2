package GrafikEditor;

import java.awt.Color;
import java.awt.Graphics;
public final class Kreis extends Figur {
    private int radius;

    public Kreis(int x, int y, int radius) {
        super(x, y, Color.BLACK, false);
        this.setRadius(radius);
    }

    public Kreis(int x, int y, int radius, Color farbe, boolean ausgefuellt) {
        super(x, y, farbe, ausgefuellt);
        this.setRadius(radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        // get height/width from radius
        int diameter = radius * 2;
        if (ausgefuellt) {
            g.fillOval(x - radius, y - radius, diameter, diameter);
        } else {
            g.drawOval(x - radius, y - radius, diameter, diameter);
        }
    }

    @Override
    public String generateSavingString(){
        return this.getClass().getSimpleName() + ";" +
                this.getX() + ";" +
                this.getY();
    }
}
