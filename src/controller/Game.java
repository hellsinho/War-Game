package controller;
import java.util.List;
import java.util.ArrayList;

public class Game {
    private static Game instance;
    private String[] availableColors;

    protected Game(String[] colors) {
        this.availableColors = colors;
    }

    public static synchronized Game getInstance(String[] colors) {
        if (instance == null) {
            instance = new Game(colors);
        }
        return instance;
    }

    public String[] getAvailableColors() {
        for (int i = 0; i < this.availableColors.length; i++) {
            System.out.println(availableColors[i]);
        }
        return availableColors;
    }

    public void removeAvaibleColor(String choicedColor){
        for (int i = 0; i < availableColors.length; i++){
            if(choicedColor.equals(availableColors[i])){
                this.availableColors.remove(i);
            }
        }
    }
}
