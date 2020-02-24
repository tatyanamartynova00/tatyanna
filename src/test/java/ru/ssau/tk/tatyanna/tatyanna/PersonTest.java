package ru.ssau.tk.tatyanna.tatyanna;

import ru.ssau.tk.tatyanna.tatyanna.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    public void test() {

        Person firstHuman = new Person();
        Person secondHuman = new Person();
        Person thirdHuman = new Person();

        firstHuman.setFirstName("Katya");
        firstHuman.setLastName("Popova");
        firstHuman.setPassportId(129845);

        secondHuman.setFirstName("Maks");
        secondHuman.setLastName("Korolev");
        secondHuman.setPassportId(952187);

        thirdHuman.setFirstName("Oksana");
        thirdHuman.setLastName("Rydina");
        thirdHuman.setPassportId(317912);

        assertEquals(firstHuman.getFirstName(), "Katya");
        assertEquals(firstHuman.getLastName(), "Popova");
        assertEquals(firstHuman.getPassportId(), 129845);

        assertEquals(secondHuman.getFirstName(), "Maks");
        assertEquals(secondHuman.getLastName(), "Korolev");
        assertEquals(secondHuman.getPassportId(), 952187);

        assertEquals(thirdHuman.getFirstName(), "Oksana");
        assertEquals(thirdHuman.getLastName(), "Rydina");
        assertEquals(thirdHuman.getPassportId(), 317912);



    }

}

