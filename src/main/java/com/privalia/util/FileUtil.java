package com.privalia.util;


import lombok.extern.log4j.Log4j;

import java.awt.List;
import java.io.*;
import java.sql.Date;
import java.util.Calendar;

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
	   BufferedReader br = null;
	   String line = "";
	   String[] datos = null;
	   //Se define separador ","
	   String cvsSplitBy = ",";
	   try {
	       br = new BufferedReader(new FileReader(fileName));
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

public static int getLastThursday( int month, int year ) {
	   Calendar cal = Calendar.getInstance();
	   cal.set( year, month , 1 );
	   cal.add( Calendar.DAY_OF_MONTH, -( cal.get( Calendar.DAY_OF_WEEK ) % 7 + 2 ) );
	   System.out.println(cal.getTime());
	   return  cal.get(Calendar.DAY_OF_MONTH);
	}




public static File getFile() {
	return file;
}

}

