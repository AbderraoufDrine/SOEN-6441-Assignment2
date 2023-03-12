package org.example.controllers;

import org.example.Database.LeaseRepository;
import org.example.models.PaymentSystem;
import org.example.models.Tenant;


/**
 * This is the payment controller
 * which performs every operation
 * regarding the tenants paying for
 * their rented property
 */
public class PaymentController {
    private PaymentSystem system;

    LeaseRepository leaseRepository;

    /**
     * Constructor
     */
    public PaymentController(LeaseRepository leaseRepository){
        system = PaymentSystem.getInstance();
        this.leaseRepository = leaseRepository;
    }

    /**
     * @return a string indicating if
     * a tenant has payed the rent
     */
    public String payRent(String name){
        Tenant tenant = leaseRepository.getSingleTenant(name);
        if(system.pay(tenant).equals("Success"))
            return (tenant.getName()+ " " + "has paid the rent");
        else
            return ("The rent is not paid");
    }

    /**
     * Display all tenants who paid the rent
     */
    public void displayAllPaidTenants(){
        try {
            System.out.println(system.toString());
        }
        catch (Exception e){
            System.out.println("It seems something went wrong");
        }

    }



}
