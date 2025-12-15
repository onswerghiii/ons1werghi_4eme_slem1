package tn.esprit.studentmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
@TestPropertySource(locations = "classpath:application-test.properties")
class StudentManagementApplicationTests {

    @Test
    void contextLoads() {
        // Test de base pour vérifier que le contexte Spring se charge
        assertTrue(true, "Context should load successfully");
    }

    @Test
    void testMainMethod() {
        // Test de la méthode main sans paramètres
        assertDoesNotThrow(() -> {
            StudentManagementApplication.main(new String[]{});
        }, "Main method should execute without throwing exceptions");
    }

    @Test
    void testMainMethodWithArgs() {
        // Test de la méthode main avec arguments
        assertDoesNotThrow(() -> {
            StudentManagementApplication.main(new String[]{"--spring.profiles.active=test"});
        }, "Main method with args should execute without throwing exceptions");
    }

    @Test
    void testApplicationClassInstantiation() {
        // Test pour vérifier que la classe peut être instanciée
        StudentManagementApplication app = new StudentManagementApplication();
        assertNotNull(app, "Application instance should not be null");
    }

    @Test
    void testApplicationProperties() {
        // Test simple pour vérifier des propriétés de base
        StudentManagementApplication app = new StudentManagementApplication();
        assertEquals("Student Management Application", app.getApplicationName(), 
            "Application name should match expected value");
    }
}
