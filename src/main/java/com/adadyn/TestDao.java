package com.adadyn;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

import com.mongodb.MongoClient;

public class TestDao extends BasicDAO<Test, ObjectId>{

	public TestDao(MongoClient mongoClient,
			Morphia morphia) {
		super(mongoClient, morphia, "test");
	}

}
