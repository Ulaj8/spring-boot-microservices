package com.programmingtechie.orderservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // Test profili ile çalıştır
class OrderServiceApplicationTests {

    @Test
    void contextLoads() {
        // Basit context yükleme testi
    }

}
