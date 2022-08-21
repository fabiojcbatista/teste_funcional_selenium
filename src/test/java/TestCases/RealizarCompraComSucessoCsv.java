package TestCases;


import Framework.Report.Report;
import Framework.Report.ReportType;
import Framework.Report.Screenshot;
import Framework.TestBase;
import Tasks.CheckoutTask;
import Tasks.FinishTask;
import Tasks.HomeTask;
import Tasks.SelectProductTask;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;

public class RealizarCompraComSucessoCsv extends TestBase {
    private WebDriver driver = this.getDriver();
    HomeTask homeTask = new HomeTask(driver);
    SelectProductTask selectProductTask = new SelectProductTask(driver);
    CheckoutTask checkoutTask = new CheckoutTask(driver);
    FinishTask fisnishTask = new FinishTask(driver);

    @ParameterizedTest
    @Tag("regressao")
    @CsvFileSource(resources = "/CSV/login.csv", numLinesToSkip = 1)
    public void realizarCompra(String user, String password) {
        try {
            Report.creatTest("Realizar compra com sucesso CSV", ReportType.GROUP);
            Report.createStep("Realizar Login");
            homeTask.efetuarLoginParametrizado(user, password);
            Report.createStep("Selecionar Produto");
            selectProductTask.selecionarProduto();
            Report.createStep("Checkout da Compra");
            checkoutTask.preencherForm();
            Report.createStep("Finalizar Compra");
            fisnishTask.finalizarCompra();
        } catch (Exception e) {
            Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
        }
    }
}
