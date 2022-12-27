package com.example.wortest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    final String correctEmail = "yura@yandex.ru";
    final String wrongEmail = "yandex.ru";
    final String name1 = "Inna";
    final String name2 = "Ignat";


    //user with normal fields
    User user1;
    //user with wrong email
    User user2;
    //empty user
    User user3;


    @BeforeEach
    public void setUp (){
        user1 = new User(name1, correctEmail);
        user2 = new User(name2, wrongEmail);
        user3 = new User();
    }

    @Test
    @DisplayName("Тест проверки равны ли login и email (Они не должны быть равны)")
    void objectFieldsAreNotEquals(){
        assertNotEquals(user1.getEmail(), user1.getLogin());
    }

    @Test
    @DisplayName("Тест проверки email (должны быть символы '.' и '@')")
    void checkEmail() {
        assertTrue(user1.checkEmail(user1.getEmail()));
    }

    @Test
    @DisplayName("Тест конструктора с двумя параметрами")
    void testUserFullConstructor(){
        assertNotNull(user1.getLogin());
        assertNotNull(user1.getEmail());
    }

    @Test
    @DisplayName("Тест пустого конструктора")
    void testUserEmptyConstructor(){
        assertNull(user3.getLogin());
        assertNull(user3.getEmail());
    }

    @Override
    public String toString() {
        return "UserTest{" +
                "correctEmail='" + correctEmail + '\'' +
                ", wrongEmail='" + wrongEmail + '\'' +
                ", name_1='" + name1 + '\'' +
                ", name_2='" + name2 + '\'' +
                                '}';
    }
}
