package com.adadyn;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;

public class MongoSave {

	public static void main(String[] args) throws IOException {
		Morphia m = new Morphia();
		MongoClient mc = new MongoClient();
		TestDao dao = new TestDao(mc, m);
		String text = FileUtils.readFileToString(new File("text.html"));
		System.out.println(text);
		Test t = new Test();
		t.setData(text);
		dao.save(t);
	}

}
