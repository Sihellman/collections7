package edu.ti.caih313.collections.dataobj;

import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class EmailAddressTest {

    //These are worth 2 points each
    //TODO test that null email address is not valid
    @Test(expected = InvalidParameterException.class)
    public void testValidateEmailAddressNull()throws InvalidParameterException  {
        EmailAddress email = new EmailAddress(null, EmailAddress.Type.HOME);
    }

    //TODO test that a normal email address is valid
    @Test
    public void testValidateEmailAddressRegular()throws InvalidParameterException  {
        EmailAddress email = new EmailAddress("sivia@.com", EmailAddress.Type.HOME);

    }

    //TODO test that missing '@' in address is not valid
    @Test(expected = InvalidParameterException.class)
    public void testValidateEmailAddressNoAt() throws InvalidParameterException {
        EmailAddress email = new EmailAddress(".com", EmailAddress.Type.HOME);
    }

    //TODO test that wrong ending of email address is not valid
    @Test(expected = InvalidParameterException.class)
    public void testValidateEmailAddressWrongEnd()throws InvalidParameterException {
        EmailAddress email = new EmailAddress("kkkkho@", EmailAddress.Type.HOME);

    }
}