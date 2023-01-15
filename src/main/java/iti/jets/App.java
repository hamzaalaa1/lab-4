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
        EmpDBC_Q instance = new EmpDBC_Q();
        // List<Employees> resultList =  instance.findByEmployeeName("Parto");
        // resultList.stream().forEach((Employee)-> instance.printResult(Employee));
        instance.updateByEmployeeId(47056, "HASSAN");
    }
}
