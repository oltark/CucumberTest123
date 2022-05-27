package StepDefinition;

import Hooks.WebHooks;
import PageObject.BaseSteps.BugReportPageSteps;
import PageObject.BaseSteps.LoginSteps;
import PageObject.BaseSteps.MainPageSteps;
import io.cucumber.java.ru.*;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;

import java.util.List;
import static com.codeborne.selenide.Selenide.*;

@DisplayName("Тесты по баг-трекеру Jira")
public class StepDefinition extends WebHooks {

    @Дано("^Авторизация")
    @Step("Авторизация юзера")
    @Attachment
    public void authorize(List<String> testdata){
        String name = testdata.get(0);
        String pass = testdata.get(1);
        open("https://edujira.ifellow.ru/login.jsp");
        LoginSteps.checkPageOpened();
        LoginSteps.loginVal(name);
        LoginSteps.passwordVal(pass);
        LoginSteps.enterPath.click();
        LoginSteps.authorizeCheck();

    }

    @И("^Заполняем основную страницу")
    @Step("Заполняем основную страницу")
    @Attachment
    public void mainPageSteps() {
        MainPageSteps.hrefProject();
        MainPageSteps.numberOfTasks();
        MainPageSteps.testSeleniumTask();
    }

    @И("^Заполняем страницу баг репорта")
    @Step("Заполняем страницу баг репорта")
    @Attachment
    public void bugReportSteps() {
        BugReportPageSteps.createBugReport();
        BugReportPageSteps.changeStatus();

    }

   /* @И("^Проверяем на ошибку открытия страницы")
    public void checkPageOpenedBug() {
        LoginSteps.checkPageOpened();
    }*/
}
