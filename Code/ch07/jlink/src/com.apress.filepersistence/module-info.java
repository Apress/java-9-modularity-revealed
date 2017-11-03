module com.apress.filepersistence {

    requires com.apress.service;
    provides com.apress.service.interfaces.FilePersistenceService with com.apress.filepersistence.FilePersistenceProvider;
}

	