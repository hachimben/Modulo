package com.techprimers.testing;

import org.junit.jupiter.api.*;

class FizzBuzzTest {

	//	declaration d objet, pas encore instancie
    public FizzBuzz fB;

    @BeforeEach
    public void setUp() {
    	// initialisation de l objet
        fB = new FizzBuzz();
    }
 // a titre d information
    @DisplayName("Spielen mit nummmer  = 1")
    @Test
    public void testNumber() {
    	//hadik fizzbuzz retourne un nombre et le compare avec 1
        String fizzBuzz = fB.play(1);
        Assertions.assertEquals(fizzBuzz, "1");
    }

    @DisplayName("Spielen mit nummmer = 3")
    @Test
    public void testFizz() {
        String fizzBuzz = fB.play(3);
        Assertions.assertEquals(fizzBuzz, "Fizz");
    }

    @DisplayName("Spielen mit nummmer = 5")
    @Test
    public void testBuzz() {
        String fizzBuzz = fB.play(5);
        Assertions.assertEquals(fizzBuzz, "Buzz");
    }

    @DisplayName("Nicht mit den nummero 0 spielen = 0")
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