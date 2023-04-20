package com.github.laefye.kublik.text;

import net.md_5.bungee.api.ChatColor;

import java.util.regex.Pattern;

public class Text {
    private static final Pattern pattern = Pattern.compile("&(#[a-fA-F0-9]{6})");

    public static String format(String text) {
        var matcher = pattern.matcher(text);
        while (matcher.find()) {
            text = text.replace(matcher.group(0), ChatColor.of(matcher.group(1)).toString());
        }
        text = ChatColor.translateAlternateColorCodes('&', text);
        return text;
    }
}
