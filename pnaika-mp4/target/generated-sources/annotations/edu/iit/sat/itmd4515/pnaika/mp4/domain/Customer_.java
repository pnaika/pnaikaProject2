package edu.iit.sat.itmd4515.pnaika.mp4.domain;

import edu.iit.sat.itmd4515.pnaika.mp4.domain.Address;
import edu.iit.sat.itmd4515.pnaika.mp4.domain.Billing;
import edu.iit.sat.itmd4515.pnaika.mp4.domain.Parking;
import edu.iit.sat.itmd4515.pnaika.mp4.domain.security.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-15T15:30:06")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile ListAttribute<Customer, Parking> parking;
    public static volatile SingularAttribute<Customer, Address> address;
    public static volatile SingularAttribute<Customer, Date> CustLastUpdate;
    public static volatile SingularAttribute<Customer, String> cust_email;
    public static volatile SingularAttribute<Customer, String> cust_name;
    public static volatile SingularAttribute<Customer, Long> cust_id;
    public static volatile SingularAttribute<Customer, User> user;
    public static volatile SingularAttribute<Customer, String> cust_phone;
    public static volatile ListAttribute<Customer, Billing> billing;

}