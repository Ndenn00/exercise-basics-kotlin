package com.basics.java;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Meeting {
    private String title;

    public @Nullable
    String meetingTitle() {
        return title;
    }

    public void addTitle(@NotNull String title) {
        this.title = title;
    }

    public @NotNull String titleCanBeNull(){
        return title;
    }
}
