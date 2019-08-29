
package com.prabha.dao;
import com.prabha.javabean.JavaBean;
import com.prabha.factory.ConnectionFactory;
import com.prabha.factory.StudentServiceFactory;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

public abstract class StudentDaoImpl implements StudentDao{
    
    public String add(StudentServiceFactory student) {
             String status = "";
       try {
        Connection con = ConnectionFactory.getConnection();
        Statement st = con.createStatement();
        Student std = search(student.rollNumber());
       if(std == null) {
           int rowCount = st.executeUpdate("insert into student values('"+student.getname()+"','"+student.rollNumber()+"','"+student.totalFee()+"','"+student.feePaid()+"','"+student.feeDue()+"','"+student.email()+"','"+student.contactNumber()+"','"+student.address()+"')");
     if(rowCount == 1) {
       status = "Student Inserted Successfully";
         }    
     else {
      status = "Student Insertion Failure";
        }
        } 
          else {
           status = "Student Existed Already";
         }
       } 
        catch (Exception e) {
    status = "Student Insertion Failure";
        e.printStackTrace();
          }
     return status;
    }
       @Override
       public String search(String rollNumber) {
              JavaBean student = null;
          try {
           Connection con = ConnectionFactory.getConnection();
           Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student where rollNumber = '"+rollNumber+"'");
              boolean b = rs.next();
              if(b == true) {
                 student = new JavaBean();
                 student.setname(rs.getString("name"));
                 student.setfeePaid(rs.getString("feePaid"));
                 student.setfeeDue(rs.getString("feeDue"));
                 student.setrollNumber(rs.getString("rollNumber"));
             }
              else {
                student = null;
                }
             } 
           catch (Exception e) {
                    e.printStackTrace();
                   }
          return student;
        }
     @Override
     public String update(JavaBean JavaBean) {
              String status = "";
            try {
              Connection con = ConnectionFactory.getConnection();
               Statement st = con.createStatement();
                 int rowCount = st.executeUpdate("update student set name ='"+student.getname()+"',rollNumber = '"+student.rollNumber()+"',totalFee = '"+student.totalFee()+"',feePaid = '"+student.feePaid()+"',feeDue = '"+student.feeDue()+"',email = '"+student.email()+"',contactNumber = '"+student.contactNumber()+"',address ='"+student.address()+"'");
              if(rowCount == 1) {
            status = "Student Updated Successfully";
          }
              else {
          status = "Student Updation Failure";
     }
} 
            catch (Exception e) {
        status = "Student Updation Failure";
        e.printStackTrace();
          }
         return status;
}
               @Override
              public String delete(String rollNumber) {
               String status = "";
             try {
                 Connection con = ConnectionFactory.getConnection();
                 Statement st = con.createStatement();
                 int rowCount = st.executeUpdate("delete from student where rollNumber = '"+rollNumber+"'");
          if(rowCount == 1) {
              status = "Student Deleted Successfully";
              }    
          else {
             status = "Student Deletion Failure";
             }
           } 
             catch (Exception e) {
                status = "Student Deletion Failure";
                 e.printStackTrace();
               }
             return status;
           }
          }

