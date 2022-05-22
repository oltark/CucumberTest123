package PageObject.BaseElements;


import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class LoginElements {

    public static SelenideElement pageOpened =  $x("//h1[contains(text(),'Добро пожаловать в Jira')]");
    public static SelenideElement loginPath = $x("//input[@id='login-form-username']");
    public static SelenideElement passwordPath = $x("//input[@id='login-form-password']");
    public static SelenideElement enterPath = $x("//input[@id='login-form-submit']");
    public static SelenideElement authorizeAssert=$x("//a[@title='Пользовательский профиль для otarkhanov']");

}
