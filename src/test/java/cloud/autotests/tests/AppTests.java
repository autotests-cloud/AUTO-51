package cloud.autotests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class AppTests extends TestBase {
    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("business-gazeta")
    void generatedTest() {
        step("open https://sport.business-gazeta.ru/", () -> {
            // todo
        });

        step("stop subscription", () -> {
            // todo
        });
    }

    @Test
    @Description("Autogenerated, because test steps contain text 'http...' and the page has 'title' tag")
    @DisplayName("Page title test")
    void titleTest() {
        step("Open url 'https://sport.business-gazeta.ru/'", () ->
            open("https://sport.business-gazeta.ru/"));

        step("Checking that page title is 'Спорт, Казань, Уфа, хоккей, футбол, волейбол, новости спорта, аналитика, разбор матчей на БИЗНЕС Online | Спорт на БИЗНЕС Online'", () -> {
            String expectedTitle = "Спорт, Казань, Уфа, хоккей, футбол, волейбол, новости спорта, аналитика, разбор матчей на БИЗНЕС Online | Спорт на БИЗНЕС Online";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }
}