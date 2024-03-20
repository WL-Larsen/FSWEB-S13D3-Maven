package org.example;

public class Person {

        //instance variable
        String firstname;
        String lastName;
        int age;

        //Additional instance variable
        String email;
        String address;
        boolean isEmployed;

        //constructor definitions
        public Person(String firstname,String lastname,int age){
            this.firstname = firstname;
            this.lastName = lastname;
            this.age = age;
        }

        //Additional constructor definitions
        public Person(String firstname,String lastname,int age,String email,String address,boolean isEmployed){
            //constructor chaining
            this(firstname,lastname,age );

            this.email = email;
            this.address = address;
            this.isEmployed = isEmployed;
        }

        // Method Definitions
        public String getFirstName(){
            return firstname;
        }
        public String getLastName(){
            return lastName;
        }
        public int getAge(){
            return age;
        }
        public boolean isTeen(){
            return (age >= 13 && age <= 19);
        }

    }

