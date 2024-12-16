public class CandyCount {
    public static void main(String[] args) {
        double money = 12.4;
        double price =  1.2;
        int candies = 0;

        while ((money - price) >= 0) {
            candies++;
            money -= price;
        }
        /* Le bloc if a été suppr car inutile ;) */
        
        System.out.println("Number of candies obtained : "+ candies);
        System.out.println("Here is the change : "+ (Math.round(money*100)/100.0));
    }
}