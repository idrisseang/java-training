import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Decipherer {

    public String decipher(String msg) {
        int keyNumber = msg.length() / 2 ;
        ArrayList<Character> substringChars = new ArrayList<Character>();
        for (int i = 0; i < keyNumber; i++) {
            substringChars.add(msg.charAt(i + 5));
        }

        return substringChars.reversed().stream()
                .map(String::valueOf)
                .collect(Collectors.joining())
                .replaceAll("[@#?]", " ");

    }

    public static void main(String[] args) {
        Decipherer decipherer = new Decipherer();
        String[] msgsToDecipher = {"0@sn9sirppa@#?ia'jgtvryko1", "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj", "aopi?sedohtém@#?sedhtmg+p9l!"};

        Arrays.stream(msgsToDecipher).forEach(msg -> System.out.print(decipherer.decipher(msg) + " "));
    }
}
