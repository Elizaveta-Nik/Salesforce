package tests;

import dto.Account;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static dto.AccountFactory.getAccount;

public class AccountsTest extends BaseTest {

    @Test(testName = "Создание нового аккаунта",
            description = "Проверка, что новый аккаунт может быть создан создан с валидными данными")
    @Description("Создание нового аккаунта с корректными данными")
    public void checkCreateAccount() {
        loginStep.login("tborodich@tms.sandbox", "Password001")
                .open()
                .selectMenuOption("Accounts");

        Account newAccount = getAccount("Hot", "Customer - Direct", "Private", "Chemicals",
                "High", "Platinum", "Maybe", "Yes");

        accountStep.create(newAccount);
        accountStep.checkCreateAccount();
    }
}