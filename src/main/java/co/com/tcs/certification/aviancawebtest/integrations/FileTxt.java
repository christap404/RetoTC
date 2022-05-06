package co.com.tcs.certification.aviancawebtest.integrations;

import java.io.*;

public class FileTxt {

    public static void write(String info) {

        try {
            File file = new File("File.txt");
            FileWriter write = new FileWriter(file, true);
            write.write(info + "\n");
            write.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static String read() {

        String text = "";

        try {
            FileReader lector = new FileReader("File.txt");
            BufferedReader content = new BufferedReader(lector);
            text = content.readLine();

        } catch (Exception e) {
            return e.toString();
        }

        return text;

    }

}
