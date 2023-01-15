package iti.jets;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        Employees e1 = new Employees();
        
        e1.setBirthDate(new Date());
        e1.setFirstName("SALEM");
        e1.setGender('M');
        e1.setLastName("MOHAMED");
        e1.setHireDate(new Date());

        EmpDBC_Q instance = new EmpDBC_Q();
        // List<Employees> resultList =  instance.findByEmployeeName("Parto");
        // resultList.stream().forEach((Employee)-> instance.printResult(Employee));
        //  instance.updateByEmployeeId(47056, "AHMED");
        instance.insertEmployee(e1);
    }


}
