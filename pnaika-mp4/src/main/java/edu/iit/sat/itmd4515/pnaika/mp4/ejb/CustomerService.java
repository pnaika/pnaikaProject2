/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.sat.itmd4515.pnaika.mp4.ejb;

import edu.iit.sat.itmd4515.pnaika.mp4.domain.Customer;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author prashanth
 */
@Stateless
public class CustomerService {

    @PersistenceContext(unitName = "pnaikaPU")
    private EntityManager em;

    public CustomerService() {
    }

    public void create(Customer c) {
        em.persist(c);
    }

    public void update(Customer c) {
        em.merge(c);
    }

    public void remove(Customer c) {
        em.remove(c);
    }

    public Customer find(long id) {
        return em.find(Customer.class, id);
    }

    public List<Customer> findAll() {
        return em.createNamedQuery("Customer.findAll",
                Customer.class).getResultList();
    }

    public Customer findByUsername(String userName) {
        return em.createNamedQuery("Customer.findByUsername",
                Customer.class)
                .setParameter("username", userName)
                .getSingleResult();
    }
    
    
}
