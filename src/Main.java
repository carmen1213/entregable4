import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {
        String exePath = "C:\\Users\\Carmen\\IntelliJProjects\\Entregable4\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://www.fnac.es");
        // driver.quit();}
        WebElement ventanaCookies =
                driver.findElement(By.xpath("/html/body/header/div/button"));
        if (ventanaCookies !=null){System.out.println("Detectado caja decookies");
        ventanaCookies.click();}
        WebElement cajaBusqueda =  driver.findElement(By.id("Fnac_Search"));
        cajaBusqueda.sendKeys("Moviles");
        cajaBusqueda.submit();

        System.out.println("Que producto quieres buscar: ");


    }
}
