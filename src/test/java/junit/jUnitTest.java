package junit;

import com.codeborne.selenide.SelenideConfig;
import org.junit.jupiter.api.*;

public class jUnitTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("    before all"); // до теста
    }

    @AfterAll
    static void afterAll() {
        System.out.println("    after all");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("    this metod 1"); // до теста

    }

    @AfterEach
    void afterEach() {
        System.out.println("    this metod 2"); // после теста
    }

    @Test
    void FirstJunitTest() {
        System.out.println("    this test");
        Assertions.assertTrue(3 > 2);
    }
    @Test
    void SecondJunitTest() {
        System.out.println("    this test");
        Assertions.assertTrue(3 > 2);
    }
}
