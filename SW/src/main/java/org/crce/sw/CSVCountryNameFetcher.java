/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.crce.sw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Leon
 */
public class CSVCountryNameFetcher {

    public void fetchDataFromCSV() throws FileNotFoundException, IOException {
        String line = "";
        String cvsSplitBy = ",";
        String [] countryName = null;
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/leons/Desktop/Countries.csv"));
        while (br.readLine() != null) {
            //System.out.println(br.readLine());
            countryName = br.readLine().split(",");
            //System.out.println("Here is " + Arrays.toString(countryName));
        }
        System.out.println("Here is " + Arrays.toString(countryName));

    }
}
