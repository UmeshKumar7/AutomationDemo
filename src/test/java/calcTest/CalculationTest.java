package calcTest;


import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class CalculationTest {
    @Test
    @DisplayName("TC 1 To addition two numbers")
    @Order(1)
    public  void validateAddition (){

        int result1;
        result1=calc.Calculation.addition(2,5);
        Assertions.assertEquals(8,result1);
        System.out.println(" 1-validateAddition is Running");

    }

    @Test
    @Tag("Regression_Testing")
    @DisplayName("TC 2 To Substract two numbers")
    @Order(2)
    public  void validateSubstraction (){

        int result2;
        result2=calc.Calculation.substraction(8,5);
        Assertions.assertEquals(3,result2);
        System.out.println("2-validateSubstraction is Running");

    }

    @Test
    @Tag("Sanity")
    @DisplayName("TC 3 To Multiplication two numbers")
    @Order(3)
    public  void validateMultiplication (){

        int result3;
        result3=calc.Calculation.multiplication(7,5);
        Assertions.assertEquals(35,result3);
        System.out.println("3-validateMultiplication is Running");

    }

    @BeforeAll
    public static void setUp(){

        System.out.println("Running before Class");

    }

    @AfterAll
    public static void tireDown(){

        System.out.println("Running after Class");

    }

    @BeforeEach
    public  void beforeTest(){

        System.out.println("Running before Test");

    }

    @AfterEach
    public void afterTest(){

        System.out.println("Running after Test");

    }

}
