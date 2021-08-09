package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PreApprovalDetailPage;
import utilities.ConfigReader;

public class PreApprovalDetailTests  extends TestBase {

    @Test(groups = {"smoke"})
    public void fillFieldsOfPreApprovalDetailPage() throws Exception {

        LoginPage loginPage = new LoginPage();
        PreApprovalDetailPage preApprovalDetailPage = new PreApprovalDetailPage();

        loginPage.useremailField.sendKeys(ConfigReader.getProperty("username1"));
        loginPage.passwordField.sendKeys(ConfigReader.getProperty("password1"));
        loginPage.loginButton.click();

        Assert.assertTrue(driver.getCurrentUrl().equals("http://duobank-env.eba-hjmrxg9a.us-east-2.elasticbeanstalk.com/dashboard.php"));

        preApprovalDetailPage.mortgageApplicationLink.click();

        Assert.assertTrue(driver.getCurrentUrl().equals("http://duobank-env.eba-hjmrxg9a.us-east-2.elasticbeanstalk.com/mortagage.php"));

        preApprovalDetailPage.realtorInfo.sendKeys(ConfigReader.getProperty("realtorInfo"));
        preApprovalDetailPage.loanOfficerCheckBox.click();
        preApprovalDetailPage.estimatePurchasePrice.sendKeys(ConfigReader.getProperty("purchasePrice"));
        preApprovalDetailPage.downPayment.sendKeys(ConfigReader.getProperty("downPayment"));
        selectDropDownValueByValue(preApprovalDetailPage.downPaymentSource, ConfigReader.getProperty("downPaymentSource"));
    }
}
