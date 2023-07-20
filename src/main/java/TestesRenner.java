
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestesRenner {

	@Test
	public void adicionarProdutoAoCarrinho() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://automationexercise.com/");
		Assert.assertEquals("Automation Exercise", driver.getTitle());
		driver.get("https://automationexercise.com/products");
		driver.findElement(By.xpath("//html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li")).click();
		driver.findElement(By.xpath("//html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
		//driver.findElement(By.id("cartModal"));
		//driver.switchTo().window("id=\"large-banner-eta-vanilla");
		//driver.close();
		Assert.assertEquals("Continue Shopping", driver.findElement(By.id("id=\"cartModal\"")));
		
	}
}

///id="large-banner-eta-vanilla"