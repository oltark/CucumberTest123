package Hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.Before;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;


public class WebHooks {
    @BeforeAll
    public static void setWebDriverFormat() {
        Configuration.startMaximized = true;
    }


    @AfterEach
    public void webDriverClose(){
        WebDriverRunner.closeWebDriver();
    }


}
