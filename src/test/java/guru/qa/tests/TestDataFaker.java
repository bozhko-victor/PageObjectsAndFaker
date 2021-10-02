package guru.qa.tests;

import com.github.javafaker.Faker;

 public class TestDataFaker {

    static Faker faker = new Faker();
    public static String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            userNumber = faker.phoneNumber().subscriberNumber(10),
            currentAddress = faker.address().fullAddress();

    public static String
//            firstName = "Ivan",
//            lastName = "Petrov",
//            userEmail = "ivan@petrov.com",
//            userNumber = "9876543210",
            gender = "Male",
            subject = "Math",
            hobbies = "Reading",
            picture = "1.png",
//            currentAddress = "some street 7",
            state = "NCR",
            city = "Delhi";
}
