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
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.WebDriver;

public class RealizarCompraComSucessoDataClass extends TestBase {
    private WebDriver driver = this.getDriver();
    HomeTask homeTask = new HomeTask(driver);
    SelectProductTask selectProductTask = new SelectProductTask(driver);
    CheckoutTask checkoutTask = new CheckoutTask(driver);
    FinishTask fisnishTask = new FinishTask(driver);

    @ParameterizedTest
    @MethodSource("Framework.Utils.DataClass#loginTestData")
    public void realizarCompra(String user, String password){
        try{
            Report.creatTest("Realizar compra com sucesso DataClass", ReportType.SINGLE);
            homeTask.efetuarLoginParametrizado(user,password);
            selectProductTask.selecionarProduto();
            checkoutTask.preencherForm();
            fisnishTask.finalizarCompra();
        }catch (Exception e){
            Report.log(Status.FAIL , e.getMessage(), Screenshot.capture(driver));
        }
    }
}


