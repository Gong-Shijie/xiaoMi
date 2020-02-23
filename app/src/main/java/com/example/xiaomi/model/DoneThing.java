package com.example.xiaomi.model;

import org.litepal.crud.DataSupport;

import java.util.Date;

public class DoneThing extends DataSupport {
    private int id;
    private String bookName;
    private String content;
    private Date timeStart;
    private double timeSpent;
    private  Date day;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String gettBookName() {
        return bookName;
    }

    public void settBookName(String tBookName) {
        this.bookName = tBookName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

    public double getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(double timeSpent) {
        this.timeSpent = timeSpent;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }
}