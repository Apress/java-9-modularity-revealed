# Compile
javac -d output --module-source-path src $(find . -name "*.java")  

# Link 
jlink --module-path "output;$JAVA_HOME/jmods" 
	  --add-modules com.apress.application 
	  --add-modules com.apress.databasepersistence
	  --add-modules com.apress.filepersistence
	  --output runtimeImage


