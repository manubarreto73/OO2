package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class SecureDatabase implements DatabaseAccess {
    
    private DatabaseRealAccess DB;
    private String password;
    private boolean logged;

    public SecureDatabase (DatabaseRealAccess DB, String pwd) {
        this.DB = DB;
        this.password = pwd;
        this.logged = false;
    }

    public boolean login (String pwd) {
        if (this.password.equals(pwd)) {
            this.logged = true;
        }
        return this.logged;
    }

    public void logout () {
        this.logged = false;
    }

    @Override
    public Collection<String> getSearchResults(String queryString) {
        if (!this.logged) {
            throw new RuntimeException("Not logged");
        }
        return this.DB.getSearchResults(queryString);
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        if (!this.logged) {
            throw new RuntimeException("Not logged");
        }
        return this.DB.insertNewRow(rowData);
    }

}
