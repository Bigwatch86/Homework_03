package online.fortis;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.Thread.sleep;

public class SoftAssertionsCheck {
    @Test

    void shouldFindSelenideWiki(){
        // открыть страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        // перейти в раздел Wiki проекта
        $("#wiki-tab").click();
        // убедиться, что в списке страниц (Pages) есть страница SoftAssertions
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $("[data-filterable-for=\"wiki-pages-filter\"]").shouldHave(text("SoftAssertions"));
        // открыть страницу SoftAssertions, проверить что внутри есть пример кода для JUnit5
        $("[data-filterable-for=\"wiki-pages-filter\"]").click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
    }

}
