package guru.qa.tests;

import com.github.javafaker.Faker;
import guru.qa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static guru.qa.tests.TestData.*;

public class RegistrationWithFakerFormTests extends TestDataFaker {

    RegistrationPage registrationPage = new RegistrationPage();
//    Faker faker = new Faker();
//    String firstName = faker.name().firstName(),
//            lastName = faker.name().lastName(),
//            userEmail = faker.internet().emailAddress(),
//            userNumber = faker.phoneNumber().subscriberNumber(10),
//            currentAddress = faker.address().fullAddress();

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

//        $(".modal-title").shouldHave(text("Thanks for submitting the form"));
//        $(".table-responsive").shouldHave(text(firstName + " " + lastName));
//        $(".table-responsive").shouldHave(text(userEmail));
//        $(".table-responsive").shouldHave(text(gender));
//        $(".table-responsive").shouldHave(text(userNumber));
//        $(".table-responsive").shouldHave(text("25 May,2000"));
//        $(".table-responsive").shouldHave(text(subject));
//        $(".table-responsive").shouldHave(text(hobbies));
//        $(".table-responsive").shouldHave(text(picture));
//        $(".table-responsive").shouldHave(text(currentAddress));
//        $(".table-responsive").shouldHave(text(state + " " + city));

    }

}