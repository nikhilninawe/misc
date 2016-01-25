db.Advertiser.findOne({_id : 158}).segmentList.forEach(function(seg){
	seg = db.SegmentDB.findOne({_id : seg.$id});
	if(!seg.supplyInfo){
		print(JSON.stringify(seg))
	}

});


s  = [
      {
    	  "className" : "com.ozone.db.AppnexusExchangeInfo",
    	  "name" : "appnexus",
    	  "code" : "T1SEG893"
      }
      ];

y =[ DBRef("SegmentDB", NumberLong(890)),
DBRef("SegmentDB", NumberLong(891)),
DBRef("SegmentDB", NumberLong(892)),
DBRef("SegmentDB", NumberLong(893)),
DBRef("SegmentDB", NumberLong(1107)),
DBRef("SegmentDB", NumberLong(1156)),
DBRef("SegmentDB", NumberLong(1158))]

> db.Advertiser.find({_id : 158}).pretty()
{
	"_id" : NumberLong(158),
	"advertiserName" : "Coding Dojo",
	"advertiserType" : 9,
	"baseURL" : "http://www.codingdojo.com/",
	"clientId" : "494882000000845001",
	"region" : "Washington",
	"address" : [
		"10777 Main Street ",
		"#300"
	],
	"city" : "Bellevue",
	"country" : "United States",
	"zipCode" : "98004",
	"flexiPresent" : 1,
	"flexiMoneyAdd" : false,
	"lastFlexiFiredHour" : NumberLong("1450840677853"),
	"supplyInfo" : [
		{
			"className" : "com.ozone.db.AppnexusExchangeInfo",
			"name" : "appnexus",
			"code" : "T1ADV158"
		}
	],
	"campaignList" : [
		DBRef("CampaignDB", NumberLong(93)),
		DBRef("CampaignDB", NumberLong(94)),
		DBRef("CampaignDB", NumberLong(135)),
		DBRef("CampaignDB", NumberLong(136)),
		DBRef("CampaignDB", NumberLong(137)),
		DBRef("CampaignDB", NumberLong(141)),
		DBRef("CampaignDB", NumberLong(142)),
		DBRef("CampaignDB", NumberLong(143))
	],
	"segmentList" : [
		DBRef("SegmentDB", NumberLong(890)),
		DBRef("SegmentDB", NumberLong(891)),
		DBRef("SegmentDB", NumberLong(892)),
		DBRef("SegmentDB", NumberLong(893)),
		DBRef("SegmentDB", NumberLong(894)),
		DBRef("SegmentDB", NumberLong(1107)),
		DBRef("SegmentDB", NumberLong(1156)),
		DBRef("SegmentDB", NumberLong(1158))
	],
	"version" : NumberLong("1450754307080")
}


> db.SegmentDB.find({_id : 894}).pretty()
{
	"_id" : NumberLong(894),
	"advertiserId" : NumberLong(158),
	"segmentName" : "Home Page Visitors",
	"segmentType" : 1,
	"patterns" : [
		"/"
	],
	"activeUsers" : NumberLong(0),
	"creationTime" : NumberLong("1450754307149")
}
