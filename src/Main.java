import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
	CheckSum m = new CheckSum();
	FileWork f = new FileWork();
	//m.checksum();
        //f.space();
        f.file();
    }
}
