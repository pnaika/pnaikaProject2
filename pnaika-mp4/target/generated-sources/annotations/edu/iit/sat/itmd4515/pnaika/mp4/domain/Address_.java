package edu.iit.sat.itmd4515.pnaika.mp4.domain;

import edu.iit.sat.itmd4515.pnaika.mp4.domain.Customer;
import edu.iit.sat.itmd4515.pnaika.mp4.domain.Employee;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-15T15:30:06")
@StaticMetamodel(Address.class)
public class Address_ { 

    public static volatile SingularAttribute<Address, Employee> owner;
    public static volatile SingularAttribute<Address, String> address_type;
    public static volatile SingularAttribute<Address, Long> address_id;
    public static volatile SingularAttribute<Address, String> address_state;
    public static volatile SingularAttribute<Address, Date> AddressLastUpdate;
    public static volatile SingularAttribute<Address, String> address_zip;
    public static volatile SingularAttribute<Address, Customer> cust;
    public static volatile SingularAttribute<Address, String> address_city;

}