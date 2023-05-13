package com.github.laefye.kublik.sql;

import com.github.laefye.kublik.api.sql.WrappedQueryResult;

import java.sql.ResultSet;
import java.sql.SQLException;

public class KublikWrappedQueryResult extends WrappedQueryResult {
    private final ResultSet set;

    public KublikWrappedQueryResult(ResultSet set) {
        this.set = set;
    }

    @Override
    public String getString(int i) {
        try {
            return set.getString(i);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public long getLong(int i) {
        try {
            return set.getLong(i);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int getInt(int i) {
        try {
            return set.getInt(i);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public boolean getBoolean(int i) {
        try {
            return set.getBoolean(i);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean next() {
        try {
            return set.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void close() {
        try {
            set.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
