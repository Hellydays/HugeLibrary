package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

public class Sudoku extends Newspapper {

    private String complexity;
    private String size;
    private String rules;
    private String algorithm;

    public Sudoku(String editor, String periodicity, String paidOrfree, String complexity, String size, String rules, String algorithm) {
        super(editor, periodicity, paidOrfree);
        this.complexity = complexity;
        this.size = size;
        this.rules = rules;
        this.algorithm = algorithm;
    }

    public Sudoku(String title, String editor, String periodicity, String paidOrfree, String complexity, String size, String rules, String algorithm) {
        super(title, editor, periodicity, paidOrfree);
        this.complexity = complexity;
        this.size = size;
        this.rules = rules;
        this.algorithm = algorithm;
    }

    public Sudoku(String complexity, String size, String rules, String algorithm) {
        this.complexity = complexity;
        this.size = size;
        this.rules = rules;
        this.algorithm = algorithm;
    }

    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public String toString() {
        return "Sudoku{" +
                "complexity='" + complexity + '\'' +
                ", size='" + size + '\'' +
                ", rules='" + rules + '\'' +
                ", algorithm='" + algorithm + '\'' +
                '}';
    }
}
