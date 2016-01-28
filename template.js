
ace = db.getSiblingDB('AdadynAceDB');
db.TestDB.find({}).forEach(function(t){
	layout = ace.CreativeTemplateDB.findOne({vertical : t.vertical, _id : t.layoutId});
	if(layout){
		layout.sizeHtmlMap[t.bannerSize] = t.data;
		ace.CreativeTemplateDB.save(layout);
	}else{
		print("Layout Not found in DB " + t.layoutId)
	}
})

ace.CreativeTemplateDB.find({}).forEach(function(t){
	print(JSON.stringify(t) + ",");
})