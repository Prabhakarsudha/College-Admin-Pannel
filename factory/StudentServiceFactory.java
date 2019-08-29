
package com.prabha.factory;
import com.prabha.javabean.JavaBean;
import com.prabha.service.StudentServiceImpl;


     public class StudentServiceFactory {
               private static StudentServiceFactory studentService = null;
                 static {
                  studentService = new StudentServiceImpl();
                 }
            public static StudentServiceFactory getStudentService() {
                  return studentService;
                     }
                   }
