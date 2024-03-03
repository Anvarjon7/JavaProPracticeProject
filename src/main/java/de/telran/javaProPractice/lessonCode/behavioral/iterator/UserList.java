package de.telran.javaProPractice.lessonCode.behavioral.iterator;

public class UserList implements List<User>{

    private User[] users;

    public UserList(User[] users) {
        this.users = users;
    }

    @Override
    public Iterator<User> iterator() {
        return new UserIterator(users);
    }
}
