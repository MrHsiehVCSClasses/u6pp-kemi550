package u6pp;

public class Card {

    public static String RED = "RED";
    public static String GREEN = "GREEN";
    public static String BLUE = "BLUE";
    public static String YELLOW = "YELLOW";

    public static String ZERO = "0";
    public static String ONE = "1";
    public static String TWO = "2";
    public static String THREE = "3";
    public static String FOUR = "4";
    public static String FIVE = "5";
    public static String SIX = "6";
    public static String SEVEN = "7";
    public static String EIGHT = "8";
    public static String NINE = "9";

    public static String DRAW_2 = "DRAW_2";
    public static String REVERSE = "REVERSE";
    public static String SKIP = "SKIP";
    public static String WILD = "WILD";
    public static String WILD_DRAW_4 = "WILD_DRAW_4";

    // Wild color is the default color for wilds, before they are played. 
    public static String[] COLORS = {RED, GREEN, BLUE, YELLOW, WILD}; 
    public static String[] VALUES = {ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, 
        DRAW_2, REVERSE, SKIP, WILD, WILD_DRAW_4};

    String color;
    String value;
    // Constructor 
    public Card(String color, String value){
        this.color = color;
        this.value = value;
    }
    // get methods
    public String getColor(){
        return color;
    }
    public String getValue(){
        return value;
    }
    // tries to set the color of the card if it is wild 
    public boolean trySetColor(String newColor) {
        if (newColor == null) {
            return false;
        }
        for (String color : COLORS) {
            if (color.equalsIgnoreCase(newColor)) {
                if (value.equalsIgnoreCase(WILD)) {
                    this.color = newColor;
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
    // checks if you can play on the card (if value or color is valid to play on)
    public boolean canPlayOn(Card card){
            if(color.equalsIgnoreCase(color)){
                return true;
            }
            for(String value : VALUES){
                if(value.equalsIgnoreCase(value))
                return true;
            }
        return false;
    }
    
}
