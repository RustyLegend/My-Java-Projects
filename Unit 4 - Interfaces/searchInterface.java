import java.util.Arrays;
interface searchable
{
    int search(int arr[] , int key);
}

class BinarySearch implements searchable
{
    public int search(int arr[] , int key)
    {
       return  Arrays.binarySearch(arr, key);
    }
}

public class searchInterface 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5};
        BinarySearch b = new BinarySearch();
        int index = b.search(arr, 5);
        System.out.println("The key " + 5 + " is at " + index);
    }
}