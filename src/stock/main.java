package stock;

public class main {
    public static void main(String args[]){
    Stock s=new Stock("ORCL","Oracle");

   s.setPreviousClosingPrice(34.5);
   s.setCurrentPrice(34.35);
        System.out.println(s.toString());
        System.out.println( s.getChangePercent());
}}
