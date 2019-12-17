import java.util.Arrays;

public class quickSort {
        public static void main(String[] args)
        {
            int[] Array = {2,5,7,8,2,1,5,7,1};
            quick(Array,0,Array.length-1);
            System.out.println(Arrays.toString(Array));
        }

        public static void quick(int[] array,int beginIndex,int endIndex)
        {
            //如何进行递归循环?
            //循环的终止条件
            if(beginIndex>=endIndex)
            {
                return ;
            }
            //选取第一个值作为pivot;
            int pivot = array[beginIndex];
            //计算pivot的位置
            int index = partition(array,beginIndex,endIndex,pivot);

            quick(array,beginIndex,index-1);
            quick(array,index,endIndex);

        }

        public static int partition(int[] array,int i,int j,int pivot)
        {

                while (i<j)
                {
                    while(array[i]<pivot)
                    {
                        i++;
                    }

                    while(array[j]>pivot)
                    {
                        j--;
                    }

                    int temp = 0;

                    if(i<=j)
                    {
                        temp = array[i];
                        array[i]=array[j];
                        array[j]=temp;
                        i++;
                        j--;
                    }
                }



                return i;

        }


}
