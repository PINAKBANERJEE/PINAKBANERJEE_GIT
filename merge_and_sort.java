import java.util.Scanner;
class merge_and_sort
{
   public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int i,j,t,a[],b[],c[],x,y;
    System.out.println("Enter the length of 'a' ");
    x=sc.nextInt();
    System.out.println("Enter the length of 'b' ");
    y=sc.nextInt();
    a=new int[x];
    b=new int[y];
    c=new int[x+y];
    
    System.out.println("Enter the numbers for 'a' ");
    for(i=0;i<x;i++)
    a[i]=sc.nextInt();
    
    System.out.println("Enter the numbers for 'b' ");
    for(i=0;i<y;i++)
    b[i]=sc.nextInt();
    
    for(i=0;i<x;i++)
    {
    c[i]=a[i];
    c[i+x]=b[i];
    }
    for(i=0;i<x+y;i++)
    {
        for(j=0;j<x+y-1;j++)
        {
        if(c[j]>c[j+1])
        {
            t=c[j];
            c[j]=c[j+1];
            c[j+1]=t;
        }
    }
}

     System.out.println("The numbers in 'c' ");    
    for(i=0;i<x+y;i++)
    System.out.print(" "+c[i]);
}
}