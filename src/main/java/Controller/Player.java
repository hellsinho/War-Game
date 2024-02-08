package controller;

import Contract.GameInterface;

public class Game{
    private String[] avaibleColors;

    public Game(String[] colors){
        this.avaibleColors = colors;
    }

    public String[] getAvaibleColors() {
        return avaibleColors;
    }

    public static boolean compareColors(String color) {
        if (this.avaibleColors != null && !this.avaibleColors.isEmpty()) {
            for (String str : this.avaibleColors) {
                if (color.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

}

public class Player extends Game {
    private String playerColor;
    public void SetPlayerColor(String playerChoiceColor) {
        Game game = new Game;
        if (game.compareColors(playerChoiceColor)){
            this.playerColor = playerChoiceColor;
        }
    }
}

