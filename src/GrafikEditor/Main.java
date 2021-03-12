package GrafikEditor;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import GrafikEditor.Figur;
import GrafikEditor.Kreis;
import GrafikEditor.Linie;
import GrafikEditor.VierEck;

public class Main {
    private static final Display display = new Display();

    public static void main(String[] args) {
        Figur langesVierEck = new VierEck(25, 50, 100, 20, Color.RED, false);
        Figur kleinerKreis = new Kreis(120, 140, 15, Color.BLUE, true);
        Figur eineLinie = new Linie(120, 40, 200, 200, Color.GREEN);
        List<Figur> figuren = new ArrayList<Figur>();

        figuren.add(langesVierEck);
        figuren.add(kleinerKreis);

        Gruppe gruppe = new Gruppe();
        gruppe.addFigur(eineLinie);
        gruppe.addFigur(kleinerKreis);

        Zeichnung zeichnung = new Zeichnung(figuren);
        zeichnung.hinzufuegen(gruppe);
        display.setZeichnung(zeichnung);

        new FigurSaver();
    }
}
