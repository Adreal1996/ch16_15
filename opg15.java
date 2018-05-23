package ch16;

/*
Write a method called notEquals that accepts a second list as a parameter,
returns true if the two lists are not equal, and returns false otherwise.
Two lists are considered unequal if they store the different values in
any random order and do not have the same length.
 */

public class opg15
{
    public static void main(String[] args)
    {
        LinkedIntList listOne = new LinkedIntList();
        listOne.add(1);
        listOne.add(2);
        listOne.add(3);
        listOne.add(4);
        listOne.add(5);

        LinkedIntList listTwo = new LinkedIntList();
        listTwo.add(1);
        listTwo.add(2);
        listTwo.add(3);
        listTwo.add(4);
        listTwo.add(5);

        System.out.println(listOne.notEquals(listTwo));
    }
}
