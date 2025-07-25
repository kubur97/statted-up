package com.stattedup.tracker.models;

public enum SportsBook {

    DRAFTKINGS("DraftKings"),
    FANDUEL("FanDuel"),
    BETMGM("BetMGM"),
    ESPN_BET("ESPN Bet"),
    CAESARS("Caesars"),
    BET365("Bet365"),
    BARSTOOL("Barstool"),
    OTHER("Other");

    private final String sportsBook;

    SportsBook(String sportsBook) {
        this.sportsBook = sportsBook;
    }

    public String getSportsBook() {
        return sportsBook;
    }
}
