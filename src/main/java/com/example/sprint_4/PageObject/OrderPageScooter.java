package com.example.sprint_4.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPageScooter {

    private WebDriver driver;

    // Используемые элементы на странице заказа
    private final By ORDER_HEADER = By.xpath("//div[(text()= 'Для кого самокат')]"); // элемент страницы заполнения данных
    private final By RENT_HEADER = By.xpath("//div[(text()= 'Про аренду')]"); // элемент страницы заполнения данных
    private final By INPUT_NAME = By.xpath("//input[@placeholder ='* Имя']"); // поле имя
    private final By INPUT_SURNAME = By.xpath("//input[@placeholder ='* Фамилия']"); // поле фамилия
    private final By INPUT_ADDRESS = By.xpath("//input[@placeholder ='* Адрес: куда привезти заказ']"); // поле адреса
    private final By INPUT_METRO_STATION = By.xpath("//input[@placeholder ='* Станция метро']"); // поле метро
    private final By INPUT_PHONE_NUMBER = By.xpath("//input[@placeholder ='* Телефон: на него позвонит курьер']"); // поле телефон
    private final By INPUT_DATE_CALENDAR = By.xpath("//input[@placeholder ='* Когда привезти самокат']"); // поле календаря
    private final By INPUT_DATE = By.xpath("//div[contains(@class, 'day--today')]"); // поле выбора даты доставки
    private final By INPUT_RENTAL_PERIOD = By.className("Dropdown-placeholder"); // элемент выбора срока аренды
    private final By INPUT_RENTAL_DAY = By.xpath(".//div[@class='Dropdown-menu']/div[text()='сутки']"); // элемент выбора срока аренды
    private final By CHECKBOX_COLOUR = By.id("grey"); // элемент выбора цвета
    private final By INPUT_COMMENT = By.xpath("//input[@placeholder ='Комментарий для курьера']"); // поле коментария
    private final By NEXT_BUTTON = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM"); // кнопка далее
    private final By ORDER_BUTTON = By.xpath("//div[@class='Order_Buttons__1xGrp']//button[contains(text(), 'Заказать')]"); // кнопка заказать
    private final By ORDER_YES_BUTTON = By.xpath("//button[contains(text(), 'Да')]"); // кнопка подтверждения заказа
    public final By ORDER_PLACED_HEADER = By.xpath("//div[(text()= 'Заказ оформлен')]");  // элемент страницы подтвержденного заказа

    // Конструктор класса
    public OrderPageScooter(WebDriver driver) {
        this.driver = driver;
    }

    // Преобразование локаторов в вебэлементы
    public WebElement getName() {
        return driver.findElement(INPUT_NAME);
    }

    public WebElement getSurname() {
        return driver.findElement(INPUT_SURNAME);
    }

    public WebElement getAddress() {
        return driver.findElement(INPUT_ADDRESS);
    }

    public WebElement getPhoneNumber() {
        return driver.findElement(INPUT_PHONE_NUMBER);
    }

    public WebElement getStation() {
        return driver.findElement(INPUT_METRO_STATION);
    }

    public WebElement getCalendar() {
        return driver.findElement(INPUT_DATE_CALENDAR);
    }

    public WebElement getDate() {
        return driver.findElement(INPUT_DATE);
    }

    public WebElement getRentalPeriod() {
        return driver.findElement(INPUT_RENTAL_PERIOD);
    }

    public WebElement getRentalTimeOneDay() {
        return driver.findElement(INPUT_RENTAL_DAY);
    }

    public WebElement getColorScooter() {
        return driver.findElement(CHECKBOX_COLOUR);
    }

    public WebElement getComment() {
        return driver.findElement(INPUT_COMMENT);
    }

    public WebElement getNextButton() {
        return driver.findElement(NEXT_BUTTON);
    }

    public WebElement getOrderButton() {
        return driver.findElement(ORDER_BUTTON);
    }

    public WebElement getPlaceAnOrderYes() {
        return driver.findElement(ORDER_YES_BUTTON);
    }

    public By getTitleOrder() {
        return ORDER_HEADER;
    }

    public By getTitleRent() {
        return RENT_HEADER;
    }



    /////////////////////////////
//
//    private WebDriver driver;

//    // Кнопка Заказать вверху страницы
//    private By orderButtonUp = By.xpath(".//button[@class='Button_Button__ra12g']");
//
//    // Кнопка Заказать внизу страницы
//    private By orderButtonDown = By.xpath(".//button[@class='Button_Button__ra12g Button_UltraBig__UU3Lp']");
//
//    // Поле Имя
//    private By nameField = By.xpath(".//input[@placeholder='* Имя']");
//
//    // Поле Фамилия
//    private By surnameField = By.xpath(".//input[contains(@placeholder, 'Фамилия')]");
//
//    // Поле Адрес
//    private By addressField = By.xpath(".//input[contains(@placeholder, 'Адрес: куда привезти заказ')]");
//
//    // Список Станция метро
//    private By metroField = By.xpath(".//input[contains(@placeholder, 'Станция метро')]");
//    private By metroStation = By.xpath(".//div[contains(text(), 'Бульвар Рокоссовского')]");
//
//    // Поле телефон
//    private By phoneField = By.xpath(".//input[contains(@placeholder, 'Телефон: на него позвонит курьер')]");
//
//    // Кнопка Далее
//    private By nextButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
//
//    // Поле Когда привезти самокат
//    private By dateField = By.xpath(".//input[contains(@placeholder, 'Когда привезти самокат')]");
//    private By dateFieldSelect = By.xpath(".//div[contains(@aria-label, 'Choose среда, 1-е февраля 2023 г.')]");
//
//    // Поле Срок аренды
//    private By rentalPeriodField = By.xpath(".//div[@class='Dropdown-placeholder']");
//    private By rentalPeriodSelect = By.xpath(".//div[contains(text(), 'сутки')]");
//
//    // Чек-бокс Цвет самоката
//    private By blackCheckBoxSelect = By.xpath(".//label[@for='black']");
//
//    // Поле Комментарий
//    private By commectField = By.xpath(".//input[contains(@placeholder, 'Комментарий для курьера')]");
//
//    // Кнопка Заказать
//    private By orderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
//
////    // Конструктор класса
////    public OrderPageScooter(WebDriver driver) {
////        this.driver = driver;
////    }
//
//    public void clickOrderButtonUp(){
//        driver.findElement(orderButtonUp).click();
//    }
//
//    public void clickOrderButtonDown(){
//        driver.findElement(orderButtonDown).click();
//    }
//
//    public void setUserName(String name) {
//        driver.findElement(nameField).sendKeys(name);
//    }
//
//    public void setUserSurname(String surname) {
//        driver.findElement(surnameField).sendKeys(surname);
//    }
//
//    public void setUserAddress(String address) {
//        driver.findElement(addressField).sendKeys(address);
//    }
//
//    public void setMetroStation() {
//        driver.findElement(metroField).click();
//        driver.findElement(metroStation).click();
//
//    }
//
//    public void setUserPhone(String phone) {
//        driver.findElement(phoneField).sendKeys(phone);
//    }
//
//    public void clickNextButton() {
//        driver.findElement(nextButton);
//    }
//
//    public void setDate() {
//        driver.findElement(dateField).click();
//        driver.findElement(dateFieldSelect).click();
//    }
//
//    public void setRentalPeriod() {
//        driver.findElement(rentalPeriodField).click();
//        driver.findElement(rentalPeriodSelect).click();
//    }
//
//    public void setColourScooter() {
//        driver.findElement(blackCheckBoxSelect).click();
//    }
//
//    public void setComment (String comment) {
//        driver.findElement(commectField).sendKeys(comment);
//    }
//
//    public void clickOrderButton() {
//        driver.findElement(orderButton);
//    }
//

}
