package edu.bdeb.dal;

import edu.bdeb.dl.DBConnector;
import edu.bdeb.modele.Banque;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class IDBBanqueDAO implements IBanqueDAO {
 DBConnector dbConnector;

    public IDBBanqueDAO() {
        this.dbConnector = DBConnector.getInstance();
    }

    @Override
    public float trouverTauxParBanque(String nom) {
 //JDBC API
        Banque banque=null;
        Connection conn = this.dbConnector.getConnection();
        String sql = QueryBox.TROUVER_TAUX_PAR_BANQUE;
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, nom);
            ResultSet cursor = pst.executeQuery();
            if(cursor.next()) {
                return cursor.getFloat("tauxInteretAnnuel");

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //conn.close();

        return 0;
    }

    @Override
    public Banque trouverTauxInteretPlusBas() {
        return null;
    }

    @Override
    public List<Banque> trouverToutBanqueParType(String type) {
        return List.of();
    }
}
