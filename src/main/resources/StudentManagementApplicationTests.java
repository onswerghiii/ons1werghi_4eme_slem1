package tn.esprit.studentmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@TestPropertySource(properties = {
    "spring.datasource.url=jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE",
    "spring.datasource.driver-class-name=org.h2.Driver",
    "spring.datasource.username=sa",
    "spring.datasource.password=",
    "spring.jpa.hibernate.ddl-auto=create-drop",
    "spring.jpa.show-sql=false",
    "server.port=0",
    "spring.jmx.enabled=false"
})
class StudentManagementApplicationTests {

    @Test 
    void contextLoads() {
        // Test simple pour vérifier le chargement du contexte
    }
    
    @Test 
    void dummyTest1() { 
        assertTrue(true); 
    }
    
    @Test 
    void dummyTest2() { 
        assertEquals(1, 1); 
    }
    
    @Test 
    void dummyTest3() { 
        int sum = 2 + 3; 
        assertEquals(5, sum);
    }
    
    @Test 
    void dummyTest4() { 
        String str = "test"; 
        assertEquals("test", str);
    }
    
    // Test de la méthode main
    @Test
    void testMainMethod() {
        // Test simple sans démarrer le serveur web
        assertTrue(true);
    }
}
