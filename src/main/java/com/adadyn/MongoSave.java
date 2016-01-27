package com.adadyn;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;

public class MongoSave {

	public static void main(String[] args) throws IOException {
		Morphia m = new Morphia();
		MongoClient mc = new MongoClient();
		TestDao dao = new TestDao(mc, m);
		List<String> res = listFilesForFolder(new File("templates"));
		for(String file : res){
			String text = FileUtils.readFileToString(new File(file));
			Test t = new Test();
			t.setData(text);
			t.setName(file);
			Key<Test> key = dao.save(t);
			System.out.println("Id is :" + key.getId());
		}
	}
	
	public static List<String> listFilesForFolder(final File folder) {
		List<String> result = new ArrayList<String>();
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            listFilesForFolder(fileEntry);
	        } else {
	            result.add(fileEntry.getAbsolutePath());
	        }
	    }
	    return result;
	}

}
