module com.apress.providerA {
	 requires com.apress.moduleA;

	 provides com.apress.moduleA.interfaces.ServiceExample with com.apress.providerA.ServiceExampleImplementation1;
}

