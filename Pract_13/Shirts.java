package Pract_13;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Shirts {

    private String[] classifire = new String[4];

    public void Parser(String lol){
        try {
            StringTokenizer tokenizer = new StringTokenizer(lol, ",");
            int cnt = 0;
            while (tokenizer.hasMoreTokens() || cnt < 3){
                this.classifire[cnt] = tokenizer.nextToken();
                cnt += 1;
            }
        } catch (NoSuchElementException e){
            classifire[0] = "error";
        }

    }

    @Override
    public String toString() {
        return "Shirts{" +
                "size='" + classifire[0] + '\'' +
                ", color='" + classifire[1] + '\'' +
                ", name='" + classifire[2] + '\'' +
                ", model='" + classifire[3] + '\'' +
                '}';
    }
}
