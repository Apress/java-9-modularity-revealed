#Compile
javac -d modules --module-path "automaticModules;modulesLibrary" --module-source-path src $(find src -name "*.java")

#Create JARs
cd modules
jar --create --file=../modulesLibrary/com.apress.moduleA.jar -C com.apress.moduleA .
jar --create --file=../modulesLibrary/com.apress.moduleB.jar -C com.apress.moduleB .

#Run the application
cd ..
java --module-path "automaticModules;modulesLibrary" --add-modules ALL-MODULE-PATH -m junit/org.junit.runner.JUnitCore com.apress.moduleB.EmployeeTest