class Sweet extends Biscuits {
    private String sweetType;

    public Sweet(int id, String description, float price, String flavor, String sweetType) {
        super(id, description, price, flavor);
        this.sweetType = sweetType;
    }

    

    @Override
    public String toString() {
        return "Sweet [sweetType=" + sweetType + ", " + super.toString() + "]";
    }



    public String getSweetType() {
        return sweetType;
    }



    public void setSweetType(String sweetType) {
        this.sweetType = sweetType;
    }
}