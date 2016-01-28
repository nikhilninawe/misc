package com.adadyn;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;

public class MongoSave {

	public static void main(String[] args) throws IOException {
		Morphia m = new Morphia();
		MongoClient mc = new MongoClient();
		TestDao dao = new TestDao(mc, m);
		dao.deleteByQuery(dao.createQuery());
		List<String> res = listFilesForFolder(new File("templates/hotels"),new File("templates/retail"),new File("templates/travel"));
		for(String file : res){
			String text = FileUtils.readFileToString(new File(file));
			Test t = new Test();
			t.setData(text);
			t.setName(file);
			String[] fileNameSpit = file.split("/");
			String cananicalName = fileNameSpit[fileNameSpit.length -1];
			String[] bannserSizeAndLayout = cananicalName.replace("bannerLayout", "").replace(".html", "").split("_");
			t.setBannerSize(bannserSizeAndLayout[0]);
			t.setLayoutId(Integer.parseInt(bannserSizeAndLayout[1]));
			if(file.contains("retail")){
				t.setVertical(1);
			}else if(file.contains("travel")){
				t.setVertical(3);
			}else if(file.contains("hotels")){
				t.setVertical(8);
			}
			dao.save(t);
		}
	}

	public static List<String> listFilesForFolder(final File... folders) {
		List<String> result = new ArrayList<String>();
		for(File folder : folders){
			for (final File fileEntry : folder.listFiles()) {
				if (fileEntry.isDirectory()) {
					listFilesForFolder(fileEntry);
				} else {
					result.add(fileEntry.getAbsolutePath());
				}
			}
		}
		return result;
	}

}
