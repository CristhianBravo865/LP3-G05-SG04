class Soda extends Biscuits {
    private String sodaType;

    public Soda(int id, String description, float price, String flavor, String sodaType) {
        super(id, description, price, flavor);
        this.sodaType = sodaType;
    }

    
    @Override
    public String toString() {
        return "Soda [sodaType=" + sodaType + ", " + super.toString() + "]";
    }


    public String getSodaType() {
        return sodaType;
    }


    public void setSodaType(String sodaType) {
        this.sodaType = sodaType;
    }
}