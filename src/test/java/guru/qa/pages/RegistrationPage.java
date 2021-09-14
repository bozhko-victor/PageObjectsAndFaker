package guru.qa.pages;

import com.codeborne.selenide.SelenideElement;
import guru.qa.pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static guru.qa.tests.TestData.*;

public class RegistrationPage {

    private final String FORM_TITLE = "Student Registration Form";
    private SelenideElement
            formTitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userNumberInput = $("#userNumber"),
            userEmailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            userGenderInput = $("#genterWrapper"),
            subjectInput = $("#subjectsInput"),
            hobbiesInput = $("#hobbiesWrapper"),
            imageInput = $("#uploadPicture");

    public CalendarComponent calendar = new CalendarComponent();

    public RegistrationPage openPage() {
        open("/automation-practice-form");
        formTitle.shouldHave(text(FORM_TITLE));
        return this;
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
    public RegistrationPage selectGender(String gender) {
        userGenderInput.$(byText(gender)).click();
        return this;
    }
    public RegistrationPage chooseSubject(String subject) {
        subjectInput.setValue(subject).pressEnter();
        return this;
    }
    public RegistrationPage chooseHobbies(String hobbies) {
        hobbiesInput.$(byText(hobbies)).click();
        return this;
    }
    public RegistrationPage chooseImage(String picture) {
        imageInput.uploadFromClasspath("img/1.png");
        return this;
    }
    public RegistrationPage chooseState(String state) {
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        return this;
    }
    public RegistrationPage chooseCity(String state) {
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        return this;
    }
    public RegistrationPage submit() {
        $("#submit").click();
        return this;
    }
    public void checkResults() {

        $(".modal-title").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text(firstName + " " + lastName));
        $(".table-responsive").shouldHave(text(userEmail));
        $(".table-responsive").shouldHave(text(gender));
        $(".table-responsive").shouldHave(text(userNumber));
        $(".table-responsive").shouldHave(text(subject));
        $(".table-responsive").shouldHave(text(hobbies));
        $(".table-responsive").shouldHave(text(picture));
        $(".table-responsive").shouldHave(text(currentAddress));
        $(".table-responsive").shouldHave(text(state + " " + city));
        $(".table-responsive").shouldHave(text("25 May,2000"));
    }
    public void checkResultsFaker() {

        $(".modal-title").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text(firstName + " " + lastName)); //
        $(".table-responsive").shouldHave(text(userEmail));                  //
        $(".table-responsive").shouldHave(text(gender));
        $(".table-responsive").shouldHave(text(userNumber));                 //
        $(".table-responsive").shouldHave(text(subject));
        $(".table-responsive").shouldHave(text(hobbies));
        $(".table-responsive").shouldHave(text(picture));
        $(".table-responsive").shouldHave(text(currentAddress));               //
        $(".table-responsive").shouldHave(text(state + " " + city));
        $(".table-responsive").shouldHave(text("25 May,2000"));
    }

}
