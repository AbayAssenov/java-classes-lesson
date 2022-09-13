public class FilterNumber {


    public int[] filterByTwo(int[] arrayNumbers) {
        // 3 фильтровать
        // https://javarush.ru/groups/posts/operator-deleniya-po-modulyu
        // достаю максимальное количество элементов после фильтрации
        // числа которые делятся на 2 без остатка

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

        return filteredElements;
    }
}
