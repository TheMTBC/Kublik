package com.github.laefye.kublik;

import com.github.laefye.kublik.api.KublikPlugin;
import com.github.laefye.kublik.api.Text;
import com.github.laefye.kublik.api.sql.WrappedStatement;
import com.github.laefye.kublik.sql.KublikWrappedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public final class Kublik extends KublikPlugin {
    private final Text text = new KublikText();

    @Override
    public Text getText() {
        return text;
    }

    @Override
    public WrappedStatement create(Connection connection, String s) {
        try {
            return new KublikWrappedStatement(connection.prepareStatement(s));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
