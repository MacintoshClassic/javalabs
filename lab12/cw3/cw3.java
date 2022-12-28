
abstract class Foreign_language {
}

class EN_PL_Translation extends Foreign_language {
    public void en_to_pn(String horse, String apple, String car) {
        System.out.println(horse + " - kon, " + apple + " - jablko, " + car + " - samochod");
    }

    public void pl_to_en(String kon, String jablko, String samochod) {
        System.out.println(kon + " - horse, " + jablko + " - apple, " + samochod + " - car\n");
    }

    public void en_grammar(String answer) {
        System.out.println("What tense this sentence is written?:\n*Was you yestarday at school?*");
        if (answer == "Past simple") {
            System.out.println("The answer is correct!\n");
        } else {
            System.out.println("The answer is wrong\n");
        }
    }

    public void pl_grammar(String odpowiedz) {
        System.out.println("Czy trzeba w tym zdaniu postawic znak '?':\n*Dlaczego nie odbierasz telefonu*");
        if (odpowiedz == "tak") {
            System.out.println("Odpowiedz poprawna!\n");
        } else if (odpowiedz == "nie") {
            System.out.println("Odpowiedz bledna!\n");
        }
    }
}

public class cw3 {
    public static void main(String[] args) {
        EN_PL_Translation enpl = new EN_PL_Translation();
        enpl.en_to_pn("horse", "apple", "car");
        enpl.pl_to_en("kon", "jablko", "samochod");
        enpl.en_grammar("Past simple");
        enpl.pl_grammar("nie");
    }
}
