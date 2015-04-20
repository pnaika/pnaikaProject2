package edu.iit.sat.itmd4515.pnaika.mp4.domain;

import edu.iit.sat.itmd4515.pnaika.mp4.domain.Customer;
import edu.iit.sat.itmd4515.pnaika.mp4.domain.Vehicle;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-15T15:30:06")
@StaticMetamodel(Parking.class)
public class Parking_ { 

    public static volatile SingularAttribute<Parking, Date> parking_date;
    public static volatile SingularAttribute<Parking, Integer> parking_hours;
    public static volatile SingularAttribute<Parking, Integer> parking_amount;
    public static volatile SingularAttribute<Parking, String> parking_slotname;
    public static volatile SingularAttribute<Parking, Long> parking_id;
    public static volatile SingularAttribute<Parking, Customer> customer;
    public static volatile SingularAttribute<Parking, Vehicle> vehicle;

}