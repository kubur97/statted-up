package com.stattedup.tracker.models;

import java.util.List;
import java.util.UUID;
import java.time.LocalDateTime;

public class Wager {

    private UUID wagerId;
    private List<Bet> bets;
    private LocalDateTime datePlaced;
    private WagerResult wagerResult;
    private SportsBook sportsBook;
    private String customSportsBook;
    private String notes;

    public UUID getWagerId() {
        return wagerId;
    }

    public void setWagerId(UUID wagerId) {
        this.wagerId = wagerId;
    }

    public List<Bet> getBets() {
        return bets;
    }

    public void setBets(List<Bet> bets) {
        this.bets = bets;
    }

    public LocalDateTime getDatePlaced() {
        return datePlaced;
    }

    public void setDatePlaced(LocalDateTime datePlaced) {
        this.datePlaced = datePlaced;
    }

    public WagerResult getWagerResult() {
        return wagerResult;
    }

    public void setWagerResult(WagerResult wagerResult) {
        this.wagerResult = wagerResult;
    }

    public SportsBook getSportsBook() {
        return sportsBook;
    }

    public void setSportsBook(SportsBook sportsBook) {
        this.sportsBook = sportsBook;
    }

    public String getCustomSportsBook() {
        return customSportsBook;
    }

    public void setCustomSportsBook(String customSportsBook) {
        this.customSportsBook = customSportsBook;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

}
