package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends  PageBase{


    @FindBy(id = "exampleInputEmail1")
    public WebElement useremailField;

    @FindBy(id = "exampleInputPassword1")
    public WebElement passwordField;

    @FindBy(name = "login")
    public WebElement loginButton;

    @FindBy(xpath = "//a[.='Sign up']")
    public WebElement signUpLink;




    public void login(String username, String pass){
        useremailField.sendKeys(username);
        passwordField.sendKeys(pass);
        loginButton.click();
    }



}
