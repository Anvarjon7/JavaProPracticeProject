package de.telran.javaProPractice.lessonCode.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        User[] users = {new User("User - 1"), new User("User - 2"), new User("User - 3")};
        UserList userList = new UserList(users);
        Iterator<User> iterator = userList.iterator();
        while(iterator.hasNext()){
            User user = iterator.next();
            System.out.println(user.getName());
        }


    }
}
