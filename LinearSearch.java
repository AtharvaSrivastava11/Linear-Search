public class LinearSearch 
{

    public static int linearSer(int num[], int key)
    {
        for(int i=0; i<=num.length;i++)
        {
             if(num[i]==key)
             {
                return i;
             }
        }
        return -1;
        
    }
    public static void main(String args[])
    {
        int num[] = {2,4,6,8,100,12,14,16,18,20};
        int key = 10;

        int index = linearSer(num,key);
        if(index == -1)
        {
            System.out.println("Key not found.");
        } else {
             System.out.println("Key is at index: " + index);
        }
        
    }
    
}
