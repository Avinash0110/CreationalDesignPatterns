package com.avinash.objectpoolpattern;

public class Reusable {

    private String JDBCConnection="JDBCConnection";
    public Reusable() {}

    public Reusable(String JDBCConnection) {
        this.JDBCConnection = JDBCConnection;
    }

    @Override
    public String toString() {
        return "Reusable{" +
                "JDBCConnection='" + JDBCConnection + '\'' +
                '}';
    }
}
