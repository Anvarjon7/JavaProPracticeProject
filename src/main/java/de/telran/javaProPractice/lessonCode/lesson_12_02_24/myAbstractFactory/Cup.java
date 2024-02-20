package de.telran.javaProPractice.lessonCode.lesson_12_02_24.myAbstractFactory;

import de.telran.javaProPractice.lessonCode.lesson_12_02_24.myAbstractFactory.Cover;

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
