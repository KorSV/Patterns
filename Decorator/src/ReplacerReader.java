import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class ReplacerReader extends BufferedReader {

    public ReplacerReader(Reader in) {
        super(in);
    }

    @Override
    public String readLine() throws IOException {
        String s = super.readLine();
        try {
            return s.replaceAll("world", "хуй");
        }catch (NullPointerException ex){
            return s;
        }

    }
}
