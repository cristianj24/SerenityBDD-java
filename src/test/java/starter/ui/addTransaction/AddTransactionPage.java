package starter.ui.addTransaction;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddTransactionPage {
    public static Target BUTTON_ADD_TRANSACTION = Target.the("Add transaction button").locatedBy("//button[contains(.,'Añadir transacción')]");
    public static Target INPUT_DATE = Target.the("input date").locatedBy("//input[@type='date']");
    public static Target INPUT_AMOUNT = Target.the("input amount").located(By.id("amount"));
    public static Target INPUT_DESCRIPTION  = Target.the("input description").located(By.id("description"));
    public static Target BUTTON_SAVE  = Target.the("button save").locatedBy("//button[contains(.,'Guardar')]");
    public static Target TRANSACTION_TABLE  = Target.the("transaction table").locatedBy("//tbody[@id='transactions-list']");

    public static String TRANSACTIONS_TABLE_XPATH = "//tbody[@id='transactions-list']";
}
