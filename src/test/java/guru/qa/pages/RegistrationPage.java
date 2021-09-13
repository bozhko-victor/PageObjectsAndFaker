package guru.qa.pages;

import com.codeborne.selenide.SelenideElement;
import guru.qa.pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    private final String FORM_TITLE = "Student Registration Form";
    private SelenideElement
            formTitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userNumberInput = $("#userNumber"),
            userEmailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            userGenderInput = $("#genterWrapper");
    public CalendarComponent calendar = new CalendarComponent();

    public void openPage() {
        open("/automation-practice-form");
        formTitle.shouldHave(text(FORM_TITLE));
    }
    public RegistrationPage typeFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }
    public RegistrationPage typeLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }
    public RegistrationPage typeUserNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }
    public RegistrationPage typeUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }
    public RegistrationPage typeCurrentAddress(String value) {
        currentAddressInput.setValue(value);
        return this;
    }
    public RegistrationPage selectGender(String value) {
        userGenderInput.$(byText(value)).click();
        return this;
    }


//    $("#genterWrapper").$(byText("Male")).click();
//    $("#currentAddress").setValue("some street 7");
//    $("#userNumber").setValue("9876543210");
//$("#userEmail").setValue("ivan@petrov.com");
}
