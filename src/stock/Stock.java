package stock;
public class Stock {
    private String Sympol;
    private String name;
    private double PreviousClosingPrice;
    private double CurrentPrice;
    public Stock(String sympol, String name) {
      this.Sympol = sympol;
        this.name = name;}
    public String getSympol() {
        return Sympol;}
    public void setSympol(String sympol) {
        Sympol = sympol;}
    public String getName() {
        return name;}
    public void setName(String name) {
        this.name = name;}
    public double getPreviousClosingPrice() {
        return PreviousClosingPrice;}
    public void setPreviousClosingPrice(double previousClosingPrice) {
        PreviousClosingPrice = previousClosingPrice;}
    public double getCurrentPrice() {
        return CurrentPrice;}
    public void setCurrentPrice(double currentPrice) {
        CurrentPrice = currentPrice;}
    public double getChangePercent(){
       return (CurrentPrice-PreviousClosingPrice)/(PreviousClosingPrice*0.01);
       }

    @Override
    public String toString() {
        return "Stock{" +
                "Sympol='" + Sympol + '\'' +
                ", name='" + name + '\'' +
                ", PreviousClosingPrice=" + PreviousClosingPrice +
                ", CurrentPrice=" + CurrentPrice +
                '}';
    }
}
