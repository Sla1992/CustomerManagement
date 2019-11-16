package com.bharath.location.entities;

import com.bharath.location.repos.CustomerRepository;
import org.jboss.arquillian.container.test.api.*;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Hashtable;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class CustomerTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Customer.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Before
    public void setUp() throws Exception {
        try {
            final Hashtable<String, Comparable> jndiProperties =
                    new Hashtable<String, Comparable>();

            jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,
                    "org.jboss.naming.remote.client.InitialContextFactory");

            jndiProperties.put("jboss.naming.client.ejb.context", true);

            jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
            jndiProperties.put(Context.SECURITY_PRINCIPAL, "admin");
            jndiProperties.put(Context.SECURITY_CREDENTIALS, "sicher");

            final Context context = new InitialContext(jndiProperties);

            final String lookupName =
                    "CustomerManagement/CustomerManagementEJB/CustomerBean!com.cm.ejb.interfaces.CustomerDAO";

            repository = (CustomerRepository) context.lookup(lookupName);

        } catch (Exception ex) {
            throw ex;
        }
    }

    @Test
    public void getAdress_fk() {
    }

    @Test
    public void getIdCustomer() {
    }

    @Test
    public void setIdCustomer() {
    }

    @Test
    public void getLast_name() {
    }

    @Test
    public void setLast_name() {
    }

    @Test
    public void getFirst_name() {
    }

    @Test
    public void setFirst_name() {
    }

    @Test
    public void setAdress_fk() {
    }

    @Test
    public void getContact_fk() {
    }

    @Test
    public void setContact_fk() {
    }

    @Test
    public void testToString() {
    }

    private CustomerRepository repository;



    @Test
    public void test() {
        assertNotNull(repository);

        // Customer anlegen
        Customer customer = new Customer();
        customer.setFirst_name("Karsten");
        customer.setLast_name("Samaschke");
        customer.setContact_fk(1);
        customer.setAdress_fk(1);

        Customer result = repository.create(customer);
        assertNotEquals(result.getIdCustomer(), 1);

    }

}
