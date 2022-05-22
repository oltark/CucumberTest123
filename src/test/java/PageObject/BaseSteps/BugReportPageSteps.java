package PageObject.BaseSteps;

import PageObject.BaseElements.BugReportElements;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;


public class BugReportPageSteps extends BugReportElements {

    public static void createBugReport(){

        createBugReportButton.shouldBe(visible, Duration.ofSeconds(60)).click();
        issueType.shouldBe(visible, Duration.ofSeconds(60)).click();
        summaryInput.shouldBe(visible, Duration.ofSeconds(60)).click();
        summaryInput.setValue("AutoCucu");
        String summary = summaryInput.getValue();

        /*   Ввод описания в баг репорт без айфрейма через текстовое поле

         descriptionTxtButton.shouldBe(visible, Duration.ofSeconds(60)).click();
         description.setValue("Description");

         */

        descriptionPath.shouldBe(visible, Duration.ofSeconds(60));
        switchTo().frame(descriptionPath);
        descriptionPathInIframe.shouldBe(visible, Duration.ofSeconds(60)).click();
        descriptionPathInIframe.setValue("Description");
        switchTo().parentFrame();
        versionA.click();
        versionB.click();
        assignOnMe.click();
        createIssueSubmit.shouldBe(visible, Duration.ofSeconds(60)).click();
        tasksHref.click();
        reportedByMeTasks.click();
        Assert.assertEquals(summaryValueCheck.getText(),summary);

    }

    public static void changeStatus() {
        tasksHref.shouldBe(visible, Duration.ofSeconds(60)).click();
        reportedByMeTasks.shouldBe(visible, Duration.ofSeconds(60)).click();
        needToDoStatus.click();
        inWorkStatus.click();
        closedStatusDropdown.click();
        closedStatus.click();

    }




}
