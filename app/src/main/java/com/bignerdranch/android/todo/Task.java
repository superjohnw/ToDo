package com.bignerdranch.android.todo;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Super on 10/30/2015.
 */
public class Task {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mDone;

    public Task() {
        //Generate unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isDone() {
        return mDone;
    }

    public void setDone(boolean done) {
        mDone = done;
    }
}
