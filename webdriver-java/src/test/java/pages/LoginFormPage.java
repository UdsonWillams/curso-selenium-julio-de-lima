package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPage extends BasePage {

    public LoginFormPage(WebDriver navegador) {
        super(navegador);
    }

    //Metodo estrutural começo
    public LoginFormPage digitarLogin(String login){
        navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys(login);

        return this;
    }
    public LoginFormPage digitarSenha(String password){
        navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys(password);

        return this;
    }
    public SecretaPage clicarSignIn(){
        navegador.findElement(By.linkText("SIGN IN")).click();

        return new SecretaPage(navegador);
    }
    //Metodo estrutural fim

    //Metodo Funcional começo
    public SecretaPage fazerLogin(String login, String senha){
        digitarLogin(login);
        digitarSenha(senha);
        clicarSignIn();

        return new SecretaPage(navegador);
        /*Ao invés de return new SecretaPage(navegador) seria mais apropriado usar return
        clicarSignIn() uma vez que ele já retorna um new SecretaPage */
    }
    //Metodo Funcional fim
}
