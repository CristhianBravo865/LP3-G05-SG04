class Chocolates extends Goodies {
    private String type;

    public Chocolates(int id, String description, float price, String type) {
        super(id, description, price);
        this.type = type;
    }

   

    @Override
    public String toString() {
        return "Chocolates [type=" + type + ", " + super.toString() + "]";
    }



    public String getType() {
        return type;
    }



    public void setType(String type) {
        this.type = type;
    }
}