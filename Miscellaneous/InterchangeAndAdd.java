package Miscellaneous;

/* This program accepts two nxn matrix and interchanges the first row of the first matrix with the last row of second matrix
 * and first row of second matrix with the last row of the first matrix.
 */

import java.io.*;

public class InterchangeAndAdd {
    int arr[][];// instance variables
    int n, m;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public InterchangeAndAdd(int mm, int nn)// parametrized constructor to initialize instance variables
    {
        n = nn;
        m = mm;
        arr = new int[m][n];
    }// end of INTERCHANGE_ADD()

    public void accept() throws IOException {
        System.out.println("Input the Array ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter Element : ");
                arr[i][j] = Integer.parseInt(br.readLine());// reading elements
            } // end of for loop
        } // end of accept()
    }

    public InterchangeAndAdd mix(InterchangeAndAdd J) {

        int A[] = new int[n];
        int B[] = new int[n];
        int C[] = new int[n];
        int D[] = new int[n];

        // I have treated the J object's matrix as the first matrix and the currently
        // referenced object's matrix as the second one

        InterchangeAndAdd Q = new InterchangeAndAdd(m, n);

        int i, j, a = 0, b = 0, c = 0, d = 0;
        // first storing the elements to be modified in different arrays
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {

                if (i == 0)// if the first row
                {
                    A[a++] = J.arr[i][j];// storing the first array's first row elements

                    /*
                     * 'this' keyword refers to the current object, i.e. the object which calls mix
                     * function
                     **/
                    B[b++] = this.arr[i][j];// storing the second array's first row elements
                } // end of if

                else if (i == (m - 1))// if the last row
                {
                    C[c++] = J.arr[i][j];// storing the first array's last row elements
                    D[d++] = this.arr[i][j];// storing the second array's last row elements
                } // end of else

            } // end of inner for loop
        } // end of outer for loop

        a = 0;
        b = 0;
        c = 0;
        d = 0;

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {

                if (i == 0)// if the first row
                {
                    J.arr[i][j] = D[d++];// storing the second matrix's last row elements in the first row of first
                                         // matrix
                    this.arr[i][j] = C[c++];// storing the first matrix's last row elements in the first row of second
                                            // matrix
                } // end of if

                else if (i == (m - 1))// if the last row
                {
                    J.arr[i][j] = B[b++];// storing the second matrix's first row elements in the last row of first
                                         // matrix
                    this.arr[i][j] = A[a++];// storing the first matrix's first row elements in the last row of second
                                            // matrix
                } // end of else

            } // end of inner for loop
        } // end of outer for loop

        // finding the summation of the two modified arrays
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++)
                Q.arr[i][j] = (J.arr[i][j] + this.arr[i][j]);
        } // end of outer for loop

        return (Q);// Returning the sorted Array object
    }// end of mix

    public void display() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
    }// end of display()

    public static void main(String[] args) throws IOException {
        System.out.println("ENTER ROW OF THE ARRAYS ");
        int p = Integer.parseInt(br.readLine());
        System.out.println("ENTER COLOUMN OF THE ARRAYS ");
        int q = Integer.parseInt(br.readLine());
        InterchangeAndAdd obj1 = new InterchangeAndAdd(p, q);
        obj1.accept();// accepting elements of first array

        InterchangeAndAdd obj2 = new InterchangeAndAdd(p, q);
        obj2.accept();// accepting elements of second array

        System.out.println("\nDISPLAYING THE ARRAYS BEFORE OPERATION\n");
        System.out.println("The 1st Array is : ");
        obj1.display();// to display first array

        System.out.println("The 2nd Array is : ");
        obj2.display();// To display second array

        InterchangeAndAdd obj3 = obj2.mix(obj1); /*
                                                  * obj2 is the current object which is referred by 'this' keyword above
                                                  **/

        System.out.println("\nDISPLAYING THE ARRAYS AFTER OPERATION\n");
        System.out.println("The 1st Array is : ");
        obj1.display();// to display first array

        System.out.println("The 2nd Array is : ");
        obj2.display();// To display second array

        System.out.println("DISPLAYING THE FINAL ARRAY\n ");
        obj3.display();// To display merged array

        /*
         * 
         * ENTER ROW OF THE ARRAYS 3 ENTER COLOUMN OF THE ARRAYS 3 Input the Array Enter
         * Element : 1 Enter Element : 2 Enter Element : 3 Enter Element : 4 Enter
         * Element : 5 Enter Element : 6 Enter Element : 7 Enter Element : 8 Enter
         * Element : 9 Input the Array Enter Element : 10 Enter Element : 11 Enter
         * Element : 12 Enter Element : 13 Enter Element : 14 Enter Element : 15 Enter
         * Element : 16 Enter Element : 17 Enter Element : 18
         * 
         * DISPLAYING THE ARRAYS BEFORE OPERATION
         * 
         * The 1st Array is : 1 2 3 4 5 6 7 8 9 The 2nd Array is : 10 11 12 13 14 15 16
         * 17 18
         * 
         * DISPLAYING THE ARRAYS AFTER OPERATION
         * 
         * The 1st Array is : 16 17 18 4 5 6 10 11 12 The 2nd Array is : 7 8 9 13 14 15
         * 1 2 3 DISPLAYING THE FINAL ARRAY
         * 
         * 23 25 27 17 19 21 11 13 15
         * 
         **/

    }// end of main function
}// end of class