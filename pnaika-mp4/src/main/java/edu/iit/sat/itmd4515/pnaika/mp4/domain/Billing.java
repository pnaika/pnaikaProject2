/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.sat.itmd4515.pnaika.mp4.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 *
 * @author Prashanth
 */
@Entity
@Table
@NamedQueries({
    @NamedQuery(name = "Billing.findById",query = "select b from Billing b where b.billing_id = :billing_id"),
    @NamedQuery(name = "Billing.findAll",query = "select b from Billing b"),
})
public class Billing implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long billing_id;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="Customer_ID")
    private Customer customer;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="Employee_ID")
    private Employee employee;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="Payment_ID")
    private Payment payment;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="Vehicle_ID")
    private Vehicle vehicle;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="Parking_ID")
    private Parking parking;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date bill_date;

    @PreUpdate
    @PrePersist
    private void setBill_date(){
        bill_date = GregorianCalendar.getInstance().getTime();
    }
    
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "vehicleBilling",joinColumns = @JoinColumn(name = "Billing_Id"),
            inverseJoinColumns = @JoinColumn(name = "Vehicle_Id"))
    private List<Vehicle> vehicleM = new ArrayList<>();

    public Billing() {
    }

    
    public List<Vehicle> getVehicleM() {
        return vehicleM;
    }

    public void setVehicleM(List<Vehicle> vehicleM) {
        this.vehicleM = vehicleM;
    }

    public Date getBill_date() {
        return bill_date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Payment getPayment() {
        return payment;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Parking getParking() {
        return parking;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setParking(Parking parking) {
        this.parking = parking;
    }
    
    public Long getBilling_id() {
        return billing_id;
    }
    
    public void setBilling_id(Long billing_id) {
        this.billing_id = billing_id;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setBill_date(Date bill_date) {
        this.bill_date = bill_date;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\n");
        sb.append("------------------------------------------------------");
        sb.append("\n");
        sb.append("billing_id  :").append(billing_id).append("\n");
        sb.append("billing Date  :").append(bill_date).append("\n");
        sb.append("------------------------------------------------------"+"\n");
        return sb.toString();
    }

}