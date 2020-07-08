/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap1;

import java.io.Serializable;

/**
 *
 * @author Acer
 */
public class Dog implements Serializable {

    private String name, color, gender;
    private int age;

    public Dog() {
    }

    public Dog(String name, String color, String gender, int age) {
        this.name = name;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", color=" + color + ", gender=" + gender + ", age=" + age + '}';
    }

}
