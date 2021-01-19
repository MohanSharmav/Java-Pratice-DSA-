class Mergi
{
    public static void main(String args[])
    {
        int[] arr1 ={1,2,6,8};
        int[] arr2={2,7,9};
    //   int  c1= arr1.length+arr2.length;
    //      int[] newarr = new int[c1];  
        int [] newarr= new int[10];
        for(int i=0;i<arr1.length;i++)
        {
            newarr[i]=arr1[i];
            
        }
            for(int j=0;j<arr2.length;j++)
            {
                newarr[arr1.length+j]=arr2[j];
            }
                for(int i=0;i<10;i++)
                {
                    System.out.print(newarr[i]);
                    // if(arr1[i]<arr2[j])
                    // {
                    //     newarr[k]=arr1[i];
                        
                    // }else
                    // {
                    //     newarr[k]=arr2[j];
                    // }
                }

    }
}