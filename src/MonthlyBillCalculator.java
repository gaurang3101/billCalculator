import java.util.Scanner;

public class MonthlyBillCalculator {
    private int minutes;

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void calculatingMonthlyBill(){
        if (minutes>300) {
            double bill = (minutes - 300) * .012;
            double totalBill = bill + (bill*.18);
            System.out.println("Your monthly bill is " + bill + " .\nYour monthly bill after GST is " + totalBill + " .");
        }

        else System.out.println("Your monthly bill is 0 .");
    }

    MonthlyBillCalculator(int minutes) {
        this.minutes = minutes;
    }
}

class AbBillDekhKeRo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter minutes consumed throughout the month - ");
        int min = sc.nextInt();
        MonthlyBillCalculator mbc = new MonthlyBillCalculator(min);
        mbc.calculatingMonthlyBill();
    }

}
