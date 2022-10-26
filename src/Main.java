import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Reader r = new FileReader("srcFile.txt");
        Writer w = new FileWriter("copy.txt");
        int c;
        while ((c = r.read()) != -1) {
            System.out.println((char) c);
            w.write(c);
        }
        r.close();
        w.close();
    }
}