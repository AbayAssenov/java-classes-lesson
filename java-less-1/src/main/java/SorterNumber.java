public class SorterNumber {


     public void sortNumbers(int[] arrayNum) {

         int endIndex = arrayNum.length - 1 ;
         //2 сортировать
         // 4 3 2 1
         for (int i = 0; i < arrayNum.length / 2; i++) {

             int temp = arrayNum[i];
             arrayNum[i] = arrayNum[endIndex];
             arrayNum[endIndex] = temp;
             endIndex = endIndex - 1;
         }
     }
}
