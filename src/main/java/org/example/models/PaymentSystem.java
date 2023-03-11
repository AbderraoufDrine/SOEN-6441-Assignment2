package org.example.models;

import java.util.HashMap;

/**
 * This is the model of the payment system
 * that uses the Singleton design pattern
 */

public class PaymentSystem {
    public static volatile PaymentSystem instance;
    private HashMap<Tenant,Boolean> map;

    /**
     * Default constructor
     */
    private PaymentSystem(){
        map = new HashMap<>();
    }

    /**
     * Singleton Instance
     */
    public static PaymentSystem getInstance(){
        if(instance == null){
            synchronized (PaymentSystem.class){
                if(instance == null){
                    instance = new PaymentSystem();
                }
            }
        }
        return instance;
    }

    /**
     * @return the if the payment went through
     */
    public boolean pay(Tenant obj){
        return map.put(obj, true);
    }

    /**
     * @return the tenants who have paid the rent
     */
    @Override
    public String toString() {
        String output = "";
        for(Tenant key: map.keySet())
            output = output + key + " " + map.get(key) + "\n";

        return output;
    }
}
