package org.example.controllers;

import org.example.Database.LeaseRepository;
import org.example.Database.RentalUnitRepository;
import org.example.Database.TenantRepository;

import java.text.ParseException;
import java.util.Scanner;

public class ViewController {
    LeaseRepository leaseRepository = new LeaseRepository();
    TenantRepository tenantRepository = new TenantRepository();
    RentalUnitRepository rentalUnitRepository = new RentalUnitRepository();

    TenantController  tenantController= new TenantController(tenantRepository);
    RentalUnitController rentalUnitController = new RentalUnitController(rentalUnitRepository);
    LeaseController leaseController = new LeaseController(tenantRepository,rentalUnitRepository,leaseRepository);

    Scanner input = new Scanner(System.in);

    public void startProgram() throws ParseException {
        //TODO all the menu logic should be here

//        tenantController.createTenant();
//        tenantController.displayTenants();
//        rentalUnitController.createRentalUnit();
//        rentalUnitController.displayAllUnits();
//        leaseController.rentUnit();
//        leaseController.displayLeases();
//        leaseController.displayTenantsInLeases();
//        rentalUnitController.displayRentedUnits();
    }

}
