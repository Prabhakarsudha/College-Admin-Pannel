
package com.prabha.factory;

import com.prabha.dao.StudentDao;
import com.prabha.dao.StudentDaoImpl;

public class StudentDaoFactory {
    private static StudentDao studentDao = null;
        static {
             studentDao = new StudentDaoImpl() ;
          }
        public static StudentDao getStudentDao() {
          return studentDao;
          }
        }
