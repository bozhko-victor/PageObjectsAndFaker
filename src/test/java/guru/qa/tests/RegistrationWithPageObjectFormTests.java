package guru.qa.tests;

import guru.qa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

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