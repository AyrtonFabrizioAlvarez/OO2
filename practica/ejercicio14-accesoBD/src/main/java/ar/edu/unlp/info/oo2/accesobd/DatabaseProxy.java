package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess{
	private boolean logged;
	private DatabaseRealAccess database;
	
	public DatabaseProxy(DatabaseRealAccess database) {
		this.logged = false;
		this.database = database;
	}
	
	public void login() {
		this.logged = true;
	}
	
	public void logout() {
		this.logged = false;
	}

	public Collection<String> getSearchResults(String queryString) {
		if (!this.logged) {
			throw new RuntimeException("necesita loguearse");
		}
		return database.getSearchResults(queryString);
	}


	public int insertNewRow(List<String> rowData) {
		if (!this.logged) {
			throw new RuntimeException("necesita loguearse");
		}
		return database.insertNewRow(rowData);
	}

}
