/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.sat.itmd4515.pnaika.mp4.ejb;

import edu.iit.sat.itmd4515.pnaika.mp4.domain.Address;
import edu.iit.sat.itmd4515.pnaika.mp4.domain.Employee;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Prashanth
 */
@Stateless
public class AddressService extends AbstractService<Address> {

    public AddressService() {
        super(Address.class);
    }

    @Override
    public List<Address> findAll() {
        return getEntityManager().createNamedQuery("Address.findAll",Address.class).getResultList();
    }
    public Address findById(Long addressId) {
        return getEntityManager().createNamedQuery("Address.findAll",Address.class).setParameter("address_id", addressId).getSingleResult();
    }

}
