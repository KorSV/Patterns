import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReplacerInputStream extends FilterInputStream {

    public ReplacerInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        if (c == -1) {
            return c;
        }else{
            if ( c == 'H') {
                return Character.getNumericValue('X');
            }
            return Character.toUpperCase((char) c );
        }
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        for (int i = off; i<off+result;i++){

            //b[i] = (byte) Character.toUpperCase((char) b[i]);
            //System.out.println((char) b[i]);
            if ( (char)b[i] == 'h') {
                b[i] = (byte) 'X';
            }
        }
        return result;
    }
}
