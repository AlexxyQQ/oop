package multiple_inheritance;

public class Test_search {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int searchvalue = 9;
        Searching linearsearch = new LineraSearch();
        if (linearsearch.search(arr, searchvalue))
            System.out.println("Found");
        else
            System.out.println("Not Found");

        Searching binarysearch = new BinarySearch();
        if (binarysearch.search(arr, searchvalue))
            System.out.println("Found");
        else
            System.out.println("Not Found");

    }
}
