package iti.jets;

import java.util.*;

import jakarta.persistence.*;

public class EmpDBC_Q {
   static EntityManagerFactory emf = Persistence.createEntityManagerFactory("lab3");
   static EntityManager em = emf.createEntityManager();

   public List<Employees> findByEmployeeName(String firstName) {
      Query findByEmployeeNAme = em.createQuery("from Employees e where e.firstName like:firstName")
            .setParameter("firstName", firstName);
      return findByEmployeeNAme.getResultList();
   }

   public void printResult(Employees s) {
      System.out.println("Employee name : " + s.getFirstName() + " " + "Employee id :" + s.getEmpNo());
   }
}
