package com.springboot_8;

public class Dev
{
//    private Laptop laptop;
    private int age;

//    Code after creating the Computer interface

    private Computer computer;


    public Dev()
    {
        System.out.println("Dev class object is created successfully...");
    }

//    public Dev(int age)
//    {
//        this.age = age;
//    }

//    public Dev(Laptop laptop)
//    {
//        this.laptop = laptop;
//    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    //    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build()
    {
        System.out.println("Working on project...");
        computer.compile();
    }
}
