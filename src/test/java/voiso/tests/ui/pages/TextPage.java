package voiso.tests.ui.pages;

import com.codeborne.selenide.SelenideElement;
import voiso.helpers.DriverUtils;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class TextPage {
    SelenideElement
        checkbutton = $(".style_content__fy0dz"),
        typebutton = $(".style_body__rooPX"),
        textbutton = $(".style_h2__RKar3.style_black__sVGMk"),
        videoelement = $(".style_videoWrapper__p719Y"),
        menu = $(".menu"),
        blogpage = $(".style_secondary____DnE.style_container__7Y17V ");

    public TextPage checkbuttonvisible() {
        checkbutton.shouldBe(visible);

        return this;
    }

    public TextPage clickbutton() {
        typebutton.$(byText("Request a demo")).click();

        return this;
    }

    public TextPage checktextbutton() {
        textbutton.shouldHave(text("Request a demo"));

        return this;
    }

    public TextPage checkvideo() {
        videoelement.should(exist);

        return this;
    }

    public TextPage clickblogpage(String text) {
        menu.$(byText(text)).click();
        sleep(5000);

        return this;
    }

    public TextPage checkblogpage() {
        blogpage.shouldNotBe(empty);

        return this;
    }

    public TextPage checkconsolelog() {
        String consoleLogs = DriverUtils.getConsoleLogs();
        String errorText = "SEVERE";

        assertThat(consoleLogs).doesNotContain(errorText);

        return this;
    }
}
