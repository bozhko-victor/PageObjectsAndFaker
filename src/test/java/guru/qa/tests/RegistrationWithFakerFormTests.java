package guru.qa.tests;

import com.github.javafaker.Faker;
import guru.qa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static guru.qa.tests.TestData.*;
import static guru.qa.tests.TestData.currentAddress;

public class RegistrationWithFakerFormTests extends TestData {

    RegistrationPage registrationPage = new RegistrationPage();
    Faker faker = new Faker();
    String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            userNumber = faker.phoneNumber().subscriberNumber(10),
            currentAddress = faker.address().fullAddress();

       @Test
    void fillFormTest() {

        registrationPage.openPage()
                        .typeFirstName(firstName)
                        .typeLastName(lastName)
                        .typeUserEmail(userEmail)
                        .selectGender(gender)
                        .typeUserNumber(userNumber)
                        .chooseSubject(subject)
                        .chooseHobbies(hobbies)
                        .chooseImage(picture)
                        .typeCurrentAddress(currentAddress)
                        .calendar.setData("25", "May", "2000");
        registrationPage.chooseState(state)
                        .chooseCity(city)
                        .submit()
                        .checkResults();

    }

}