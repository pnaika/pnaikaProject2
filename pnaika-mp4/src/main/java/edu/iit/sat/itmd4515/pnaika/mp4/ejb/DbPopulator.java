/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.sat.itmd4515.pnaika.mp4.ejb;

import edu.iit.sat.itmd4515.pnaika.mp4.domain.Address;
import edu.iit.sat.itmd4515.pnaika.mp4.domain.Customer;
import edu.iit.sat.itmd4515.pnaika.mp4.domain.Employee;
import edu.iit.sat.itmd4515.pnaika.mp4.domain.security.Group;
import edu.iit.sat.itmd4515.pnaika.mp4.domain.security.User;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Prashanth
 */

@Singleton
@Startup
public class DbPopulator {
    
    @EJB
    private EmployeeService empService;
    
    @EJB
    private CustomerService custService;
    
    @EJB
    private UserService userServive;
    
    @EJB
    private GroupService groupServive;
    
    @EJB
    private AddressService addressService;
    
    public DbPopulator() {
    }
    
    @PostConstruct
    public  void seedDatabase() {
        
        //THIS METHOD WILL PERFORM CRUD TO FATABASE
        
        Group customer = new Group("Customers", "Group of Customers");
        Group employee = new Group("Employees","Group of Employees");
        
        User prash = new User("prashanth", "password");
        User kiran = new User("kiran", "password");
        User kesav = new User("kesav", "password");
        User mouni = new User("mouni", "password");
        User sanjeev = new User("sanjeev", "password");
        User shashank = new User("shashank", "password");
        User ashvik = new User("ashvik", "password");
        User shreyas = new User("shreyas", "password");
        
        prash.addGroup(customer);
        kiran.addGroup(customer);
        mouni.addGroup(customer);
        shreyas.addGroup(customer);
        kesav.addGroup(employee);
        sanjeev.addGroup(employee);
        shashank.addGroup(employee);
        ashvik.addGroup(employee);
        
        Address a1 = new Address("C", "Chicago", "IL", "60616");
        Address a2 = new Address("C", "Bangalore", "Karnataka", "560098");
        Address a3 = new Address("C", "Texas", "TX", "60611");
        Address a4 = new Address("E", "Springfield", "IL", "70616");
        Address a5 = new Address("E", "Shimoga", "Karnataka", "60616");
        Address a6 = new Address("E", "Mumbai", "Maharastra", "12345");
        Address a7 = new Address("C", "Shimoga", "Karnataka", "60616");
        Address a8 = new Address("E", "Mumbai", "Maharastra", "12345");
        
        Customer c1 = new Customer("Prashanth", "3126478554", "pnaika@hawk.iit.edu");
        c1.setUser(prash);
        c1.setAddress(a1);
        
        Customer c2 = new Customer("Kiran", "3126478554", "kiran@hawk.iit.edu");
        c2.setUser(kiran);
        c2.setAddress(a2);
        
        Customer c3 = new Customer("Mouni", "3126478554", "mouni@hawk.iit.edu");
        c3.setUser(mouni);
        c3.setAddress(a3);
        
        Customer c4 = new Customer("Shreyas", "3123654554", "shreyas@hawk.iit.edu");
        c4.setUser(shreyas);
        c4.setAddress(a7);
        
        Employee e1 = new Employee("Kesav", "3698521478", "kesav@iit.edu");
        e1.setUser(kesav);
        e1.setAddress(a4);
        
        Employee e2 = new Employee("Sanjeev", "3698521478", "sanjeev@iit.edu");
        e2.setUser(sanjeev);
        e2.setAddress(a5);
        
        Employee e3 = new Employee("Shashank", "3698521478", "shashank@iit.edu");
        e3.setUser(shashank);
        e3.setAddress(a6);
        
        Employee e4 = new Employee("Ashvik", "30000000000", "ashvik@iit.edu");
        e4.setUser(ashvik);
        e4.setAddress(a8);
        
        //TO CREATE TEST DATA IN DATABASE
        groupServive.create(customer);
        groupServive.create(employee);
        
        userServive.create(prash);
        userServive.create(kiran);
        userServive.create(kesav);
        userServive.create(mouni);
        userServive.create(sanjeev);
        userServive.create(shashank);
        userServive.create(ashvik);
        userServive.create(shreyas);
        
        addressService.create(a1);
        addressService.create(a2);
        addressService.create(a3);
        addressService.create(a4);
        addressService.create(a5);
        addressService.create(a6);
        addressService.create(a7);
        addressService.create(a8);
        
        custService.create(c1);
        custService.create(c2);
        custService.create(c3);
        custService.create(c4);
        
        empService.create(e1);
        empService.create(e2);
        empService.create(e3);
        empService.create(e4);
        
        // PERFORMING DELETE OPERATIONS
        empService.delete(e4);
        custService.remove(c4);
        addressService.delete(a7);
        addressService.delete(a8);
        
        // PERFORMING UPDATE OPERATIONS
        e3.setEmp_email("update@iit.edu");
        empService.update(e3);
        
        c3.setCust_email("update@iit.edu");
        custService.update(c3);
        
        a6.setAddress_city("updatedCity");
        addressService.update(a6);
        
        // PERFORMING READ OPERATIONS
        List<Customer> cust = custService.findAll();
        for(Customer c : cust ){
            System.out.println(c.toString());
        }
        
        List<Employee> emp = empService.findAll();
        for(Employee e :emp ){
            System.out.println(e.toString());
        }
        
        List<Address> add = addressService.findAll();
        for(Address a:add ){
            System.out.println(a.toString());
        }
    }
}
