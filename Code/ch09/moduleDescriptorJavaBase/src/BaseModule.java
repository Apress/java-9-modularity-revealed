import java.lang.module.ModuleDescriptor;
import java.lang.module.ModuleFinder;
import java.lang.module.ModuleReference;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;

public class BaseModule {

    public static void main(String[] args) {

        String moduleName;
        Optional<String> mainClass;
        Set<ModuleDescriptor.Exports> exports;
        boolean isAutomatic;
        boolean isOpen;
        Set<String> allPackagesNames;
        Set<ModuleDescriptor.Provides> provides;
        Set<ModuleDescriptor.Requires> dependencies;
        String moduleNameVersion;
        Set<String> serviceDependencies;
        ModuleDescriptor.Version version;

        ModuleFinder finder = ModuleFinder.ofSystem();
        Optional<ModuleReference> moduleReference = finder.find("java.base");

        if(moduleReference.isPresent()) {
            ModuleDescriptor moduleDescriptor = moduleReference.get().descriptor();

            // get the name of the module
            moduleName = moduleDescriptor.name();

            // get the module's main class
            mainClass = moduleDescriptor.mainClass();
            exports = moduleDescriptor.exports();
            isAutomatic = moduleDescriptor.isAutomatic();
            isOpen = moduleDescriptor.isOpen();
            allPackagesNames = moduleDescriptor.packages();
            provides = moduleDescriptor.provides();
            dependencies = moduleDescriptor.requires();
            moduleNameVersion = moduleDescriptor.toNameAndVersion();
            serviceDependencies = moduleDescriptor.uses();

            try {
                Optional<ModuleDescriptor.Version> versionOptional = moduleDescriptor.version();
                version = versionOptional.get();
            }
            catch (NoSuchElementException exception) {
                version = null;
            }

            System.out.println("Module name is: " + moduleName);
            System.out.println();

            System.out.println("Main class is: ");
            if(mainClass.isPresent())  {
                System.out.println(mainClass);
            }
            else {
                System.out.println("Not exists");
            }
            System.out.println();

            System.out.println("The module exports the packages with the following name: ");
            for(ModuleDescriptor.Exports moduleExport : exports) {
                System.out.print(moduleExport.source());
                System.out.print(", ");
            }

            System.out.println();
            System.out.println();
            System.out.println("Is an automatic module: " + isAutomatic);

            System.out.println();
            System.out.println("Is an open module: " + isOpen);

            System.out.println();
            System.out.println("All packages names: ");
            for(String packageName : allPackagesNames) {
                System.out.print(packageName);
                System.out.print(", ");
            }

            System.out.println();
            System.out.println();
            System.out.println("The services provided by the module: ");
            for(ModuleDescriptor.Provides provide : provides) {
                System.out.print("Service " + provide.service());
                for(String p : provide.providers()) {
                    System.out.print(" with providers: " + p);
                    System.out.print(", ");
                }
            }

            System.out.println();
            System.out.println("The name of the dependencies of the module: ");
            for(ModuleDescriptor.Requires dependency : dependencies) {
                System.out.print(dependency.name());
                System.out.print(", ");
            }

            System.out.println();
            System.out.println("Module name and version: " + moduleNameVersion);

            System.out.println();
            System.out.println("The service dependencies of the module: ");
            for(String serviceDependency : serviceDependencies) {
                System.out.print(serviceDependency);
                System.out.print(", ");
            }

            System.out.println();
            System.out.println("The version of the module: " + version);
        }
    }
}
