package com.stattedup.tracker.models;

public enum BetType {

    MONEYLINE("Moneyline"),
    SPREAD("Spread"),
    TOTAL("Total"),
    OVER_UNDER("Over/Under"),
    PLAYER_PROP("Player Prop"),
    TEAM_PROP("Team Prop"),
    FUTURES("Futures"),
    OTHER("Other");

    private final String type;

    BetType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
