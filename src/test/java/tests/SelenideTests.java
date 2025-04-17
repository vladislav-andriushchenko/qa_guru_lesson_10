package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.GitHubRepoPage;
import utils.TestBase;


public class SelenideTests extends TestBase {

    GitHubRepoPage repoPage = new GitHubRepoPage();

    @BeforeAll
    static void setupAllure() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true));
    }

    @Test
    void checkIssueExistenceTest() {
        repoPage.openPage().selectIssue();
        repoPage.checkIssue("#1");
    }

    @Test
    void checkIssueAbsenceTest() {
        repoPage.openPage().selectIssue();
        repoPage.checkIssue("#2");
    }
}
