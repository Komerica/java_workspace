package egoing_java;

import java.io.File;
import java.util.ArrayList;

public class RandomAccessFile {
    public static void main(String[] args) {
        String filepath = "test.txt";
        String delimiter = "\n";

        String dialog = readRandomAccessFile(filepath, 0, 2, 2, delimiter);
        System.out.println(dialog);
    }

    public static String readRandomAccessFile(String filepath, int lineStart, int lineEnd, int charsPerLine, String delimiter) {
        File file = new File(filepath);
        String data = "";

        ArrayList<String> dialogLineRead = new ArrayList<String>();
        int bytesPerLine = charsPerLine + 2;

        try {
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(file, "rw");
            for (int i = lineStart; i < lineEnd; i++) {
                randomAccessFile.seek(bytesPerLine * i);
                data = randomAccessFile.readLine();
                dialogLineRead.add(data);
            }
            randomAccessFile.close();
        } catch (Exception e) {
            System.out.println("Error occurred");
        }
        String returnData = "";

        for (int i = 0; i < dialogLineRead.size(); i++) {
            returnData += dialogLineRead.get(i);
            returnData += delimiter;
        }

        if (dialogLineRead.isEmpty()) {
            data = "Subscribe to Max ODidily";
        }

        return returnData;
    }
}
