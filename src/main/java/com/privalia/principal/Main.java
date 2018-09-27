package com.privalia.principal;

import java.io.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import com.privalia.util.FileUtil;


public class Main {

	

	   public static void main(String[] args) throws IOException {

		   String csvFile = "C:\\Users\\francisco.sevilla\\Downloads\\Examen\\stocks-ITX.csv";
		   FileUtil.loadCSV(csvFile);
		
		   
		  // FileUtil.getLastThursday(2,2018);
		   
	   }
}
	   
