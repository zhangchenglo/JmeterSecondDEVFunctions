import com.github.javafaker.Faker;
import org.apache.jmeter.functions.*;
import org.apache.jmeter.functions.utils.RandomIdCardUtils;
import org.junit.jupiter.api.Test;

import java.util.*;

public class FakerTest {
    RandomChineseName randomChineseName = new RandomChineseName();

    RandomBloodGroup randomBloodGroup = new RandomBloodGroup();

    RandomIdCard randomIdCard = new RandomIdCard();

    Faker faker = new Faker(Locale.CHINA);

    @Test
    public void testRandomChineseName(){


        try {
            String execute = randomChineseName.execute();
            System.out.println(execute);
        } catch (InvalidVariableException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void testRandomIdCard(){

        try {
            String execute = randomIdCard.execute();
            System.out.println(execute);
        } catch (InvalidVariableException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void testRandomPassword(){

        String s = faker.address().streetAddress();
        String fullAddress = faker.address().fullAddress();
        String city = faker.address().city();
        String invalidSvSeSsn = faker.idNumber().validSvSeSsn();

        String field = faker.job().field();
        String keySkills = faker.job().keySkills();
        System.out.println(invalidSvSeSsn);
        System.out.println(field + keySkills);

        String ipV4Address = faker.internet().ipV4Address();
        String ipV6Address = faker.internet().ipV6Address();
        System.out.println(ipV6Address);
        System.out.println(ipV4Address);
        System.out.println(city+s);
        System.out.println(fullAddress);
        String valid = faker.idNumber().valid();
        System.out.println(valid);
        Date birthday = faker.date().birthday();
        System.out.println(birthday);
        long numberBetween = faker.number().numberBetween(1, 100);
        System.out.println(numberBetween);
        String bloodGroup = faker.name().bloodGroup();
        System.out.println(bloodGroup);

        String emailAddress = faker.internet().safeEmailAddress();
        System.out.println(emailAddress);


    }

    @Test
    public void testSSN(){

        System.out.println(RandomIdCardUtils.getRandomID());

    }

    @Test
    public void testRandomEmail(){

        RandomEmail randomEmail = new RandomEmail();
        try {

            String email = randomEmail.execute();

            System.out.println(email);

        } catch (InvalidVariableException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void testHelloWorld(){

        HelloWorld helloWorld = new HelloWorld();
        try {
            System.out.println(helloWorld.execute());
        } catch (InvalidVariableException e) {
            throw new RuntimeException(e);
        }

    }


    @Test
    public void testFakerDateSexAndSoOn(){

        RandomSex randomSex = new RandomSex();
        try {
            String execute = randomSex.execute();
            System.out.println(execute);
        } catch (InvalidVariableException e) {
            throw new RuntimeException(e);
        }


    }







}
