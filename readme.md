* cp ~/workspace/acecreativetemplates/retail/Layout1/* templates/
* cp ~/workspace/acecreativetemplates/retail/Layout2/* templates/
* cp ~/workspace/acecreativetemplates/retail/Layout3/* templates/
* cp ~/workspace/acecreativetemplates/retail/Layout4/* templates/

* java -jar build/libs/misc.jar
* rm output
* mongo test template.js >output
* Remove first two lines from output and paste the remaining data in masterdata.js