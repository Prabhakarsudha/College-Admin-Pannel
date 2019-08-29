
package com.prabha.javabean;
import com.prabha.gui.UpdateStudent;

public class JavaBean {
    public class Student {
          
           private String name;
           private String rollNumber; 
           private String totalFee ;
           private String feePaid ;
           private String branch ;
           private String feeDue; 
           private String email ;
           private String contactNumber;
           private String address;
           public String getname() {
            return name;
              }
             public void setname(String name) {
                this.name = name;
             }
            public String getrollNumber() {
                return rollNumber;
            }
            public void setrollNumber(String rollNumber) {
               this.rollNumber = rollNumber;
              }
            public String gettotalFee() {
                return totalFee;
            }
            public void setSaddr(String totalFee) {
              this.totalFee = totalFee;
            }
            public String feePaid() {
            return feePaid;
              }
            
            public void setfeePaid(String feePaid) {
              this.feePaid = feePaid;
            }
             public String branch() {
                return branch;
            }
            public void setbranch(String branch) {
              this.branch = branch;
            }
             public String feeDue() {
                return feeDue;
            }
            public void setfeeDue(String feeDue) {
              this.feeDue = feeDue;
            }
             public String email() {
                return email;
            }
            public void email(String email) {
              this.email = email;
            }
      public String contactNumber() {
                return contactNumber;
            }
            public void contactNumber(String contactNumber) {
              this.contactNumber = contactNumber;
            }
            public String address() {
                return address;
            }
            public void address(String address) {
              this.address = address;
            }
}

}
