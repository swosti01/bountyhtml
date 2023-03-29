
package userservice;

import DBConnection.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.employee;

public class userservice {
     public void insertuser(employee ep){
        String query= "insert into userinfo (Fullname, Workemail,Password,Department,Post,Phonenumber,Address)" + "values(?,?,?,?,?,?,?)";
        PreparedStatement ps = new DBConnection().getStatement(query);
        try{
//            ps.setInt(1,ep.getEmployee_Id());
            ps.setString(1,ep.getFullname());
            ps.setString(2,ep.getWorkemail());
            ps.setString(3,ep.getPassword());
            ps.setString(4,ep.getDepartment());
            ps.setString(5,ep.getPost());
            ps.setString(6,ep.getPhonenumber());
            ps.setString(7,ep.getAddress());
            ps.execute();
        }catch(SQLException e){
            System.out.println("error" +e);
        }
        
    }
     
      public employee getUser(String Workemail, String Password){
        employee emp = null;
        String query = "select * from userinfo where Workemail=? and Password=?";
        PreparedStatement ps = new DBConnection().getStatement(query);
        try{
            ps.setString(1,Workemail);
            ps.setString(2,Password);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                emp = new employee();
//                emp.setId(rs.getInt("id"));
                emp.setWorkemail(rs.getString("Workemail"));
//                emp.setFullname(rs.getString("fullname"));
                emp.setPassword(rs.getString("Password"));
            }
        }
         catch(SQLException e){
            e.printStackTrace();
        }
        return emp;
    }
    public static void main(String[] args) {
        userservice us = new userservice();
        employee emp= new employee();
        emp.setFullname("kritesh");
        emp.setWorkemail("swosti@bounty.com");
        emp.setPassword("123");
        emp.setDepartment("IT");
        emp.setPost("Senior");
        emp.setPhonenumber("123456");
        emp.setAddress("Nepal");
        us.insertuser(emp);
    }
    
    
    
}
