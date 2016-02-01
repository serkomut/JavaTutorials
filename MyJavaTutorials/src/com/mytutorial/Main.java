package com.mytutorial;

public class Main {

    public static void main(String[] args) {
        String newLine = System.getProperty("line.separator");

        ChapterOne chapterOne = new ChapterOne();
        System.out.println("Numbers >>> for :");
        chapterOne.Numbers();

        System.out.println(newLine);
        System.out.println("NumbersList >>> for");
        chapterOne.NumbersList();

        System.out.println(newLine);
        System.out.println("NumbersList >>> for");
        chapterOne.StringAray();
    }
}