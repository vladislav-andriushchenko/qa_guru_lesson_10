package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubRepoPage {

    private final SelenideElement
            issue = $("#issues-tab"),
            rowData = $("[data-testid*=list-row-repo]");

    public GitHubRepoPage openPage() {
        open("qa_guru_lesson_10");
        return this;
    }

    public GitHubRepoPage selectIssue() {
        issue.click();
        return this;
    }

    public void checkIssue(String value) {
        rowData.shouldHave(text(value));
    }

}
