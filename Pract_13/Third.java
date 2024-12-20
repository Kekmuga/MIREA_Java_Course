package Pract_13;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Third {
    private String[] adrres = new String[7];
    public void Parser(String lol, String parser){
        try {
            StringTokenizer tokenizer = new StringTokenizer(lol, parser);
            int cnt = 0;
            while (tokenizer.hasMoreTokens() || cnt < 6){
                this.adrres[cnt] = tokenizer.nextToken();
                cnt += 1;
            }
        } catch (NoSuchElementException e){
            adrres[0] = "error";
        }

    }
    public String ToString(){
        if (adrres[0].compareTo("error") == 0){
            return "non valid token";
        }
        return "Country: " + adrres[0] +
        "\nRegion: " + adrres[1] +
                "\nCity: " + adrres[2] +
                "\nStreet: " + adrres[3] +
                "\nhouse: " + adrres[4] +
                "\ncorpus: " + adrres[5] +
                "\nkvart: " + adrres[6];
    }

}
