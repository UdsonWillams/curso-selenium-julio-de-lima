package testes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class informacoesUsarioTest {
    private WebDriver navegador;

    @Before
    public void setUP(){
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"); //seta o binario do chrome
        navegador = new ChromeDriver(options); // abre o navegador
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Navegando para pagina do taskit
        navegador.get("http://www.juliodelima.com.br/taskit");
    }
    @Test
    public void testAdicionarUmaInformacaoAdcionalDoUsuario(){

        //clicar no link que possui o texto "sing in"
        //Exemplo de outra forma > WebElement linkSignIn = navegador.findElement(By.linkText("Sign in")).click();
        navegador.findElement(By.linkText("Sign in")).click();

        //Identificando os formularios de Login
        WebElement formularioSignInBox = navegador.findElement(By.id("signinbox"));

        //digitar no campo com name "login" que esta dentro do formulario de id "signbox" o texto "julio0001"
        formularioSignInBox.findElement(By.name("login")).sendKeys("julio0001");

        //digitar no campo com name "password" que esta dentro do formulario de id "signbox" o texto "123456"
        formularioSignInBox.findElement(By.name("password")).sendKeys("123456");

        //clicar no link com o text "SIGN IN"
        navegador.findElement(By.linkText("SIGN IN")).click();

        //Clicar em um link que possui a class me
        navegador.findElement(By.className("me")).click();

        //Clicar em um link que possui o texto "MORE DATA ABOUT YOU"
        navegador.findElement(By.linkText("MORE DATA ABOUT YOU")).click();

        //CLICAR NO BOTÃO ATRAVES DO SEU XPATH //button[@data-target="addmoredata"]
        navegador.findElement(By.xpath("//button[@data-target=\"addmoredata\"]")).click();

        //Identificar a popup onde está o formulario de id addmoredata
        WebElement popupAddMoreData = navegador.findElement(By.id("addmoredata"));

        //Na combo de name "type" escolhe a opção "Phone"
        WebElement campoType = popupAddMoreData.findElement(By.name("type"));
        new Select(campoType).selectByVisibleText("Phone");

        //No campo de name "contact" digitar  "++551199999999"
        popupAddMoreData.findElement(By.name("contact")).sendKeys("+551199999999");

        //clicar no link de text "SAVE" que está na popup
        popupAddMoreData.findElement(By.linkText("SAVE")).click();

        //na mensagem de id "toast-container" validar que o texto é "Your contact has been added!"
        WebElement mensagemPop = navegador.findElement(By.id("toast-container"));
        String mensagem = mensagemPop.getText();
        assertEquals("Your contact has been added!", mensagem);

    }
    @After
    public void tearDown(){
        //fechar o navegador
        //navegador.quit();
    }
}
