package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

public class Newsletter extends Newspapper {

    private String type;
    private String language;
    private String size;

    public Newsletter(String type,String language, String size) {
        this.type = type;
        this.language = language;
        this.size = size;
    }

    public Newsletter(String editor, String periodicity, String paidOrfree, String type, String language, String size) {
        super(editor, periodicity, paidOrfree);
        this.type = type;
        this.language = language;
        this.size = size;
    }

    public Newsletter(String title, String editor, String periodicity, String paidOrfree, String type, String language, String size) {
        super(title, editor, periodicity, paidOrfree);
        this.type = type;
        this.language = language;
        this.size = size;
    }

//    @Override
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Newsletter{" +
                "type='" + type + '\'' +
                ", language='" + language + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
