package online.fortis;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDrop {

    @Test

    void swapRectangles(){
        // Откройте https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");

        // Перенесите прямоугольник А на место В
        $("#column-a").dragAndDropTo("#column-b");

        // Проверьте, что прямоугольники действительно поменялись
        $("#column-a").shouldHave(text("b"));
        $("#column-b").shouldHave(text("a"));

    }
}
