
# Create a new directory 
mkdir -p output

# Compile the application
javac -d output --module-source-path src $(find . -name "*.java")  


