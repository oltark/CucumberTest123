package PageObject.BaseElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPageElements {

    public static SelenideElement hrefProject = $x("(//a[@href='/browse/TEST'])[1]");
    public static SelenideElement hrefTestProject = $x("//a[@id='admin_main_proj_link_lnk']");
    public static SelenideElement issueCount = $x("(//div[@class='ghx-issue-count'])[3]");

    //public static SelenideElement tasks = $x("(//span[contains(text(),'Список задач')])[1]");
    public static SelenideElement tasks = $x("//span[@class='aui-icon aui-icon-large agile-icon-plan aui-iconfont-backlog']");
    public static SelenideElement findTask =$x("//input[@aria-label='Поиск задач']");
    public static SelenideElement testSeleniumTask = $x("//div[@title=\"TestSelenium\"]");
    public static SelenideElement statusSeleniumTask = $x("//span[@id='status-val']");
    public static SelenideElement versionSeleniumTask = $x("(//span[@class='shorten'])[1]");

}
