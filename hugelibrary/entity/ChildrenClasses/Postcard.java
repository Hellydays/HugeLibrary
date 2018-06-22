package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

import com.example.ewgen.hugelibrary.entity.BaseClasses.Ebook;

public class Postcard extends Ebook {

    private String kind;
    private String painter;
    private String country;
    private String plot;
    private Boolean voice;

    public Postcard(String format, String size, String kind, String painter, String country, String plot, Boolean voice) {
        super(format, size);
        this.kind = kind;
        this.painter = painter;
        this.country = country;
        this.plot = plot;
        this.voice = voice;
    }

    public Postcard(String title, String format, String size, String kind, String painter, String country, String plot, Boolean voice) {
        super(title, format, size);
        this.kind = kind;
        this.painter = painter;
        this.country = country;
        this.plot = plot;
        this.voice = voice;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getPainter() {
        return painter;
    }

    public void setPainter(String painter) {
        this.painter = painter;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public Boolean getVoice() {
        return voice;
    }

    public void setVoice(Boolean voice) {
        this.voice = voice;
    }

    @Override
    public String toString() {
        return "Postcard{" +
                "kind='" + kind + '\'' +
                ", painter='" + painter + '\'' +
                ", country='" + country + '\'' +
                ", plot='" + plot + '\'' +
                ", voice=" + voice +
                "} " + super.toString();
    }
}
