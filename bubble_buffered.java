import java.io.*;
class bubble_buffered
{
   public static void main(String[] args) throws IOException
    {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int i,j,t,a[];
    a=new int[10];
    System.out.println("Enter the numbers ");
    for(i=0;i<10;i++)
    a[i]=Integer.parseInt(br.readLine());
    
    for(i=0;i<10;i++)
    {
        for(j=0;j<9;j++)
        {
        if(a[j]<a[j+1])
        {
            t=a[j];
            a[j]=a[j+1];
            a[j+1]=t;
        }
    }
}

    for(i=0;i<10;i++)
    System.out.println(a[i]);
}
}