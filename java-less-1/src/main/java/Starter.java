public class Starter {

//1 вытаскивать
//2 сортировать
//3 фильтровать
//4 выделять что одно
//    https://ru.wikipedia.org/wiki/IDE#:~:text=%D0%98%D0%BD%D1%82%D0%B5%D0%B3%D1%80%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D0%B0%D1%8F%20%D1%81%D1%80%D0%B5%D0%B4%D0%B0%20%D1%80%D0%B0%D0%B7%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D0%BA%D0%B8%20(%D0%B0%D0%BD%D0%B3%D0%BB.,%D0%B8%20%D0%BE%D0%BF%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B8%D1%85%20%D0%BF%D1%80%D0%B8%D0%B2%D0%BE%D0%B4%D0%BE%D0%B2)%20%D0%BA%20%D0%BA%D0%BE%D0%BC%D0%BF%D1%8C%D1%8E%D1%82%D0%B5%D1%80%D1%83.

//    ExtractorWeb
//    SorterNumber
//    FilterNumber
//    ReducerData
    public static void main(String[] array) {

        //1 вытаскивать
        int[] arrayNumbers = {1, 2, 3, 4};
        //1 -  4 2 3 1
        //2 -  4 3 2 1


        int endIndex = arrayNumbers.length - 1 ;

        //2 сортировать
        // 4 3 2 1
        for (int i = 0; i < arrayNumbers.length / 2; i++) {

            int temp = arrayNumbers[i];
            arrayNumbers[i] = arrayNumbers[endIndex];
            arrayNumbers[endIndex] = temp;
            endIndex = endIndex - 1;
        }

        // 3 фильтровать
        // https://javarush.ru/groups/posts/operator-deleniya-po-modulyu
        // достаю максимальное количество элементов после фильтрации

        int maximumNumberAcceptedItems = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            //  arrayNumbers[i] / 2 = 0
            if (arrayNumbers[i] % 2 == 0) {
                maximumNumberAcceptedItems = maximumNumberAcceptedItems + 1;
            }
        }

        // Создаю новый массив для отфильтрованных элементов
        int[] filteredElements = new int[maximumNumberAcceptedItems];
        // заполняю массив
        int indexFilteredArray = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            //  arrayNumbers[i] / 2 = 0
            if (arrayNumbers[i] % 2 == 0) {
                filteredElements[indexFilteredArray] = arrayNumbers[i];
                indexFilteredArray = indexFilteredArray + 1;
            }
        }


        //4 выделять что то одно

        int maxNumber = filteredElements[0];
        for (int i = 0; i < filteredElements.length; i++) {
          if (maxNumber < filteredElements[i]) {
              maxNumber = filteredElements[i];
          }
        }


        System.out.println("MAX NUMBER " + maxNumber);

    }
}
