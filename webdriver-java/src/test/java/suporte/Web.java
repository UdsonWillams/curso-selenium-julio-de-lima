package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Web {

    public static WebDriver createChrome(){
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"); //seta o binario do chrome
        WebDriver navegador = new ChromeDriver(options); // abre o navegador
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Navegando para pagina do taskit
        navegador.get("http://www.juliodelima.com.br/taskit");

        return navegador;
    }
}
