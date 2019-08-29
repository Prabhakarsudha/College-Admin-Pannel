
package com.prabha.service;
import com.prabha.dao.StudentDao;
import com.prabha.factory.StudentDaoFactory;
import com.prabha.javabean.JavaBean.Student;

public abstract class StudentServiceImpl implements StudentService{

public abstract class StudentDaoImpl implements StudentService{

        private String rollNumber;
               @Override
               public String addStudent(Student student) {
                 StudentDao studentDao = StudentDaoFactory.getStudentDao();
                 String status = studentDao.add(student);
                  return status;
               }
                @Override
                public String searchStudent(String sid) {
                  StudentDao studentDao = StudentDaoFactory.getStudentDao();
                   String student = studentDao.search(rollNumber);
                return student;
                  }
             @Override
             public String updateStudent(Student student) {
                  StudentDao studentDao = StudentDaoFactory.getStudentDao();
                  String status = studentDao.update(student);
                    return status;
                }
                @Override
                 public String deleteStudent(String sid) {
                      StudentDao studentDao = StudentDaoFactory.getStudentDao();
                      String status = studentDao.delete(rollNumber);
                    return status;
                   }
                   }

                  }
