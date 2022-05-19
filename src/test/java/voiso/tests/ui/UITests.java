package voiso.tests.ui;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import voiso.tests.ui.pages.MainPage;
import voiso.tests.ui.pages.TextPage;

import static io.qameta.allure.Allure.step;

@Owner("0yanna")
public class UITests extends TestBase {

    TextPage TextPage = new TextPage();
    MainPage MainPage = new MainPage();

    @Tag("UI")
    @Test
    @Description("Check if button 'request a demo' exists")
    @DisplayName("Voiso test 1")
    void checkButtonTest() {
        step("Open the main page", () ->
                MainPage.openMainPage());
        step("Сheck button is visible", () ->
                TextPage.checkbuttonvisible());
        step("Сlick the button", () ->
                TextPage.clickbutton());
        step("Сheck text button exists", () ->
                TextPage.checktextbutton());
    }

    @Tag("UI")
    @Test
    @Description("Check if video exists on the main banner")
    @DisplayName("Voiso test 2")
    void checkVideoTest() {
        step("Open the main page", () ->
                MainPage.openMainPage());
        step("Сheck video exists", () ->
                TextPage.checkvideo());
    }

    @Tag("UI")
    @Test
    @Description("Check title of the main page")
    @DisplayName("Voiso test 3")
    void titleTest() {
        step("Open the main page", () ->
                MainPage.openMainPage());
        step("Page title should have text 'Voiso Call Center Platform", () ->
                MainPage.checktexttitle());
    }

    @Tag("UI")
    @Test
    @Description("Check if blog page exists")
    @DisplayName("Voiso test 4")
    void blogPageTest() {
        step("Open the main page", () ->
                MainPage.openMainPage());
        step("Check if blog page exists", () ->
                TextPage.clickblogpage("Pricing"));
        step("Check if blog page exists", () ->
                TextPage.checkblogpage());
    }

    @Tag("UI")
    @Test
    @Description("Page console log should not have errors")
    @DisplayName("Voiso test 5")
    void consoleShouldNotHaveErrorsTest() {
        step("Open the main page", () ->
                MainPage.openMainPage());
        step("Page console log should not have errors", () ->
                TextPage.checkconsolelog());
    }
}
