package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

public class SchedulesOfTelecasts extends Newspapper {
    private String channel;
    private String beginDate;
    private String endDate;

    public SchedulesOfTelecasts(String editor, String periodicity, String paidOrfree, String channel, String beginDate, String endDate) {
        super(editor, periodicity, paidOrfree);
        this.channel = channel;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public SchedulesOfTelecasts(String title, String editor, String periodicity, String paidOrfree, String channel, String beginDate, String endDate) {
        super(title, editor, periodicity, paidOrfree);
        this.channel = channel;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public SchedulesOfTelecasts(String channel, String beginDate, String endDate) {
        this.channel = channel;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "SchedulesOfTelecasts{" +
                "channel='" + channel + '\'' +
                ", beginDate='" + beginDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
