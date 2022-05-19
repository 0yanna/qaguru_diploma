package voiso.tests.ui.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.assertj.core.api.Assertions.assertThat;

public class MainPage {

    @Step("Open the main page")
    public MainPage openMainPage() {
        open("https://voiso.com/");

        return this;
    }

    @Step("Page title should have text 'Voiso Call Center Platform")
    public MainPage checktexttitle() {
        String expectedTitle = "Voiso Call Center Platform";
        String actualTitle = title();

        assertThat(actualTitle).isEqualTo(expectedTitle);

        return this;
    }
}
