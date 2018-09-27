package com.privalia.principal;

import java.io.*;
import java.util.Arrays;


public class Main {

	

	   public static void main(String[] args) {

		   String csvFile = "C:\\Users\\francisco.sevilla\\Downloads\\Examen\\stocks-ITX.csv";
		   BufferedReader br = null;
		   String line = "";
		   //Se define separador ","
		   String cvsSplitBy = ",";
		   try {
		       br = new BufferedReader(new FileReader(csvFile));
		       while ((line = br.readLine()) != null) {                
		           String[] datos = line.split(cvsSplitBy);
		           //Imprime datos.
		          System.out.println(datos[0]);
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
	   }
}
	   
