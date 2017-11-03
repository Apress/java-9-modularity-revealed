#Run Jdeps on news.jar
jdeps -cp "lib/gson-2.8.0.jar;lib/guava-21.0.jar;lib/slf4j-api-1.7.25.jar;lib/slf4j-simple-1.7.25.jar;lib/news.jar" -s lib/news.jar

#Compile
javac -d modules --module-path lib --module-source-path src -m news

#Create a modular JAR file
jar --create --file lib/news.jar -C modules/news .

#Run the application from the class path
java --add-modules java.sql --module-path lib -m news/org.news.Main