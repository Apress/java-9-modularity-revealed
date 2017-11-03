module com.apress.providerB {
	 requires com.apress.moduleA;
	 provides com.apress.moduleA.interfaces.ServiceExample with com.apress.providerB.ServiceExampleImplementation2;
}

