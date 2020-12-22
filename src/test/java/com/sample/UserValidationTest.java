package com.sample;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {

    @Test
    public void giveFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean results = validator.validateFirstName("Narayan");
        Assert.assertEquals(true, results);
    }

    @Test
    public void giveFirstName_WhenProper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean results = validator.validateFirstName("Na");
        Assert.assertEquals(false, results);
    }

    @Test
    public void giveLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean results = validator.validateLastName("Kumar");
        Assert.assertEquals(true, results);
    }

    @Test
    public void giveEmail_WhenValid_ShouldReturnFalse(){
        UserValidator validator = new UserValidator();
        boolean results = validator.validateEmailAddress("abc@gmail.com");
        Assert.assertEquals(true, results);
    }

    @Test
    public void givePassword_whenProper_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        boolean results = validator.validatePassword("Acad@12&scc");
        Assert.assertEquals(true, results);
    }

    @Test
    public void givePhoneNumber_whenProper_ShouldReturnTrue(){
        UserValidator validator = new UserValidator();
        boolean results = validator.validatePhoneNumber("91-7123456789");
        Assert.assertEquals(true, results);
    }
}
