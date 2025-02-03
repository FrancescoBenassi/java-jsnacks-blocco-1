import java.util.ArrayList;

public class Test {

    public static void snack3(String string) {
        String s1 = string;
        String s2 = "";

        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 += s1.charAt(i);
        }
        System.out.println(s2);
    }

    public static void snack4(ArrayList<String> string, int a, int b) {
        if (a > b) {
            throw new IllegalArgumentException("Il valore di 'a' non può essere inferiore a quello di 'b'");
        }
        if (a < 0 || b > string.size()) {
            throw new IllegalArgumentException(
                    "I valori di 'a' e 'b' non possono essere inferiori a 0 e non possono essere superiori alla lunghezza dell'array inserito "
                            + string.size());
        }

        ArrayList<String> stringCopy = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            stringCopy.add(string.get(i));
            System.out.println(string.get(i));
        }
    }

    public static void snack4Array(String[] string, int a, int b) {
        if (a > b) {
            throw new IllegalArgumentException("Il valore di 'a' non può essere inferiore a quello di 'b'");
        }
        if (a < 0 || b > string.length) {
            throw new IllegalArgumentException(
                    "I valori di 'a' e 'b' non possono essere inferiori a 0 e non possono essere superiori alla lunghezza dell'array inserito "
                            + string.length);
        }

        String[] stringCopy = new String[b - a];
        for (int i = 0; i + a < b; i++) {
            stringCopy[i] = string[i + a];
            System.out.println(stringCopy[i]);
        }
    }

    public static void main(String[] args) {
        try {
            Test.snack3("ciao");
        } catch (Exception e) {
            // TODO: handle exception
        }

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

        try {
            Test.snack4(string, 2, 10);
        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.println("Seconda parte");

        String[] string2 = { "cibo", "macchina", "spiaggia", "cielo", "persona", "lavoro", "ferie", "camino", "città",
                "universo", "spider-man", "paese", "trattore" };

        try {
            Test.snack4Array(string2, 2, 10);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
