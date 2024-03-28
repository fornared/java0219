package ch18.lecture.p05filter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class C11PrintStream {
    public static void main(String[] args) throws IOException {
        String file = "temp/output11.txt";
        FileOutputStream fos = new FileOutputStream(file);
        PrintStream ps = new PrintStream(fos);

        ps.print("Hello World! ");
        ps.print("🤣🤣🤣🤣");
        ps.println();
        ps.println("곧 점심시간");
        ps.println("배고파요");
        ps.printf("%f * %f = %f%n", 3.14, 5.0, (3.14 * 5));

        ps.close();
    }
}
