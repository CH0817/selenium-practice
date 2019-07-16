package tw.com.rex;

import org.openqa.selenium.chrome.ChromeDriver;

public class App {

    public static void main(String[] args) {
        //指定 chromedriver.exe 路徑
        System.setProperty("webdriver.chrome.driver",
                           "D:\\IDE\\Selenium\\Browers\\Chrome\\version 75\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        //模擬輸入網址 https://www.google.com.tw/
        driver.get("https://www.google.com.tw/");
        //印出頁面 title
        System.out.println(driver.getTitle());
        //關閉 chrome 視窗
        driver.close();
        //退出 chrome driver ，並關閉所有關聯視窗
        driver.quit();
    }
}
