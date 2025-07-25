package com.stattedup.tracker.models;

public enum League {

    NBA("NBA"),
    NFL("NFL"),
    MLB("MLB");

    private final String league;

    League(String league) {
        this.league = league;
    }

    public String getLeague() {
        return league;
    }
}
