package com.peter.stu_manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//localhost:1521/XE",
                    "hari",
                    "hari"
            );

            System.out.println("CONNECTED SUCCESSFULLY");
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}