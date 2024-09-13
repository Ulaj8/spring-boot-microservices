package com.programmingtechie.inventoryservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")  // "test" profilini kullanarak H2 veritabanını etkinleştirir
class InventoryServiceApplicationTests {

    @Test
    void contextLoads() {
        // Test kodlarınız burada
    }
}
