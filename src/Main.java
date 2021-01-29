import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el telefono que quieras");
        String telefono=sc.nextLine();
       Phonehouses(telefono);
        System.out.println("Presiona enter para comparar precios en las dos paginas");
        sc.nextLine();
        PcComponentes(telefono);






    }
    public static void Phonehouses(String telefono){
        Scanner sc = new Scanner(System.in);
        String exePath = "C:\\Users\\Carmen\\IntelliJProjects\\Entregable4\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.phonehouse.es/moviles-y-telefonia/moviles/todos-los-smartphones.html");




        WebElement cajaBusqueda =  driver.findElement(By.id("searcher"));
        cajaBusqueda.sendKeys(telefono);
        cajaBusqueda.submit();


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
    public static void PcComponentes(String telefono){
        Scanner sc = new Scanner(System.in);
        String exePath = "C:\\Users\\Carmen\\IntelliJProjects\\Entregable4\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.pccomponentes.com/smartphones-gps");

        System.out.println("Que producto quieres buscar: ");
        String producto= sc.nextLine();


        WebElement cajaBusqueda =  driver.findElement(By.id("searcher"));
        cajaBusqueda.sendKeys(telefono);
        cajaBusqueda.submit();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Estas en la pagina de PhoneHouse");
        int j=1;
        for (int i=1; i<4;i++){
            String modelo=driver.findElement(By.xpath("")).getText();
            String precio =driver.findElement(By.xpath("")).getText();
            System.out.println(modelo);
            System.out.println(precio);
            System.out.println("************************************************************************************");
        }


    }


}
