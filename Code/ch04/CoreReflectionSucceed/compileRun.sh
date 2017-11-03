
# Create a new directory 
mkdir -p out

# Compile the application
javac -d out --module-source-path src $(find . -name "*.java")  

# Run the application
java --module-path out -m testReflection/testReflection.Main



