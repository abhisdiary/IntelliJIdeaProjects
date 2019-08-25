
/*
The class is developed to manage items for fruit shop.

*/

public class ItemManage {

    public static void main(String[] args) {

    }

    /*
     * Given the sell volume for three months  stored in double variables, return the total sell volume.
     * Note, the result should be rounded to the nearest integer.
     * If x.y<x.5, return x, otherwise if x.y>=x.5, return x+1.
     * For example, given  1.1, 2.2, 3.3, return 7
     * Given, 1.1, 2.1, 3.1, return 6
     */

    public static int totalSellVol(double volOfMonth1, double volOfMonth2, double volOfMonth3) {
        double temp = volOfMonth1 + volOfMonth2 + volOfMonth3;
        double totalSell = Math.abs(temp);
        int i = (int) totalSell;
        double result = totalSell - (double) i;
        if (result < 0.5) {
            return temp < 0 ? -i : i;
        } else {
            return temp < 0 ? -(i + 1) : i + 1;
        }
    }

    /*
     * Given a char variable representing the name of a kind of fruit, check if it is valid.
     * The char must be English capital or lower letter or  one of the special symbols  '*', '!'.
     * return true if valid and false otherwise.
     */
    public static boolean checkNameValid(char name) {
        if ((name >= 'A' && name <= 'Z') || (name >= 'a' && name <= 'z') || name == '*' || name == '!') {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Return true for warning if the total stock value is less than the given threshold.
     * The stock value is equal to   averagePrice multiplied by totalVolume.
     * Note, all variables are integer.
     */

    public static boolean checkStockValue(int avePrice, int totalVol, int threshold) {
        int total_stock_value = avePrice * totalVol;
        if (total_stock_value < threshold) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Given the price of three kinds of fruit, return the one with median price.
     * If the first one is the fruit with median price, return 1, and the second (or third) one return 2 (or 3).
     * If there are more than two kinds of fruit with the same price, return 0
     * For example,  given  11, 22, 33, return 2.
     * Given 123, 456,  456 return 0
     */

    public static int medianPriceFruit(int price1, int price2, int price3) {
        if (price1 == price2 || price1 == price3 || price2 == price3) {
            return 0;
        } else {
            if ((price1 > price2 && price1 < price3) || (price1 > price3 && price1 < price2)) {
                return 1;
            } else if ((price2 > price1 && price2 < price3) || (price2 > price3 && price2 < price1)) {
                return 2;
            } else
                return 3;
        }
    }

    /*
     * Given the names of sold three items, return the number of fruit kinds.
     * Each item is represented by a character. If the two characters are equal, they belong to the same kind of fruit.
     * For example, given  'a', 'b', 'c', return 3.
     * Given 'a', 'a', 'a', return 1.
     */
    public static int numOfSoldKind(char item1, char item2, char item3) {
        if (item1 != item2 && item1 != item3 && item2 != item3) {
            return 3;
        } else if (item1 == item2 && item1 == item3) {
            return 1;
        } else
            return 2;
    }

    /*
     * Given the number of days the fruit has been purchased, return warning flag indicated by char.
     * return 'g' if the number of days is larger than 0 no more than 3.
     * return 'o' if the number of days is larger than 3 but no more than 5
     * return 'b', if the number of days is larger than 5
     * return 'n', the number of purchased days is less than 0
     */
    public static char warnExpireDate(int remainDays) {
        if (remainDays >= 0 && remainDays <= 3) {
            return 'g';
        } else if (remainDays > 3 && remainDays <= 5) {
            return 'o';
        } else if (remainDays > 5) {
            return 'b';
        } else
            return 'n';
    }

    /*
     * Given the purchase dates of three kinds of fruit, return whether they are purchased at the same day.
     * the purchased date is represented by integer with 8 digits . The format is yyyymmdd.
     * For example, 3rd, March, 2019 is denoted by 20190303
     * return true, if they are purchased at the same day, otherwise return false.
     */
    public static boolean isPurchasedSameDay(int day1, int day2, int day3) {
        return day1 == day2 && day1 == day3 && day2 == day3;
    }

    /*
     * For two kinds of fruit, return the one with larger profit.
     * Profit =  (price-cost)*vol
     * return 1 if the first one is larger and -1 if the second one is larger,
     * return 0 if the profit is equal for them.
     */

    public static int itemWithLargerProfit(int vol1, int price1, int cost1, int vol2, int price2, int cost2) {
        //To be completed
        int profit_1 = (price1 - cost1) * vol1;
        int profit_2 = (price2 - cost2) * vol2;
        if (profit_1 > profit_2) {
            return 1;
        } else if (profit_1 < profit_2) {
            return -1;
        } else
            return 0;
    }

}
