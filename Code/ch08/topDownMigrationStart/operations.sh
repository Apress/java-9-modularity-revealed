# Compile the application from the class path
javac -d out -cp "lib/gson-2.8.0.jar;lib/guava-21.0.jar;lib/slf4j-api-1.7.25.jar;lib/slf4j-simple-1.7.25.jar" $(find src -name '*.java')

# Create JAR file
jar --create --file lib/news.jar -C out .

# Run the application from the class path
java -cp "lib/gson-2.8.0.jar;lib/guava-21.0.jar;lib/slf4j-api-1.7.25.jar;lib/slf4j-simple-1.7.25.jar;lib/news.jar" org.news.Main

# Run Jdeps on news.jar
jdeps -cp "lib/gson-2.8.0.jar;lib/guava-21.0.jar;lib/slf4j-api-1.7.25.jar;lib/slf4j-simple-1.7.25.jar;lib/news.jar" -s lib/news.jar