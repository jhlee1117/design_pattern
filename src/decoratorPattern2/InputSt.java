package decoratorPattern2;

import decoratorPattern.LowerCaseInputStream;

import java.io.*;

public class InputSt {

    public static void main(String[] args) {
        int data = 0;
        try {
            InputStream inputStream = new FileInputStream("Learn To Fly.txt");
            inputStream = new BufferedInputStream(inputStream);
            inputStream = new DataInputStream(inputStream);
            inputStream = new LowerCaseInputStream(inputStream);
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
            inputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
