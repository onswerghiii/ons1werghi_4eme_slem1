package tn.esprit.studentmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentManagementApplicationTests {

    @Test
    void contextLoads() {
        // Test de base pour vérifier que le contexte Spring se charge
    }

    @Test
    void testMainMethod() {
        // Test de la méthode main
        StudentManagementApplication.main(new String[]{});
    }

    @Test
    void testApplicationClass() {
        // Test pour vérifier que la classe peut être instanciée
        StudentManagementApplication app = new StudentManagementApplication();
        assertNotNull(app);
    }

    @Test
    void testGetApplicationName() {
        StudentManagementApplication app = new StudentManagementApplication();
        assertEquals("Student Management Application", app.getApplicationName());
    }

    @Test
    void testGetVersion() {
        StudentManagementApplication app = new StudentManagementApplication();
        assertEquals(1, app.getVersion());
    }
}
