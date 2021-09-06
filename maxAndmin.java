class Solution
{
    public static void findminAndmax(int[] Arr)
    {
        
        int max = Arr[0];
        int min = Arr[0];
 
        
        for (int i = 1; i < Arr.length; i++)
        {
           
            if (Arr[i] > max) {
                max = Arr[i];
            }
 
            
            else if (Arr[i] < min) {
                min = Arr[i];
            }
        }
 
        System.out.println("The minimum array element is " + min);
        System.out.println("The maximum array element is " + max);
    }
 
    public static void main(String[] args)
    {
        int[] Arr = { 5, 8, 4, 3, 7, 3 };
 
       
        findMinAndMax(A);
    }
}
