package GrafikEditor;


import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import GrafikEditor.Figur;

public class Zeichnung {
    /** Die Liste der dargestellten Figur-Objekte */
    private List<Figur> figuren = new ArrayList<Figur>();

    public Zeichnung(List<Figur> figuren) {
        this.figuren = figuren;
    }

    public Zeichnung() {}

    /**
     * Zeichnet alle Figuren.
     * Wird auf das Graphics objekt verwiesen
     */
    public void zeichneFiguren(Graphics g) {
        for (Figur f : figuren) {
            g.setColor(f.getfarbe());
            f.draw(g);
        }
    }

    /**
     * Fgt eine weitere Figur hinzu
     */
    public void hinzufuegen(Figur figur) {
        figuren.add(figur);
    }


    /**
     * F�gt eine Gruppe von Figuren hinzu
     */
    public void hinzufuegen(Gruppe gruppe) {
        for (Figur figur : gruppe.getGruppe()) {
            hinzufuegen(figur);
        }
    }

    /**
     * L�scht alle Figuren
     */
    public void allesLoeschen() {
        figuren.clear();
    }
}
