package de.telran.javaProPractice.lessonCode.behavioral.iterator;

public class UserIterator implements Iterator<User>{
    private User[] users;
    private int position;

    public UserIterator(User[] users) {
        this.users = users;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        if (position >= users.length) {
            return false;
        }
        return true;
    }

    @Override
    public void reset() {
        this.position = 0;
    }

    @Override
    public User next() {
        return users[position++];
    }
}
