package com.privalia.util;


import lombok.extern.log4j.Log4j;

import java.io.*;

@Log4j
public class FileUtil {

private static File file = null;

private FileUtil() {
	
}

public static synchronized boolean createFile (String fileName) throws IOException{
	boolean isFileCreated = false;
	
	file = new File(fileName);
	
	if (file.exists()) {
		log.warn("El fichero ya existe");
	} else {
		try {
			isFileCreated = file.createNewFile();
		} catch(IOException e) {
			log.error(e.getMessage());
			throw e;
		}
	}
	
	return isFileCreated;
	
}

public static synchronized String[] loadCSV(String fileName) throws IOException{
	  String csvFile = "C:\\Users\\francisco.sevilla\\Downloads\\Examen\\stocks-ITX.csv";
	   BufferedReader br = null;
	   String line = "";
	   String[] datos = null;
	   //Se define separador ","
	   String cvsSplitBy = ",";
	   try {
	       br = new BufferedReader(new FileReader(csvFile));
	       while ((line = br.readLine()) != null) {                
	           datos = line.split(cvsSplitBy);
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
	   

       return datos;
  
	
}

public static File getFile() {
	return file;
}

}

