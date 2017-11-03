package com.apress.application;

import com.apress.service.interfaces.*;
import java.util.ServiceLoader;

public class Main {

	public static void main(String[] args) {

		FilePersistenceService filePersistenceService = ServiceLoader.load(FilePersistenceService.class).iterator().next();
		filePersistenceService.saveMessageIntoFile("First message save into the file");

		DatabasePersistenceService databasePersistenceService = ServiceLoader.load(DatabasePersistenceService.class).iterator().next();
		databasePersistenceService.saveMessageIntoDatabase("Second message saved into the database");
	}
}
