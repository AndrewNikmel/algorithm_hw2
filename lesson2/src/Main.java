public class Main {
    // Реализовать алгоритм пирамидальной сортировки (сортировка кучей).
    public static void main(String[] args) {
         int array[] = {9, 99, 167, 0, 7, 26};
         int n = array.length;

         Pyramide ob = new Pyramide();
         ob.sort(array);

         System.out.println("Sorted array is");
         printArray(array);
         }

        static void printArray(int array[])
        {
            int n = array.length;
            for (int i=0; i<n; ++i)
                System.out.print(array[i]+" ");
            System.out.println();
    }

}