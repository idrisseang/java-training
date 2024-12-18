import java.util.Arrays;

public class Movies {

    public static void main(String[] args) {
        String[] movies = { "Indiana Jones et le Royaume du Crâne de Cristal", "Indiana Jones et le Cadran de la Destinée", "Indiana Jones et la Dernière Croisade"};
        String[][] mainCharacters = new String[][]{
                {"Harrison Ford", "Shia LaBeouf", "Karen Allen"},
                {"Harrison Ford", "Phoebe Waller-Bridge", "Mads Mikkelsen"},
                {"Harrison Ford", "Sean Connery", "Denholm Elliott"}
        };

        for(int i = 0; i < movies.length; i++){
            System.out.println(" Dans le film " + movies[i] + ", les principaux acteurs sont : " + Arrays.toString(mainCharacters[i]));
        }
    }
}
