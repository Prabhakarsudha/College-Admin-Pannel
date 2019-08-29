
package com.prabha.dao;

import com.prabha.javabean.JavaBean;


public interface StudentDao {
    
    public String search(String rollNumber);
    public String update(JavaBean.Student student);
    public String delete(String rollNumber);      
    public String add(JavaBean.Student student);    
}
