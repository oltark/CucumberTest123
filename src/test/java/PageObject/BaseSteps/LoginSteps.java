package PageObject.BaseSteps;

import PageObject.BaseElements.LoginElements;

import java.time.Duration;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static org.junit.Assert.assertTrue;

public class LoginSteps extends LoginElements {
    public static void checkPageOpened(){
        String pageOpenedCheck = pageOpened.getText();
        assertTrue(pageOpenedCheck.contains("Добро пожаловать в Jira"));

    }

    public static void loginVal(String loginName) {
        loginPath.setValue(loginName);

    }

    public static void passwordVal(String passwordName){
        passwordPath.setValue(passwordName);

    }


    public static void login(){
        loginPath.shouldBe(visible, Duration.ofSeconds(60)).click();
        loginPath.setValue("otarkhanov");
        passwordPath.shouldBe(visible, Duration.ofSeconds(60)).click();
        passwordPath.setValue("123Qwerty");
        enterPath.click();
    }
    public static void authorizeCheck() {
        authorizeAssert.shouldBe(visible, Duration.ofSeconds(60));
        authorizeAssert.shouldHave(attribute("title", "Пользовательский профиль для otarkhanov"));

    }

}
