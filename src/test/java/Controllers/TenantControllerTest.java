package Controllers;

import org.example.Database.TenantRepository;
import org.example.controllers.TenantController;
import org.junit.*;
import static org.junit.Assert.*;


public class TenantControllerTest {

    TenantRepository tenantRepository = new TenantRepository();
    TenantController controller= new TenantController(tenantRepository);

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Starting testing for lease controller");
    }

    @Test
    public void testAddTenant()  {
        //arrange

        //act
        //assert
        assertEquals(1,tenantRepository.getAll().size());
    }
}
