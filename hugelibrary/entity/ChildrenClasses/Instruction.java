package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

import com.example.ewgen.hugelibrary.entity.BaseClasses.AuthorsBook;

public class Instruction extends AuthorsBook {

    private String rules;
    private String subject;

    public Instruction(String rules, String subject) {
        this.rules = rules;
        this.subject = subject;
    }

    public Instruction(String author, String rules, String subject) {
        super(author);
        this.rules = rules;
        this.subject = subject;
    }

    public Instruction(String title, String author, String rules, String subject) {
        super(title, author);
        this.rules = rules;
        this.subject = subject;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Instruction{" +
                "rules='" + rules + '\'' +
                ", subject='" + subject + '\'' +
                "} " + super.toString();
    }
}
