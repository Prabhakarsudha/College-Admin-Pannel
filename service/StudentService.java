
package com.prabha.service;

import com.prabha.javabean.JavaBean.Student;

public interface StudentService {
    public String addStudent(Student rollNumber);
    public Student searchStudent(String sid);
    public String updateStudent(Student student);
    public String deleteStudent(String rollNumber);
}
