package com.github.laefye.kublik.sql;

import com.github.laefye.kublik.api.sql.WrappedQueryResult;
import com.github.laefye.kublik.api.sql.WrappedStatement;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class KublikWrappedStatement extends WrappedStatement {
    private final PreparedStatement statement;
    private int n = 1;

    public KublikWrappedStatement(PreparedStatement statement) {
        this.statement = statement;
    }

    @Override
    public WrappedStatement setString(String s) {
        try {
            statement.setString(n, s);
            n++;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public WrappedStatement setLong(long l) {
        try {
            statement.setLong(n, l);
            n++;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public WrappedStatement setInt(int i) {
        try {
            statement.setInt(n, i);
            n++;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public WrappedStatement setBoolean(boolean b) {
        try {
            statement.setBoolean(n, b);
            n++;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public void execute() {
        try {
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public WrappedQueryResult executeQuery() {
        try {
            return new KublikWrappedQueryResult(statement.executeQuery());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
