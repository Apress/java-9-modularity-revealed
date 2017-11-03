module com.apress.application {

    requires com.apress.service;

    uses com.apress.service.interfaces.FilePersistenceService;
    uses com.apress.service.interfaces.DatabasePersistenceService;
}

	