package com.privalia.principal;

import java.io.*;
import com.privalia.util.FileUtil;


public class Main {

	

	   public static void main(String[] args) throws IOException {

		   String csvFile = "C:\\Users\\francisco.sevilla\\Downloads\\Examen\\stocks-ITX.csv";
		   FileUtil.loadCSV(csvFile);
	   }
}
	   
