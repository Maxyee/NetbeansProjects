/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author eyami
 */
import java.sql.*;

public class DBconnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public DBconnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BMS","root","");
            st = con.createStatement();
        }
           catch(Exception ex){
            System.out.println("Erro: "+ex);
        }
    }
    public void getData(){
        try{
            String query = "SELECT * FROM `Register_Customer`";
            rs = st.executeQuery(query);
            System.out.println("Record from Database");
            
            while(rs.next()){
                String name = rs.getString("name");
                String age = rs.getString("age");
                System.out.println("Name:"+name+" "+"Age: "+age);
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
