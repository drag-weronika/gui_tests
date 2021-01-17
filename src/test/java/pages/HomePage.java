package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import utils.ActionsUtils;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class HomePage extends BasePage {

    @FindBys
            (@FindBy(xpath = "//a[@class='next_page']"))
    private List<WebElement> arrowActiveRight;
    @FindBy(xpath = "//h1[contains(text(), 'Happy Puppy')]")
    private WebElement homePageHeader;

    public HomePage(ActionsUtils actions) {
        super(actions);
    }

    public boolean isHomePageVisible() {
        return actions.isElementDisplayed(homePageHeader);
    }

    public List<String> getListOfPuppies() {
        List<String> puppiesList = getNamesFromVisibleCards();
        while (!arrowActiveRight.isEmpty()) {
            actions.clickWebElement(arrowActiveRight.get(0));
            List<String> nextPagesValues = getNamesFromVisibleCards();
            puppiesList.addAll(nextPagesValues);
        }
        return puppiesList;
    }

    private List<String> getNamesFromVisibleCards() {
        return actions.findAllByXpath("//div[starts-with(@class, 'list_line_')]")
                .stream()
                .map(card -> card.findElement(By.xpath(".//div[@class='name']/h3")).getText())
                .collect((Collectors.toList()));
    }

    public void goToPuppyDetails(String puppyName) {
        while (actions.findAllByXpath("//div[@class='name']/h3[contains(text(),'" + puppyName + "')]").isEmpty()) {
            actions.clickWebElement(arrowActiveRight.get(0));
        }
        actions.clickWebElement((actions.findByXpath("//div[@class='name']/h3[contains(text(),'" + puppyName + "')]").findElement(By.xpath(".."))).findElement(By.xpath("following-sibling::*[2]")));
    }

    public String getRandomPuppy(List<String> givenList) {
        Random rand = new Random();
        int randomIndex = rand.nextInt(givenList.size());
        String randomElement = givenList.get(randomIndex);
        givenList.remove(randomIndex);
        return randomElement;
    }

    public boolean iaAdoptionSuccessful() {
        return actions.isDisplayed("//p[contains(text(),'Thank you for adopting a puppy!')]");
    }

}