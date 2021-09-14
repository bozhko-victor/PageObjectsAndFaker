package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import guru.qa.pages.RegistrationPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static guru.qa.tests.TestData.*;

public class RegistrationWithPageObjectFormTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

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