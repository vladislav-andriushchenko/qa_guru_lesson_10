package steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitRepoSteps {

    @Step("Открываем страницу репозиторий пользователя")
    public void openPage() {
        open("qa_guru_lesson_10");
    }

    @Step("Открываем страницу Issues")
    public void openIssuesPage() {
        $("#issues-tab").click();
    }

    @Step("Проверяем наличие Issue с номером {issue}")
    public void shouldSeeIssueWithNumber(String issue) {
        $("[data-testid*=list-row-repo]").shouldHave(text(issue));
    }
}
