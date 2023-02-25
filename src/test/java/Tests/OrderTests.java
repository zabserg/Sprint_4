package Tests;

import Steps.Profile;
import com.example.sprint_4.PageObject.MainPageScooter;
import com.example.sprint_4.PageObject.OrderPageScooter;
import com.example.sprint_4.Services.Service;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class OrderTests {

    public ChromeDriver driver;


    public Service objService;
    public OrderPageScooter objOrderPage;
    public MainPageScooter objHomePage;
    public Profile objProfile;

    private final String name;
    private final String surname;
    private final String address;
    private final String phoneNumber;
    private final String station;
    private final String comment;
    private final By clickOrderButton;

    public OrderTests(String name, String surname, String address, String phoneNumber, String station, String comment, By clickOrderButton) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.station = station;
        this.comment = comment;
        this.clickOrderButton = clickOrderButton;
    }


    @Parameterized.Parameters

    public static Object[][] getData() {
        MainPageScooter homePage = new MainPageScooter();
        return new Object[][]{
                {"Владимир", "Ленин", "110001, г Москва, ул Ленина, д 1", "89001234567", "Университет", "Комментарий 1", homePage.ORDER_BUTTON_TOP},
                {"Петр", "Первый", "101002, г Санкт-Петербург, ул Дворцовая, д 2", "+79007654321", "Румянцево", " Комментарий № 2", homePage.ORDER_BUTTON_DOWN}
        };

    }

    @Before
    public void setUpOrder() {
        driver = new ChromeDriver();

        objOrderPage = new OrderPageScooter(driver);
        objHomePage = new MainPageScooter(driver);
        objProfile = new Profile(driver);
        objService = new Service(driver);

        System.out.println("test start");

        objService.inInputWebsite()
                .click(objHomePage.getCookie())
                .waitPageElement(objHomePage.getImage());
    }


    @Test // Создание заказа
    public void checkingOrderCompletion() {

        objService.click(clickOrderButton);
        objProfile.profileData(name, surname, address, phoneNumber, station);
        objService.click(objOrderPage.getNextButton());
        objProfile.orderrer();
        objService.click(objOrderPage.getColorScooter())
                .inputText(objOrderPage.getComment(), comment)
                .click((objOrderPage.getOrderButton()))
                .click((objOrderPage.getPlaceAnOrderYes()));

        assertTrue("Отсутствует сообщение об успешном завершении заказа",
                objService.isElementPresent(objOrderPage.ORDER_PLACED_HEADER));

    }

    @After
    public void teardown() {
        System.out.println("test close");
        driver.quit();

    }

}
