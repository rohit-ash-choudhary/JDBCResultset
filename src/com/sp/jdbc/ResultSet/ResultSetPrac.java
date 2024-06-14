package com.sp.jdbc.ResultSet;

import java.sql.*;

public class ResultSetPrac {

    Connection con=null;
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection con=null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root", "Rooh@#2001");


        PreparedStatement pt=con.prepareStatement("select * from account;");
        ResultSet rs=pt.executeQuery();
        while(rs.next())
        {
            int myaccountnumner=rs.getInt("accountnumber");
            String myfirstname=rs.getString("firstname");
            String mylastname=rs.getString("lastname");
            int balance=rs.getInt("balance");
            System.out.println("account number  "+myaccountnumner);
            System.out.println("Fullname  "+ myfirstname+"  " +mylastname);
            System.out.println("balance  "+balance);

        }



    }
}
