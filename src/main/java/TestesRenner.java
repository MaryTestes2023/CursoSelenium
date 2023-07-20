
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestesRenner {

	@Test
	public void adicionarPrimeiroProduto() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://automationexercise.com/");
		Assert.assertEquals("Automation Exercise", driver.getTitle());
		//Primeiro Produto
		driver.get("https://automationexercise.com/products");   ///Tela de Produtos
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[5]/div/div[2]")).click();  ///Detalhes do primeiro produto
		driver.findElement(By.xpath("//*[@id=\"quantity\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"quantity\"]")).sendKeys("3");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click(); //Add ao carrinho
		driver.get("https://automationexercise.com/products");  /// Acessa a tela de produtos
		driver.close();
		
	}
	
	@Test
	public void adicionarSegundoProduto() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://automationexercise.com/");
		Assert.assertEquals("Automation Exercise", driver.getTitle());
		//Segundo produto
		driver.get("https://automationexercise.com/products");
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[33]/div/div[2]/ul/li")).click();  /// Detlhe do segundo produto
		driver.findElement(By.xpath("//*[@id=\"quantity\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"quantity\"]")).sendKeys("2");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click(); //Add ao carrinho
		driver.close();
		
	}
	
	@Test
	public void adcionarTerceiroProduto() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://automationexercise.com/");
		Assert.assertEquals("Automation Exercise", driver.getTitle());
		
		//Terceiro Produto
		driver.get("https://automationexercise.com/products");
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"quantity\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"quantity\"]")).sendKeys("1");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
		driver.close();
				
	}
}

///id="large-banner-eta-vanilla"