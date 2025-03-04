package com.mycompany.baithuchanhso3;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StudentTest {
    private Student student;

    @BeforeMethod
    public void setUp() {
        student = new Student("S001", "John", 20);
    }

    @Test
    public void testGetName() {
        Assert.assertEquals(student.getName(), "John", "Tên không đúng!");
    }

    @Test
    public void testSetAge() {
        student.setAge(25);
        Assert.assertEquals(student.getAge(), 25, "Tuổi không cập nhật đúng!");
    }

    @Test
    public void testUpdateName() {
        student.updateName("Alice");
        Assert.assertEquals(student.getName(), "Alice", "Tên không được cập nhật!");
    }
}
