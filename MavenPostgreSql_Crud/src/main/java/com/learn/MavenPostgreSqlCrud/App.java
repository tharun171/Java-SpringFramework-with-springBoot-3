package com.learn.MavenPostgreSqlCrud;

import java.sql.*;

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
        System.out.println( "Hello World!" );
        
        /*
         * Execute - return Boolean
         * ExecuteUpdate - return integer
         * ExecuteQuery  - return ResultSet
         * Prepared Statement - ? ordinal start from 1
         * positional parameter = ? = ordinal start with 1
         * Named Parameter = : = :name, this will be passed
         * 
         */
        
        /*
         * CREATING JDBC connection with postgresql
         * import Package
         * Load and Register Driver
         * Create Connection
         * Create Statement
         * Execute Statement
         * Process the results
         * Close the Connection
         */
        
        //Load the Driver
        Class.forName("org.postgresql.Driver");
        
        //Create Connection
        String url = "jdbc:postgresql://localhost:5432/TestDB";
        String user = "postgres";
        String password = "Tharun@1234$$";
        Connection conn = DriverManager.getConnection(url,user,password);
        System.out.println("Connection Established");
       
        //Create Statement
        Statement statement = conn.createStatement();
        
        //GET
        String query1 =  "SELECT \"StudentId\", \"StudentName\", \"StudentRoll\" FROM public.\"StudentTable\"";
        ResultSet rs = statement.executeQuery(query1);
        System.out.println("Getting all--->");
        while(rs.next())
        {
        	System.out.println(rs.getInt(1)+" "+
        rs.getString(2)+" "+rs.getInt(3));
        }
        
        //GET
        System.out.println("Getting All--->");
        String query2 = "Select * from public.\"StudentTable\"";
        ResultSet rs2 = statement.executeQuery(query2);
        while(rs2.next())
        {
        	System.out.println(rs2.getInt("studentId")+" "+rs2.getString("StudentName")+" "+rs2.getInt("StudentRoll"));
        }
        
        //GET by Id
        System.out.println("Getting by id 183--->");
        String query3 = "select * from public.\"StudentTable\" where \"StudentId\" = 183";
        ResultSet rs3 = statement.executeQuery(query3);
        while(rs3.next())
        {
        	System.out.println(rs3.getInt("studentId")+" "+rs3.getString("StudentName")+" "+rs3.getInt("StudentRoll"));
        }
        
        
        //INSERT
        System.out.println("Inserting..");
        String insertQuery = "INSERT INTO public.\"StudentTable\" (\"StudentId\", \"StudentName\", \"StudentRoll\") VALUES (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(insertQuery);
        //ordinal start with 1
        ps.setInt(1,183);
        ps.setString(2,"Zach");
        ps.setInt(3,183);
        Integer noOfRowsUpdated = ps.executeUpdate();
        System.out.println("no of rows Updated: "+noOfRowsUpdated);
        //getting all
        System.out.println("getting All --->");
        ResultSet rs5 = statement.executeQuery(query2);
        while(rs5.next())
        {
        	System.out.println(rs5.getInt("studentId")+" "+rs5.getString("StudentName")+" "+rs5.getInt("StudentRoll"));
        }
        
        
        //UPDATE
        int studentIdToUpdate = 183;
        String newStudentName = "Updated Name";
        int newStudentRoll = 200;
        System.out.println("updating");
        String updateQuery = "UPDATE public.\"StudentTable\" SET \"StudentName\" = '" + newStudentName + "', \"StudentRoll\" = " + newStudentRoll +
                " WHERE \"StudentId\" = " + studentIdToUpdate;
        Integer noOfRowsUpdated2 = statement.executeUpdate(updateQuery);
        System.out.println("noOf Rows Updated -> "+noOfRowsUpdated2);
      //getting all
        System.out.println("getting All --->");
        ResultSet rs6 = statement.executeQuery(query2);
        while(rs6.next())
        {
        	System.out.println(rs6.getInt("studentId")+" "+rs6.getString("StudentName")+" "+rs6.getInt("StudentRoll"));
        }
        
        //DELETE
        String deleteQuery = "DELETE FROM public.\"StudentTable\" WHERE \"StudentId\" = " + "183";
        int rowsDeleted = statement.executeUpdate(deleteQuery);
        System.out.println("Rows deleted: " + rowsDeleted);
        //getting all
        System.out.println("getting All --->");
        ResultSet rs7 = statement.executeQuery(query2);
        while(rs7.next())
        {
        	System.out.println(rs7.getInt("studentId")+" "+rs7.getString("StudentName")+" "+rs7.getInt("StudentRoll"));
        }
        
        
    }
}
