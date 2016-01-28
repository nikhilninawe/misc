package com.adadyn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountryCurrency {

	public static void main(String[] args) throws IOException{
		File f = new File("/Users/nikhilninawe/Desktop/currency_1.sql");
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(f));
		String line = null;
		int i = 2;
		int i1 = 0;
		int j = 3;
		int j1 = 0;
		while((line = br.readLine()) != null){
			if(i == i1){
				System.out.print(line);
				i = i + 5;
			}
			if(j == j1){

				System.out.println(line);
				j = j + 5;

			}
			i1++;
			j1++;
		}
	}
}
