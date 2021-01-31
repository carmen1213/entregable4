import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Scanner;

public class Phonehouse {
    public static void Phonehouses(String telefono){
        Scanner sc = new Scanner(System.in);
        String exePath = "entregable4-master/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.phonehouse.es/moviles-y-telefonia/moviles/todos-los-smartphones.html");




        WebElement cajaBusqueda =  driver.findElement(By.id("searcher"));
        cajaBusqueda.sendKeys(telefono);
        cajaBusqueda.sendKeys(Keys.ENTER);


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Estas en la pagina de PhoneHouse");
        int j=1;
        for (int i=1; i<4;i++){
            String modelo=driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div/section[2]/div[2]/ul/div/div/li["+i+"]/div/div[1]/div[2]/div[1]/a/h3")).getText();
            String precio =driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div/section[2]/div[2]/ul/div/div/li["+ i +"]/div/div[2]/div[1]/div/div[2]/span")).getText();
            System.out.println(modelo);
            System.out.println(precio);
            System.out.println("************************************************************************************");
        }


    }
}
