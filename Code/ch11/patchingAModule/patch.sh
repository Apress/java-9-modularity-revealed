
# Compile module "com.apress.moduleA" and module "com.apress.moduleB"
javac -d modules --module-path modulesLibrary --module-source-path src $(find src -name "*.java" | grep -v com.apress.moduleA2)

# Create modular JARs
cd modules
jar --create --file=../modulesLibrary/com.apress.moduleA.jar -C com.apress.moduleA .
jar --create --file=../modulesLibrary/com.apress.moduleB.jar -C com.apress.moduleB .

# Compile EmployeeImpl.java
cd ..
javac -Xmodule:com.apress.moduleA --module-path modules -d patchModules/com.apress.moduleA src/com.apress.moduleA2/com/apress/moduleA/EmployeeImpl.java

# Create a normal JAR for the EmployeeImpl.class file
cd patchModules
jar --create --file=../patchModulesLibrary/com.apress.moduleA.jar -C com.apress.moduleA .

# Run by patching module "com.apress.moduleA" with the class EmployeeImpl.class file
cd ..
java --patch-module com.apress.moduleA=patchModules/com.apress.moduleA --module-path modulesLibrary -m com.apress.moduleB/com.apress.moduleB.MainClass

# Run by patching module "com.apress.moduleA" with the JAR that contains the EmployeeImpl.class file
java --patch-module com.apress.moduleA=patchModulesLibrary/com.apress.moduleA.jar --module-path modulesLibrary -m com.apress.moduleB/com.apress.moduleB.MainClass