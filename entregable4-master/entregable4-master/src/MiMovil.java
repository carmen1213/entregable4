import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Scanner;

public class MiMovil {
    public static void MiMovil(String telefono){
        Scanner sc = new Scanner(System.in);
        String exePath = "entregable4-master/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://mi-movil.es/index.php?");




        WebElement cajaBusqueda =  driver.findElement(By.id("search_query_top"));
        cajaBusqueda.sendKeys(telefono);
        cajaBusqueda.sendKeys(Keys.ENTER);




        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Estas en la pagina de Mi Movil");
        int j=1;
        for (int i=1; i<4;i++){
            String modelo=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/ul/li["+i+"]/div/div[2]/h5")).getText();
            String precio =driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/ul/li["+i+"]/div/div[2]/div[1]")).getText();
            System.out.println(modelo);
            System.out.println(precio);
            System.out.println("************************************************************************************");
        }


    }
}
