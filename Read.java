package com.bridgelabz.codinclub.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read {
	public static void main(String[] args) {

        String csvFile = "E:\\Bridgelab\\Test1.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);

                System.out.println(" [First_Name= " + country[0] + " , Last_Name= " + country[1] + " , Address= " + country[2] + " , City= " + country[3] + ", "
                		+ "State= " + country[4] + " , Zip=" + country[5] + " , Phone = " + country[6] + ",]");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

