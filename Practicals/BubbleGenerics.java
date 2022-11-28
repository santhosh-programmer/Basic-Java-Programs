import java.util.*;
public class BubbleGenerics {

    static <T extends Comparable<T>>void bubbleSort(T[] l)
    {
        T t;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<(4-i);j++)
            {
                if(l[j].compareTo(l[j+1])>0)
                {
                    t=l[j];
                    l[j]=l[j+1];
                    l[j+1]=t;
                }
            }
        }
    }
    public static void main(String[] args) {
        Integer l1[]=new Integer[]{3,4,1,7,2};
        String l2[]=new String[]{"bacb","af","zaf","cda","fsg"};
        bubbleSort(l1);
        bubbleSort(l2);
        System.out.println(Arrays.toString(l1));
        System.out.println(Arrays.toString(l2));
    }
} 
