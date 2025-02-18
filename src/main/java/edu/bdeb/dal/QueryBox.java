package edu.bdeb.dl;

public class QueryBox {

        public static final String FIND_DRIVER_BY_ID =
                "SELECT * " +
                "FROM Banque b " +
                "WHERE b.nom = ? ";

}