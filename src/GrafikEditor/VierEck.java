package GrafikEditor;

import java.awt.Color;
import java.awt.Graphics;

public final class VierEck extends Figur {
    private int breite;
    private int hoehe;

    public VierEck(int x, int y, int breite, int hoehe, Color farbe, boolean ausgefuellt) {
        super(x, y, farbe, ausgefuellt);
        this.setBreite(breite);
        this.setHoehe(hoehe);
    }

    public VierEck(int x, int y, int breite, int hoehe) {
        super(x, y);
        this.setBreite(breite);
        this.setHoehe(hoehe);
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }


    public int getHoehe() {
        return hoehe;
    }

    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }

    @Override
    public void draw(Graphics g) {
        if (ausgefuellt) {
            g.fillRect(x,  y, breite, hoehe);
        } else {
            g.drawRect(x, y, breite, hoehe);
        }
    }

    @Override
    public String generateSavingString(){
        return this.getClass().getSimpleName() + ";" +
                this.getX() + ";" +
                this.getY();
    }
}
