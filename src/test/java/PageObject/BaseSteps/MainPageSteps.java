package PageObject.BaseSteps;


import PageObject.BaseElements.MainPageElements;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static org.junit.Assert.assertTrue;

public class MainPageSteps extends MainPageElements {

           public static void hrefProject() {

               hrefProject.shouldBe(visible, Duration.ofSeconds(60)).click();
               hrefTestProject.shouldBe(visible, Duration.ofSeconds(60)).click();

           }
           public static void numberOfTasks(){
               tasks.shouldBe(visible, Duration.ofSeconds(60)).click();
               String numberOfTasks = issueCount.getText();
               System.out.println("Общее количество текущих задач: " + numberOfTasks);

           }
           public static void testSeleniumTask(){
               findTask.setValue("TestSelenium");
               testSeleniumTask.shouldBe(visible, Duration.ofSeconds(60)).click();
               String actualStatusString = statusSeleniumTask.getText();
               System.out.println("Статус задачи - " + actualStatusString);
               assertTrue(actualStatusString.contains("В РАБОТЕ"));
               String actualVersString = versionSeleniumTask.getText();
               System.out.println("Версия на данный момент - " + actualVersString);
               assertTrue(actualVersString.contains("Version 2.0"));

    }

}
