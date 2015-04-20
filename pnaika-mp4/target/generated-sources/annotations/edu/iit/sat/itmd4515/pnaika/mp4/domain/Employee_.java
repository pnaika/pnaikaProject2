package edu.iit.sat.itmd4515.pnaika.mp4.domain;

import edu.iit.sat.itmd4515.pnaika.mp4.domain.Address;
import edu.iit.sat.itmd4515.pnaika.mp4.domain.security.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-15T15:30:06")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, Address> address;
    public static volatile SingularAttribute<Employee, Date> EmpLastUpdated;
    public static volatile SingularAttribute<Employee, String> emp_phone;
    public static volatile SingularAttribute<Employee, String> emp_name;
    public static volatile SingularAttribute<Employee, User> user;
    public static volatile SingularAttribute<Employee, String> emp_email;
    public static volatile SingularAttribute<Employee, Long> emp_id;

}