# Selenium
O Selenium é um projeto guarda-chuva que encapsula uma variedade de ferramentas e bibliotecas que permitem a automação do navegador da web. O Selenium fornece especificamente uma infraestrutura para a especificação W3C WebDriver — uma plataforma e uma interface de codificação neutra em linguagem compatível com todos os principais navegadores da web.
O projeto é possível graças a colaboradores voluntários que generosamente doaram milhares de horas em desenvolvimento e manutenção de código.
O código-fonte do Selenium é disponibilizado sob a licença Apache 2.0 .

# Estrutura do projeto
Selenium

Java

# Realizando configuração
1. Adicione a dependência ao seu pom.xml:
```bash
<dependency>
   <groupId>org.seleniumhq.selenium</groupId>
   <artifactId>selenium-java</artifactId>
   <version>4.10.0</version>
</dependency>
   <!-- https://mvnrepository.com/artifact/junit/junit -->
<dependency>
   ```
3. Crie uma instância do Browser em seu método de teste:
   ```bash
   WebDriver driver = new FirefoxDriver();
   driver.get("https://automationexercise.com/");
   ```
5. Use os métodos do navegador diretamente para ações gerais, como navegação, redimensionamento de janela, rolagem e tratamento de alertas:
   ```bash
   browser.maximize();
   browser.goTo("https://automationexercise.com/");
   browser.waitForPageToLoad();
   ```
7. Chame os métodos do elemento para executar uma ação com o elemento:
   ```bash
   txbSearch.type("Selenium WebDriver");
   txbSearch.submit();
   browser.waitForPageToLoad();
   ```
9. Sair do navegado no final do projeto:
   ```bash
   browser.quit();
   ```
