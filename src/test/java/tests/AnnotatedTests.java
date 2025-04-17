package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.GitRepoSteps;
import utils.TestBase;

public class AnnotatedTests extends TestBase {

    GitRepoSteps steps = new GitRepoSteps();

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
