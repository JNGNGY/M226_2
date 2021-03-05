package GrafikEditor;

import java.util.ArrayList;
import java.util.List;

import GrafikEditor.Figur;

public class Gruppe {
    private List<Figur> gruppe = new ArrayList<Figur>();

    public void addFigur(Figur figur) {
        gruppe.add(figur);
    }

    public void clear() {
        gruppe.clear();
    }

    public List<Figur> getGruppe() {
        return gruppe;
    }

    public void setAusgefuellt(boolean ausgefuellt) {
        for (Figur figur : gruppe) {
            figur.setAusgefuellt(ausgefuellt);
        }
    }
}
