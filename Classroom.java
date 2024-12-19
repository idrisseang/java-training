import java.util.Arrays;

public class Classroom {

    public static void main(String[] args) {
        Wilder[] wilders = {new Wilder("Marc", true), new Wilder("Jane", false), new Wilder("Bob", false)};
        Arrays.stream(wilders)
                .forEach(wilder -> System.out.println(wilder.whoIAm()));
    }
}
