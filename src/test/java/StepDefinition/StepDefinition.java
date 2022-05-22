package StepDefinition;

import Hooks.WebHooks;
import PageObject.BaseSteps.BugReportPageSteps;
import PageObject.BaseSteps.LoginSteps;
import PageObject.BaseSteps.MainPageSteps;
import io.cucumber.java.ru.*;
import java.util.List;
import static com.codeborne.selenide.Selenide.*;

public class StepDefinition extends WebHooks {

    @Дано("^Авторизация")
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
    public void mainPageSteps() {
        MainPageSteps.hrefProject();
        MainPageSteps.numberOfTasks();
        MainPageSteps.testSeleniumTask();
    }

    @И("^Заполняем страницу баг репорта")
    public void bugReportSteps() {
        BugReportPageSteps.createBugReport();
        BugReportPageSteps.changeStatus();

    }

}
