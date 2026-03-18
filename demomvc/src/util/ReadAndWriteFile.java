package util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void writeStringListToCSV(String filePath, List<String> stringList,boolean isAppend) {
        File file = new File(filePath);
        try (
                FileWriter fileWriter = new FileWriter(file,isAppend);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            for (String line : stringList) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }

    }

    public static List<String> readFileCSVToStringList(String filePath){
        List<String> stringList = new ArrayList<>();
        // đọc file
        File file = new File(filePath);
        try (
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String line = null;
            while ((line = bufferedReader.readLine())!=null){
                stringList.add(line);
            }

        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
        return stringList;
    }

}
