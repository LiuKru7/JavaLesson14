package example_2;

import java.util.Arrays;

public class Pizza {
    private String name;
    private boolean isBaked;
    private String sauceType;
    private String [] ingredients = new String[2];


    public Pizza(String name, String[] ingredients, String sauceType, boolean isBaked) {
        this.name = name;
        this.ingredients = ingredients;
        this.sauceType = sauceType;
        this.isBaked = isBaked;
    }

    public Pizza() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBaked() {
        return isBaked;
    }

    public void setBaked(boolean baked) {
        isBaked = baked;
    }

    public String getSauceType() {
        return sauceType;
    }

    public void setSauceType(String sauceType) {
        this.sauceType = sauceType;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", isBaked=" + isBaked +
                ", sauceType='" + sauceType + '\'' +
                ", ingredients=" + Arrays.toString(ingredients) +
                '}';
    }
}
