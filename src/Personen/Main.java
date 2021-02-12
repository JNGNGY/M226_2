package Personen;

public class Main {
    public static void main (String args[]) {

        //Aufgabe 2
        //Firma f = new Firma(
        //		new Person[] {new Chef("Sattler", "Beatrice",25, "Verkauf")} ); // <==
        //System.out.println(((Chef)f.mitarbeiter[0]).abteilung);




        //AB03 Kompetenz 3.2
        Person[] angestellte = new Person[3];
        angestellte[0] = new Chef("Bühler", "Adrian", 17, 25, "Verkauf");
        angestellte[1] = new Fachangestellter("Nguyen", "Jan", 20, 24, (Chef) angestellte[0]);
        angestellte[2] = new Lernenden("Kroll", "Marco", 24, 11, 2);

        // For each loop
        for (Person p:angestellte) {
            p.print();
        }

        // For loop
        for (int i = 0; i < angestellte.length; i++) {
            angestellte[i].print();
        }


    }
}
