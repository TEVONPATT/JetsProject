package com.skilldistillery.jet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JetsReadApp {

	public static void main(String[] args) {
		ArrayList<Jet> jets = new ArrayList<>();
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets"))) {
			String line;
//				while ((line = bufIn.readLine()) != null) {
//					String[] fields = line.split(",");
//					Jet jet = new Jet Double.parseDouble(String); 
//							Integer.parseInt(fields[4]), Double.parseDouble(fields[5]));
//					jets.add(jet);
//				}
		} catch (IOException e) {
			System.err.println(e);
		}
		System.out.println(jets);
	}
}
