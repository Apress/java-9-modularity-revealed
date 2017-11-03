
javac -d modules --module-path "automaticModules;modulesLibrary" --module-source-path src $(find src -name "*.java" | grep -v com.apress.moduleB)

cd modules

jar --create --file=../modulesLibrary/com.apress.moduleA.jar -C com.apress.moduleA .

cd ..

javac -d patchModules/com.apress.moduleA -Xmodule:com.apress.moduleA --add-reads com.apress.moduleA=junit --add-modules junit --module-path "modulesLibrary;automaticModules" src/com.apress.moduleB/com/apress/moduleA/EmployeeTest.java

cd patchModules

jar --create --file=../patchModulesLibrary/com.apress.moduleA.jar -C com.apress.moduleA .

cd ..

java --patch-module com.apress.moduleA=patchModules/com.apress.moduleA --module-path "automaticModules;modulesLibrary" --add-reads com.apress.moduleA=junit --add-modules ALL-MODULE-PATH -m junit/org.junit.runner.JUnitCore com.apress.moduleA.EmployeeTest

java --patch-module com.apress.moduleA=patchModulesLibrary/com.apress.moduleA.jar --module-path "automaticModules;modulesLibrary" --add-reads com.apress.moduleA=junit --add-modules ALL-MODULE-PATH -m junit/org.junit.runner.JUnitCore com.apress.moduleA.EmployeeTest
