package testes;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class informacoesUsarioTest {

    @Test
    public void testAdicionarUmaInformacaoAdcionalDoUsuario(){
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"); //seta o binario do chrome
        WebDriver navegador = new ChromeDriver(options); // abre o navegador

        //Navegando para pagina do taskit
        navegador.get("http://www.juliodelima.com.br/taskit");

        //clicar no link que possui o texto "sing in"

        //clicar no campo com name "login" que esta dentro do formulario de id "signbox"

        //digitar no campo com name "login" que esta dentro do formulario de id "signbox" o texto "julio0001"

        //clicar no campo com name "password" que esta dentro do formulario de id "signbox"

        //digitar no campo com name "password" que esta dentro do formulario de id "signbox" o texto "123456"

        //clicar no link com o text "SIGN IN"

        //validar que dentro do elemento com class "me" esta o texto "hi, julio"

        //fechar o navegador

        //validação
        Assert.assertEquals(1, 1);
    }
}
