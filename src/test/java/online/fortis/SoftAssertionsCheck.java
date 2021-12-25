package online.fortis;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SoftAssertionsCheck {
    @Test

    void shouldFindSelenideWiki(){
        // открыть страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        // перейти в раздел Wiki проекта
        $("data-content=\"Wiki\"").click();

        // убедиться, что в списке страниц (Pages) есть страница SoftAssertions

        // откройть страницу SoftAssertions, проверить что внутри есть пример кода для JUnit5

    }

}
