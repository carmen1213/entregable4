import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String exePath = "C:\\Users\\Carmen\\IntelliJProjects\\Entregable4\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://www.fnac.es");
        // driver.quit();}
        //WebElement ventanaCookies =
                //driver.findElement(By.xpath("/html/body/header/div/button"));
       // if (ventanaCookies !=null){System.out.println("Detectado caja decookies");
            //ventanaCookies.click();}
        System.out.println("Que producto quieres buscar: ");
        String producto= sc.nextLine();

        WebElement cajaBusqueda =  driver.findElement(By.id("Fnac_Search"));
        cajaBusqueda.sendKeys(producto);
        cajaBusqueda.submit();


        WebElement elementoActual, navegacion;
        int j=1;
        for (int i=1; i<4;i++){
            String modelo = driver.findElement(By.xpath("/html/body/div[3]/div/div[7]/div/div["+ i +"]/article/div[2]/div/p[1]/a")).getText();
            String precio =driver.findElement(By.xpath("/html/body/div[3]/div/div[7]/div/div["+ i +"]/article/div[3]/div/div/div/div/div[1]/a/strong")).getText();
            System.out.println(modelo);
            System.out.println(precio);
        }




    }
}
