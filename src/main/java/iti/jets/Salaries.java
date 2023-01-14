// default package
// Generated Jan 14, 2023, 8:48:57 PM by Hibernate Tools 6.1.6.Final
package iti.jets;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.sql.Date;

/**
 * Salaries generated by hbm2java
 */
@Entity
@Table(name="salaries"
    ,catalog="employees"
)
public class Salaries  implements java.io.Serializable {


     private SalariesId id;
     private int salary;
     private Date toDate;

    public Salaries() {
    }

    public Salaries(SalariesId id, int salary, Date toDate) {
       this.id = id;
       this.salary = salary;
       this.toDate = toDate;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="empNo", column=@Column(name="emp_no", nullable=false) ), 
        @AttributeOverride(name="fromDate", column=@Column(name="from_date", nullable=false, length=10) ) } )
    public SalariesId getId() {
        return this.id;
    }
    
    public void setId(SalariesId id) {
        this.id = id;
    }

    
    @Column(name="salary", nullable=false)
    public int getSalary() {
        return this.salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="to_date", nullable=false, length=10)
    public Date getToDate() {
        return this.toDate;
    }
    
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }




}


