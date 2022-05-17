package co.com.tcs.taller.automatizacion.models;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

/*
    private boolean create(String filePath){
        File file = new File(filePath);
        if (file.CreateFile(filePath)) {
            System.out.println("File created");
            return true;
        } else {
            System.out.println("File already exists.");
            return false;
        }
    }*/

    public static void WriteFile(String filePath, String text){

            try {
                FileWriter fileWriter = new FileWriter(filePath);
                fileWriter.write(text);
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        //FileWriter fileWriter
    }
}
