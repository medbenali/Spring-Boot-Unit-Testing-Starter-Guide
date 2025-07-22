package com.esprit.junitdemo;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
//@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
//@DisplayNameGeneration(ReplaceCamelCase.class)

//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.DisplayName.class)
//@TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeAll
    static void setupBeforeEachClass()
    {
        System.out.println("@BeforeAll executes only once before all test methods execution in the class");
    }

    @AfterAll
    static void tearDownAfterAll()
    {
        System.out.println("@AfterAll executes only once after all test methods execution in the class");
    }


    @BeforeEach
    void setupBeforeEach()
    {
        demoUtils = new DemoUtils();
        System.out.println("@BeforeEach executes before the execution of each test method");
    }

    @AfterEach
    void tearDownAfterEach()
    {
        System.out.println("Running @AfterEach");
        System.out.println();
    }

    @Test
    @DisplayName("Equals and Not Equals")
    @Order(1)
    void testEqualsAndNotEquals()
    {
        System.out.println("Running test: testEqualsAndNotEquals");

        // execute and assert
        assertEquals(6, demoUtils.add(2,4), "2+4 must be 6");

        assertNotEquals(6, demoUtils.add(1, 9), "1+9 must not be 6");

    }


    @Test
    @DisplayName("Null and Not Null")
    @Order(0)
    void testNullAndNotNull()
    {
        System.out.println("Running test: testNullAndNotNull");

        String str1 = null;
        String str2 = "esprit";

        assertNull(demoUtils.checkNull(str1),"Object should be null");

        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
    }

    @Test
    @DisplayName("Same and Not Same")
    void testSameAndNotSame()
    {
        String str = "esprit";

        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Objects should refer to same object");

        assertNotSame(str, demoUtils.getAcademy(), "Objects should not refer to same object");
    }

    @Test
    @DisplayName("True and False")
    @Order(30)
    void testTrueFalse()
    {
        int gradeOne = 10;
        int gradeTwo = 5;

        assertTrue(demoUtils.isGreater(gradeOne, gradeTwo), "This should return True");

        assertFalse(demoUtils.isGreater(gradeTwo, gradeOne), "This should return False");
    }

    @Test
    @DisplayName("Array Equals")
    void testArrayEquals()
    {
        String [] stringArray = { "A", "B", "C"};

        assertArrayEquals(stringArray, demoUtils.getFirstThreeLettersOfAlphabet(),"Arrays should be the same");

    }

    @Test
    @DisplayName("Iterable equals")
    void testIterableEquals(){

        List<String> theList = List.of("es", "pr", "it");

        assertIterableEquals(theList, demoUtils.getAcademyInList(), "Expected list should be same as actual list");
    }

    @Test
    @DisplayName("Lines match")
    @Order(50)
    void testLinesMatch()
    {
        List<String> theList = List.of("es", "pr", "it");

        assertLinesMatch(theList, demoUtils.getAcademyInList(),"Lines should match");
    }

    @Test
    @DisplayName("Throws and Does Not Throw ")
    void testThrowsAndDoesNotThrow()
    {
        assertThrows(Exception.class, () -> { demoUtils.throwException(-9); }, "should throw exception");

        assertDoesNotThrow(() -> { demoUtils.throwException(8);}, "should not throw exception");

    }

    @Test
    @DisplayName("Timeout")
    void testTimeout(){
        assertTimeoutPreemptively(Duration.ofSeconds(3), () -> { demoUtils.checkTimeout();}, "Method should execute in 3 seconds");
    }

    @Test
    @DisplayName("Multiply")
    void testMultiply(){

        assertEquals(10, demoUtils.multiply(5,2), "5*2 must be 10");
    }



    /*
    @Test
    //@DisplayName("Equals and Not Equals")
    void test_Equals_And_Not_Equals()
    {
        System.out.println("Running test: testEqualsAndNotEquals");

        // execute and assert
        assertEquals(6, demoUtils.add(2,4), "2+4 must be 6");

        assertNotEquals(6, demoUtils.add(1, 9), "1+9 must not be 6");

    }
    */


    /*
    @Test
    //@DisplayName("Null and Not Null")
    void test_Null_And_Not_Null()
    {
        System.out.println("Running test: testNullAndNotNull");

        String str1 = null;
        String str2 = "esprit";

        assertNull(demoUtils.checkNull(str1),"Object should be null");

        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
    }*/
}

