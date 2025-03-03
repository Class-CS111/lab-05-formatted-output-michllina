// NAME: Michelle Mendoza / DATE: 2/27/25

// COLLABORATORS: <tutors, instructor, or anyone else who helped you>

// DESCRIPTION: <a sentence about what the purpose of this program is>

public class Main
{
	public static void main(String[] args)
	{
    //DECLARATION + INITIALIZATION SECTION
// find dollarAmount
double initialAmount = 1.68;
int centsRemaining = 0;
int numQuarters = 0;
int numDimes = 0;
int numNickles = 0;
int numPennies = 0; // we can delete this variable

    //CALCULATION SECTION

// centAmount = dollarAmount x 100
// calculate number of quarters = cent amount / 25
// cents remaining = centAmount % 25

centsRemaining =(int) (100 * initialAmount);
numQuarters = centsRemaining/25;
centsRemaining = centsRemaining % 25; //gets remaining cents after echanging for quarters
numDimes = centsRemaining/10;
centsRemaining = centsRemaining % 10;
numNickles = centsRemaining / 5;
centsRemaining %= 5;
numPennies = centsRemaining;


    //OUTPUT SECTION

// <dollarAmount> is <numberofQuarters> quarters with <cents Remaining> left over.

 System.out.printf("$%.2f can be converted to %d quarters, %d dimes, %d nickles, and %d pennies.", 
 initialAmount, numQuarters, numDimes, numNickles, centsRemaining);
  }

}
