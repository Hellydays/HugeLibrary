package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

public class Scanwords extends Newspapper {

    private String complexity;
    private String numberOfWords;
    private String publishingHouse;
    private Boolean withPic;

    public Scanwords(String editor, String periodicity, String paidOrfree, String complexity, String numberOfWords, String publishingHouse, Boolean withPic) {
        super(editor, periodicity, paidOrfree);
        this.complexity = complexity;
        this.numberOfWords = numberOfWords;
        this.publishingHouse = publishingHouse;
        this.withPic = withPic;
    }

    public Scanwords(String title, String editor, String periodicity, String paidOrfree, String complexity, String numberOfWords, String publishingHouse, Boolean withPic) {
        super(title, editor, periodicity, paidOrfree);
        this.complexity = complexity;
        this.numberOfWords = numberOfWords;
        this.publishingHouse = publishingHouse;
        this.withPic = withPic;
    }

    public Scanwords(String complexity, String numberOfWords, String publishingHouse, Boolean withPic) {
        this.complexity = complexity;
        this.numberOfWords = numberOfWords;
        this.publishingHouse = publishingHouse;
        this.withPic = withPic;
    }

    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

    public String getNumberOfWords() {
        return numberOfWords;
    }

    public void setNumberOfWords(String numberOfWords) {
        this.numberOfWords = numberOfWords;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public Boolean getWithPic() {
        return withPic;
    }

    public void setWithPic(Boolean withPic) {
        this.withPic = withPic;
    }

    @Override
    public String toString() {
        return "Scanwords{" +
                "complexity='" + complexity + '\'' +
                ", numberOfWords='" + numberOfWords + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", withPic=" + withPic +
                '}';
    }
}
