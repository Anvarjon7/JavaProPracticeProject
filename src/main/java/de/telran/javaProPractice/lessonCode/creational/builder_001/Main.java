package de.telran.javaProPractice.lessonCode.creational.builder_001;

import de.telran.javaProPractice.lessonCode.lesson_14_02_24.library.User;

public class Main {

    //    // bad practice
//    public void construct(int value1, boolean value2,......) {
//        construct(value1, value2);
//    }
//
//    public void construct(int value1, boolean value2,......) {
//        construct(value1, value2);
//    }
//
//    public void construct(int value1, boolean value2,......) {
//        construct(value1, value2);
//    }
//
//    public void construct(int value1, boolean value2,......) {
//        //
//    }

    // good practice
    public static void construct(UserDTO userDTO){

    }

    public static void main(String[] args) {
        UserDTO userDTO = new UserDTO
                .Builder()
                .setValue1("Value-1")
                .setValue2("Value-2")
                .build();

        construct(userDTO);
    }
}

class UserDTO{
    private final String value1;
    private final String value2;

    public UserDTO(String value1, String value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public String getValue1() {
        return value1;
    }

    public String getValue2() {
        return value2;
    }

    public static class Builder{
        private String value1;
        private String value2;

        public Builder setValue1(String value1) {
            this.value1 = value1;
            return this;
        }

        public Builder setValue2(String value2) {
            this.value2 = value2;
            return this;
        }

        public UserDTO build(){
            return new UserDTO(value1,value2);
        }
    }
}
