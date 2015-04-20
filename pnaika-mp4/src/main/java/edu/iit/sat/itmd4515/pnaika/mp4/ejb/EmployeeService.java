/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.sat.itmd4515.pnaika.mp4.ejb;


import edu.iit.sat.itmd4515.pnaika.mp4.domain.Employee;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author prashanth
 */
@Stateless
public class EmployeeService extends AbstractService<Employee> {

    public EmployeeService() {
        super(Employee.class);
    }

    @Override
    public List<Employee> findAll() {
        return getEntityManager().createNamedQuery("Employee.findAll",Employee.class).getResultList();
    }

    public Employee findByUsername(String username) {
        return getEntityManager().createNamedQuery("Employee.findByUsername",Employee.class).setParameter("username", username).getSingleResult();
    }

}
