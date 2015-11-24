/*
 * 
 */

/**
 *
 * @author alisiamartinez
 */

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

/*

//*********Class Conversion - helper class for hash function*************\\

    stringToBitseq(s:string):array of {0,1}
        returns an array of 0s and 1s constructed by representing each character in s by its
        assigned bit patter (position in the list below represented as a numeral to base 2)

        Use the following ordering of digits and letters - 10 per

        0000000000 1111111111 2222222222 3333333333 4444444444 555555555566
        0123456789 0123456789 0123456789 0123456789 0123456789 012345678901
        
        0123456789 abcdefghij klmnopqrst uvwxyzABCD EFGHIJKLMN OPQRSTUVWXYZ

        Sample translations:
        0 --> 000000 (position 00)
        1 --> 000001 (position 01)
        9 --> 001001 (position 09)
        a --> 001010 (position 10)
        k --> 010100 (position 20)
        u --> 011110 (position 30)
        E --> 101000 (position 40)
        O --> 011110 (position 50)
        Y --> 111100 (position 60)

    EX: the string 'molly1' translates to the bit sequence
    22      24      47      47      60      01            // position as base 10 numeral
    010110  011000  101111  101111  111100  000001        <--  LSD on right

    



//*********Class TestDrivers*************\\
    - This class will contain helper methods for generating test data sets and
    running UIMS on the test data sets. You want to be able to (randomly) generate
    lists of user ids, for instance. More on this soon.

The specification above contains only the core methods and attributes. Introduce
additional setter and getter methods as needed


//*********PROJECT PLAN*************\\

1.
Build the top level of the system first:
    Focus on the UIMS class
    - Use a simple hashing function for a fixed size table
        -e.g. for a given user id, 
            convert the characters to numbers
            take the sum mod m (m the table size
            OR
            use a hash function provided by Java or C++
            You may use a language library module for the singly linked list
    - Ignore customer ids for now
Build TestDrivers class. Make sure system works end to end


2.
Implement your own singly linked list class (if not in 1.)


3.
For a fixed table size, implement a multiplcative hashing function
    - (Using the Conversion class)

MORE DETAILS TO COME


4.
Implement a dynamically growing table userT and associated hash function
Include customer ids

5.
Submit

*/