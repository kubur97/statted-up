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
}
