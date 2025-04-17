package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.GitRepoSteps;
import utils.TestBase;

public class AnnotatedTests extends TestBase {

    GitRepoSteps steps = new GitRepoSteps();

    @BeforeAll
    static void setupAllure() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true));
    }

    @Epic("GitHub UI Tests")
    @Feature("Issues Tab")
    @Story("Search for issue by number")
    @DisplayName("Проверка отображения Issue #1")
    @Owner("vladislav-andriushchenko")
    @Test
    void checkIssueTest() {
        steps.openPage();
        steps.openIssuesPage();
        steps.shouldSeeIssueWithNumber("#1");
    }
}
