package com.stattedup.tracker.models;

public enum WagerResult {

    WON("Won"),
    LOST("Lost"),
    PENDING("Pending"),
    CANCELLED("Cancelled");

    private final String wagerResult;

    WagerResult(String wagerResult) {
        this.wagerResult = wagerResult;
    }

    public String getWagerResult() {
        return wagerResult;
    }
}
