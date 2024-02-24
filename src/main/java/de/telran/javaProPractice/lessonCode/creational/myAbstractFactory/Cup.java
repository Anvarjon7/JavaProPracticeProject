package de.telran.javaProPractice.lessonCode.creational.myAbstractFactory;

public class Cup {
    private String cupType;
    private String size;
    private Cover cover;

    public Cup(String cupType, String size) {
        this.cupType = cupType;
        this.size = size;
        this.cover = null;
    }

    public void addCover(Cover cover){
        this.cover = cover;
    }
}
