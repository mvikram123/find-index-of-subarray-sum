
// find index of subarray which sum is equal to the given sum

class subArraySum{
    public  static void subArrayIndex(int arr[],  int n,int target){
        int sum=0;
        for(int i=0; i<n; i++)
        {
            sum=arr[i];
            if(sum==target)
            {
                System.out.println(i);
                return;

            }
            else
            {
                for(int j=i+1; j<n; j++)
                {
                    sum+=arr[j];
                    if(sum==target)
                    {
                        System.out.println(i+" "+j);
                        return ;
                    }
                }
            }


        }
        System.out.println("index is not found");
    }
}

public class Main
{
    public static void main(String[] args) {
        //	System.out.println("Hello World");
        int arr[]={15, 2, 4, 8, 9, 5, 10, 23};
        int n=arr.length;
        int k=23;
        subArraySum.subArrayIndex(arr,n,k);
    }
}
