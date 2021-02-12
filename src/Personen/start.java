package Personen;

class Person {
    protected String name;
    protected String vorname;
    protected int personalNummer;

    public Person(String name, String vorname, int personalNummer) {
        this.name = name;
        this.vorname = vorname;
        this.personalNummer = personalNummer;
    }
}
class Fachangestellter extends Person {
     Chef vorgesetzter;

    public Fachangestellter(String name, String vorname, int personalNummer, Chef c) {
        super(name, vorname, personalNummer);
        vorgesetzter = c;
    }
}
class Chef extends Person {
    String abteilung;

    public Chef(String name, String vorname, int personalNummer, String abt) {
        super(name, vorname, personalNummer);
        abteilung = abt;
    }
}

class Firma {
    public Person[] mitarbeiter;

    public Firma (Person[] p) {
        mitarbeiter = p;
    }
}

public class Personen {
    public static void main (String args[]) {
        Chef personal3 = new Chef("Sattler", "Beatrice", 2, "Verkauf");
        Fachangestellter personal1 = new Fachangestellter("Test", "Tester", 4, personal3);
        Person personal4 = new Person("Muster", "Max", 3);
        personal3.name="Sattler";
        personal3.vorname="Beatrice";
        personal3.abteilung="Verkauf";
        personal1.name="Klein";
        personal1.vorname="Thomas";

        personal1.vorgesetzter = personal3; //*1
        personal4 = personal1; //*2
        personal4.vorgesetzter = personal3; //*3
        personal1 = personal4; //*4
        personal1 = (Fachangestellter) personal4; //*5

        Firma f = new Firma(
                new Person[] {new Chef("Sattler", "Beatrice",25, "Verkauf")} );
        System.out.println(((Chef)f.mitarbeiter[0]).abteilung);
    }
}

