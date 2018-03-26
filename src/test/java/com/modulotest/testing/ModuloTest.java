package com.modulotest.testing;

import org.junit.jupiter.api.*;

import com.moduloclass.testing.Modulo;

class FizzBuzzTest {

	//	declaration d objet, pads encore instancie
    public Modulo fB;

    @BeforeEach
    public void setUp() {
    	// initialisation de l ccobjesd
        fB = new Modulo();
    }
 // a titre d information
    @DisplayName("Spielen mit nummmer = 1")
    @Test
    public void testNumber() {
    	//hadik fizzbuzz retourne un nombre et le compare avec 1
        String Spiel = fB.play(1);
        Assertions.assertEquals(Spiel, "1");
    }

    @DisplayName("Spielen mit nummmer = 3")
    @Test
    public void testFizz() {
        String Spiel = fB.play(3);
        Assertions.assertEquals(Spiel, "Tic");
    }

    @DisplayName("Spielen mit nummmer = 5")
    @Test
    public void testBuzz() {
        String Spiel = fB.play(5);
        Assertions.assertEquals(Spiel, "Tac");
    }

    @DisplayName("Nicht mit den nummero 0 spielen ")
    @Test
    // l'affichage de l exception true
    public void testZero() {

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> fB.play(0));
    }
    // pour instancier a 0, machi instance fo9 i

    @AfterEach
    public void tearDown() {
        fB = null;
    }

}