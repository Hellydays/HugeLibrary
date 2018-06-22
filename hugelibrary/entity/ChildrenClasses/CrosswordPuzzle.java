package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

public class CrosswordPuzzle extends Newspapper {
    private int numberOfWordsHor;
    private int getNumberOfWordsVer;
    private String questions;
    private String topic;

    public CrosswordPuzzle(String editor, String periodicity, String paidOrfree, int numberOfWordsHor, int getNumberOfWordsVer, String questions, String topic) {
        super(editor, periodicity, paidOrfree);
        this.numberOfWordsHor = numberOfWordsHor;
        this.getNumberOfWordsVer = getNumberOfWordsVer;
        this.questions = questions;
        this.topic = topic;
    }

    public CrosswordPuzzle(String title, String editor, String periodicity, String paidOrfree, int numberOfWordsHor, int getNumberOfWordsVer, String questions, String topic) {
        super(title, editor, periodicity, paidOrfree);
        this.numberOfWordsHor = numberOfWordsHor;
        this.getNumberOfWordsVer = getNumberOfWordsVer;
        this.questions = questions;
        this.topic = topic;
    }

    public CrosswordPuzzle(int numberOfWordsHor, int getNumberOfWordsVer, String questions, String topic) {
        this.numberOfWordsHor = numberOfWordsHor;
        this.getNumberOfWordsVer = getNumberOfWordsVer;
        this.questions = questions;
        this.topic = topic;
    }

    public int getNumberOfWordsHor() {
        return numberOfWordsHor;
    }

    public void setNumberOfWordsHor(int numberOfWordsHor) {
        this.numberOfWordsHor = numberOfWordsHor;
    }

    public int getGetNumberOfWordsVer() {
        return getNumberOfWordsVer;
    }

    public void setGetNumberOfWordsVer(int getNumberOfWordsVer) {
        this.getNumberOfWordsVer = getNumberOfWordsVer;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "CrosswordPuzzle{" +
                "numberOfWordsHor=" + numberOfWordsHor +
                ", getNumberOfWordsVer=" + getNumberOfWordsVer +
                ", questions='" + questions + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }
}
