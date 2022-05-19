package voiso.tests.ui;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.junit5.AllureJunit5;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.remote.DesiredCapabilities;
import voiso.helpers.AllureAttachments;

import static com.codeborne.selenide.Selenide.closeWebDriver;

@ExtendWith({AllureJunit5.class})
public class TestBase {

    @BeforeAll
    static void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        String remoteBrowser = System.getProperty("remoteBrowser", "selenoid.autotests.cloud/wd/hub");
        String remoteBrowserUser = System.getProperty("remoteBrowserUser", "user1");
        String remoteBrowserPassword = System.getProperty("remoteBrowserPassword", "1234");

        Configuration.baseUrl = "https://voiso.com/";
        Configuration.browserSize = "1920x1080";
        //ниже вместо Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
        Configuration.remote = "https://" + remoteBrowserUser + ":" + remoteBrowserPassword + "@" + remoteBrowser;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
    }

    @AfterEach
    void addAttachments() {
        AllureAttachments.screenshotAs("Last screenshot");
        AllureAttachments.pageSource();
        AllureAttachments.browserConsoleLogs();
        AllureAttachments.addVideo();
        closeWebDriver();
    }
}
