package edu.iit.sat.itmd4515.pnaika.mp4.domain;

import edu.iit.sat.itmd4515.pnaika.mp4.domain.Customer;
import edu.iit.sat.itmd4515.pnaika.mp4.domain.Employee;
import edu.iit.sat.itmd4515.pnaika.mp4.domain.Parking;
import edu.iit.sat.itmd4515.pnaika.mp4.domain.Payment;
import edu.iit.sat.itmd4515.pnaika.mp4.domain.Vehicle;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-15T15:30:06")
@StaticMetamodel(Billing.class)
public class Billing_ { 

    public static volatile SingularAttribute<Billing, Parking> parking;
    public static volatile SingularAttribute<Billing, Date> bill_date;
    public static volatile SingularAttribute<Billing, Long> billing_id;
    public static volatile SingularAttribute<Billing, Payment> payment;
    public static volatile SingularAttribute<Billing, Employee> employee;
    public static volatile SingularAttribute<Billing, Customer> customer;
    public static volatile SingularAttribute<Billing, Vehicle> vehicle;
    public static volatile ListAttribute<Billing, Vehicle> vehicleM;

}