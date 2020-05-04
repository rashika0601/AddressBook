package com.bridgelabz.codinclub.service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.bridgelabz.codinclub.Person;

public class Write {
	
	
	public static void main(String[] args) {

		 

		String path = "E:\\Bridgelab\\Test1.csv";

		try {

		ArrayList<HashMap<String, String>> myArrList = new ArrayList<HashMap<String, String>>();

		HashMap<String, String> map;

		/*** Rows 1 ***/

		map = new HashMap<String, String>();

		map.put("First_Name", "Rashika");
		map.put("Last_Name", "Jha");
		map.put("Address", "Btm");
		map.put("City", "Bangalore");
		map.put("State", "Karnataka");
		map.put("Zip", "560076");
		map.put("Phone", "82712566452");
	
		myArrList.add(map);
		
		/*** Rows 2 ***/

		map = new HashMap<String, String>();

		map.put("First_Name", "rashi");
		map.put("Last_Name", "Jha");
		map.put("Address", "Btm");
		map.put("City", "Bangalore");
		map.put("State", "Karnataka");
		map.put("Zip", "560076");
		map.put("Phone", "8572125422");
	
		myArrList.add(map);

		
		FileWriter writer;
		writer = new FileWriter(path, true);  //True = Append to file, false = Overwrite
		 
		// Write CSV
		for (int i = 0; i < myArrList.size(); i++) { 
		writer.write(myArrList.get(i).get("First_Name").toString());
		writer.write(",");
		writer.write(myArrList.get(i).get("Last_Name").toString());
		writer.write(",");
		writer.write(myArrList.get(i).get("Address").toString());
		writer.write(",");
		writer.write(myArrList.get(i).get("City").toString());
		writer.write(",");
		writer.write(myArrList.get(i).get("State").toString());
		writer.write(",");
		writer.write(myArrList.get(i).get("Zip").toString());
		writer.write(",");
		writer.write(myArrList.get(i).get("Phone").toString());
		writer.write("\r\n");
		}
		System.out.println("Write success!");
		writer.close();
	
		} catch (IOException e) {
		e.printStackTrace();
	
		}
	
		}  
	
		}
