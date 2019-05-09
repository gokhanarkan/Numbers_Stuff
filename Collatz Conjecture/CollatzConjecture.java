import java.util.ArrayList;
/*
Let's start with any positive integer and reach 1 at the end. This is the definition of our problem.
I've used ArrayList for the Java representation of the problem since the elements themselves in this regard
are static values and array's length needs to be defined before initialization.
I left 10000 but feel free the increase the number on 12nd line.
*/
public class CollatzConjecture {
    static ArrayList<Integer> numbersTree = new ArrayList<Integer>();
    public static void main(String[] args){
        int n = 2;	// initial number
        while(n <= 10000){	// feel free to increase here. put initial number to check out the tree.
            int m = n;	// storing the value to increment at the end of the loop
            do {
                if (numbersTree.contains(n))	// if we already have the number in our dictionary then there is no point of going again
                    break;
                numbersTree.add(n);
                // Main calculation here.
                if(n % 2 == 0)
                    n /= 2;
                else
                    n = (3*n) + 1;
            } while(n != 1);	// Stopping point
            m++;
            n = m;
        }
        System.out.println(numbersTree);
    }
}