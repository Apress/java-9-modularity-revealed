module com.apress.databasepersistence {

    requires com.apress.service;
    requires java.sql;

    provides com.apress.service.interfaces.DatabasePersistenceService with com.apress.databasepersistence.DatabasePersistenceProvider;
}

	