
# Create a new directory 
mkdir -p output

# Compile the application
javac -d output --module-source-path src $(find . -name "*.java")  

# Run the application
java --module-path output -m com.apress.consumer/com.apress.consumer.Main


