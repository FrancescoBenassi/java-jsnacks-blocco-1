import java.util.ArrayList;

public class Test {

    public static void snack3(String string) {
        String s1 = string;
        String s2 = "";

        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }
        System.out.println(s2);
    }

    public static void snack4(ArrayList<String> string, int a, int b) {
        ArrayList<String> stringCopy = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            if (a > b) {
                throw new IllegalArgumentException("Il valore di 'a' non può essere inferiore a quello di 'b'");
            }
            if (a < 0 || b > string.size()) {
                throw new IllegalArgumentException(
                        "I valori di 'a' e 'b' non possono essere inferiori a 0 e non possono essere superiori alla lunghezza dell'array inserito "
                                + string.size());
            }
            stringCopy.add(string.get(i));
            System.out.println(string.get(i));
        }
    }

    public static void main(String[] args) {

        Test.snack3("ciao");

        ArrayList<String> string = new ArrayList<>();
        string.add("cibo");
        string.add("macchina");
        string.add("spiaggia");
        string.add("cielo");
        string.add("persona");
        string.add("lavoro");
        string.add("ferie");
        string.add("camino");
        string.add("città");
        string.add("universo");
        string.add("spider-man");
        string.add("paese");
        string.add("trattore");

        Test.snack4(string, 2, 10);

    }
}
