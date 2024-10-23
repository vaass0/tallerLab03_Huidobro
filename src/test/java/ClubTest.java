import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClubTest {

    @Test
    void registrarDeportistaTest() {
        Club club = new Club();
        assertTrue(club.registrarDeportista("pepe","wasa","futbol","pepewasa@gmail.com"));
        assertFalse(club.registrarDeportista("pepe","wasa","futbol","pepewasa@gmail.com"));
    }

    @Test
    void registrarEntrenador() {
        Club club = new Club();
        assertTrue(club.registrarEntrenador("pepe","mucho tiempo","futbol"));
        assertFalse(club.registrarEntrenador("pepe","mucho tiempo","futbol"));
    }
}