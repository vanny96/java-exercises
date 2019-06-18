package com.vanny96;

import java.util.ArrayList;

public class Team{
  private String name;
  private ArrayList<Player> players;
  private int maxSize;

  public Team(String name){
    this.name = name;
    this.maxSize = 16;
    players = new ArrayList<Player>(); 
  }

  public String getName(){
    return name;
  }

  public void addPlayer(Player player){
    if(size() < this.maxSize){
      players.add(player);
    }
  }

  public void printPlayers(){
    for(Player player : players){
      System.out.println(player);
    }
  }

  public void setMaxSize(int value){
    this.maxSize = value;
  }

  public int size(){
    return players.size();
  }

  public int goals(){
    int goals = 0;
    for(Player player : players){
      goals += player.goals();
    }
    return goals;
  }
}