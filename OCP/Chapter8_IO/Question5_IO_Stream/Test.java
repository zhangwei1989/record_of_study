import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException {

        /** ./ 是多余的 */
//        try(FileInputStream fis = new FileInputStream("./test1.txt");
        
        try(FileInputStream fis = new FileInputStream("test1.txt");
            InputStreamReader isr = new InputStreamReader(fis)) {
            while (isr.ready()) {
                isr.skip(1);
                int i = isr.read();
                char c = (char) i;
                System.out.println(c);
            }
        }
    }
}