package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import utils.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LambdaTests extends TestBase {

    @BeforeAll
    static void setupAllure() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true));
    }

    @Test
    void checkIssueTest() {
        String issue = "#1";
        step("Открываем страницу репозиторий пользователя", () -> {
            open("qa_guru_lesson_10");
        });
        step("Открываем страницу Issues", () -> {
            $("#issues-tab").click();
        });
        step("Проверяем наличие Issue с номером " + issue, () -> {
            $("[data-testid*=list-row-repo]").shouldHave(text(issue));
        });
    }
}
