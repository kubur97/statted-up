package com.stattedup.tracker.models;

import java.util.UUID;

public class Bet {

    private UUID betId;
    private League league;
    private BetType betType;
    private String customBetLabel;
    private String event;
    private String selection;
    private int odds;
    private WagerResult wagerResult;

    public UUID getBetId() {
        return betId;
    }

    public void setBetId(UUID betId) {
        this.betId = betId;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public BetType getBetType() {
        return betType;
    }

    public void setBetType(BetType betType) {
        this.betType = betType;
    }

    public String getCustomBetLabel() {
        return customBetLabel;
    }

    public void setCustomBetLabel(String customBetLabel) {
        this.customBetLabel = customBetLabel;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }

    public int getOdds() {
        return odds;
    }

    public void setOdds(int odds) {
        this.odds = odds;
    }

    public WagerResult getWagerResult() {
        return wagerResult;
    }

    public void setWagerResult(WagerResult wagerResult) {
        this.wagerResult = wagerResult;
    }
}
