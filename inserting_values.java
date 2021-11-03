package mulesoft;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

import java.sql.Statement;
public class movies {
public static void main(String args[])
{
try
{
  Connection con = null;

  Driver d = new com.mysql.cj.jdbc.Driver();
  DriverManager.registerDriver(d);
  System.out.println("Driver Class Loaded");


  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yuktha","root","root");
  
  Statement stmt1 = con.createStatement();
  Statement stmt2 = con.createStatement();
  Statement stmt3 = con.createStatement();
  String sql1 = "insert into datatable values('Five Feet Apart','Cole Sprouse','Haley Lu Richard','Justin Baldoni',2019)";
  String sql2 = "insert into datatable values('Me Before You','Sam Clafin','Emilia Clark','Thea Sharrock',2016)";
  String sql3 = "insert into datatable values('The Notebook','Ryan Gosling','Rachel McAdams','Nick Cassavetes',2004)";
    stmt1.executeUpdate(sql1);
    stmt2.executeUpdate(sql2);
    stmt3.executeUpdate(sql3);
    System.out.println("Records inserted successfully!");
  con.close();



  con.close();



}
catch(Exception e)
{
System.out.println(e);
}
}
}