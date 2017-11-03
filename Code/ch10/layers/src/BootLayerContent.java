import java.lang.ModuleLayer;

public class BootLayerContent {

    public static void main(String[] args) {
		ModuleLayer moduleLayer = ModuleLayer.boot();

		moduleLayer.modules().stream().forEach(module -> {
			String moduleName = module.getName();
			System.out.println("Name of the module is: " + moduleName);
		});
	}

}
