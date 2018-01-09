package kr.co.ana.myapplication1226hw;

public class Food {
    String food;
    String price;
    String image;

    public Food(String food, String price, String image) {
        this.food = food;
        this.price = price;
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
