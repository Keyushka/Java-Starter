package project.dao;

import project.model.Bet;

import java.util.List;

public interface BetDao {
    void add(Bet bet);
    List<Bet> getBets();
    // взять по индексу ставку
    Bet getBet(int index);
}
