
/**
 * Write a description of class medium here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class medium
{
    /*
     * total value to be returned at end of program
     * current multiple of 3
     * current multiple of 5
     * factor (same for both)
     */
    public static void mult()
    {
        int total = 0;
        int mult3 = 3;
        int mult5 = 5;
        int factor= 2;
        do
        {
            total += factor*mult3 + factor*mult5;
            factor++;
        } while(mult3 < 100 || mult5 < 100);
        
        System.out.println("The sum of the multiples of 3 and 5 is " + total);
    }
}
