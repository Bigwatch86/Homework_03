package online.fortis;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDrop {

    @Test

    void swapКectangles(){
        // Откройте https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");

        // Перенесите прямоугольник А на место В
        $("#column-a").dragAndDropTo("#column-b");

        // Проверьте, что прямоугольники действительно поменялись
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("a"));

    }







//    P.S. В Selenide есть команда $(element).dragAndDrop($(to-element)),
//    проверьте работает ли тест, если использовать её вместо actions()
//
//(раньше не работала из-за ошибки в ChromeDriver, но может быть уже починили? :-)).
//
//    Если работает - сообщите в группе курса.
}
