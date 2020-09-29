package com.company.tasks.task033;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Task033 {

    public static void run (String filePath, String date) {

        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";
        int count = 0;

        try {
            br = new BufferedReader(new FileReader(filePath));
            while ((line = br.readLine()) != null) {
                String [] traffic = line.split(csvSplitBy);
                if (traffic[12].equals(date))
                    count++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Число ограничений на запрашиваемый период = " + count);
    }
}
