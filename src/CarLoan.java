public class CarLoan {
	public static void main(String[] args) {
    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment = 2000;

    //check if the loan length is less than or equal to 0
    if(loanLength <= 0 || interestRate <= 0 ){
        System.out.println(" Error! You must take out a valid car loan.");
        }else if(downPayment >= carLoan){
        System.out.println("The car can be paid in full.");
         }else{
        int remainingBalance = carLoan - downPayment; // Step 10
            int months = loanLength * 12;                // Step 11
            int monthlyBalance = remainingBalance / months; // Step 12
            int interest = (monthlyBalance * interestRate) / 100; // Step 13
            int monthlyPayment = monthlyBalance + interest; // Step 14

            System.out.println("Your monthly payment is: " + monthlyPayment);
        }

	}
}