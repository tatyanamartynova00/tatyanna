package ru.ssau.tk.tatyanna.tatyanna;

import ru.ssau.tk.tatyanna.tatyanna.Person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class PersonTest2 {
    Person firstHuman = new Person(null, null);
    Person secondHuman = new Person("Katya", "Orlova", 548962);
    Person thirdHuman = new Person();
    Person fourthHuman = new Person();
    Person fifthHuman = new Person("Kolya", "Serov", Gender.MALE);

    @Test
    public void testFirstName() {
        firstHuman.setFirstName("Alyona");
        secondHuman.setFirstName(null);
        assertEquals(firstHuman.getFirstName(), "Alyona");
        assertEquals(secondHuman.getFirstName(), null);
        assertNull(fourthHuman.getFirstName());
    }

    @Test
    public void testLastName() {
        secondHuman.setLastName("Pavlova");
        thirdHuman.setLastName("Kazakov");
        firstHuman.setLastName(null);
        assertEquals(secondHuman.getLastName(), "Pavlova");
        assertEquals(thirdHuman.getLastName(), "Kazakov");
        assertNull(firstHuman.getLastName());
        assertNull(fourthHuman.getLastName());
    }

    @Test
    public void testGetPassportId() {
        secondHuman.setPassportId(123684);
        thirdHuman.setPassportId(778899);
        assertEquals(firstHuman.getPassportId(), 0);
        assertEquals(secondHuman.getPassportId(), 123684);
        assertEquals(thirdHuman.getPassportId(), 778899);
        assertEquals(fourthHuman.getPassportId(), 0);
    }

    @Test
    public void testFifthHuman() {
        assertEquals(fifthHuman.getFirstName(), "Kolya");
        assertEquals(fifthHuman.getLastName(), "Serov");
        assertEquals(fifthHuman.getGender(), Gender.MALE);
    }

    @Test
    public void testToString() {
        assertEquals(secondHuman.toString(), "Katya Orlova");
        assertEquals(fifthHuman.toString(), "Kolya Serov");
    }
}



