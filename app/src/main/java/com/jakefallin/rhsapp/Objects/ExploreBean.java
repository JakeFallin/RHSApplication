package com.jakefallin.rhsapp.Objects;

public class ExploreBean {

    private String when, where, more, date;

    public ExploreBean(String mWhen, String mWhere, String mMore, String mDate)
    {
        when = mWhen;
        where = mWhere;
        more = mMore;
        date = mDate;

    }

    public String getWhen() {
        return when;
    }

    public String getWhere() {
        return where;
    }

    public String getMore() {
        return more;
    }

    public String getDate() {
        return date;
    }
}