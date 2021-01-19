class Ben
{
    public static void main(String args[])
    {
        int [] arr={1687,3,4,5,97};
    int    x=Integer.MAX_VALUE;
    System.out.println(x);
    for(int i=0;i<arr.length;i++)
    {
       if( arr[i]>x)
        x=arr[i];
       // System.out.println(x);
    }
    System.out.println(x);
    }
}