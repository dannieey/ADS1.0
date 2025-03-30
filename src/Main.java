import java.util.Scanner; //here we import class Scanner from package java.util for use Scsnner to input nums from console

public class Main{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); //creating object sc to input nums from console
        int n = sc.nextInt(); //input n value (arr`s size)
        int[] arr = new int[n];  //creating array with size n (with integers)
        for(int i=0; i<n; i++){ //running from zero element till the end (n-1) (here they are still empty)
            arr[i]=sc.nextInt(); //input these values from console (now each has its own value)
        }
        System.out.print(findMin(arr)); //print the result of findMin function (and we are sending our created array to that function)
        sc.close(); //close the scanner
    }
    public static int findMin(int[] arr){ //function to get a min num from an array
        if(arr==null || arr.length==0){ //test out condition if this array is empty
            throw new IllegalArgumentException("Empty array"); //if yes we throw an exception and output "empty array" statement
        }
        int min=arr[0]; //if no, we create the int variable min and give the value of the first (zero arr[0]) element of the sent array
        for(int i=1; i<arr.length; i++){ //running from the second element(arr[1]) till the end
            if(min>arr[i]){ //compare each element with the min variable (compare if an arr[i] element is less than min)
                min=arr[i]; //if yes, then reset min`s value with arr[i[`s value
            }
        }
        return min; //return our final min
    }
}