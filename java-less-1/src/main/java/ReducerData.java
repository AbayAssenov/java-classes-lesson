public class ReducerData {


    public int getMaxNumber(int[] filteredElements) {
        //4 выделять что то одно
        // самое большое число
        // 1 2 3 4 2 3
        int maxNumber = filteredElements[0];
        for (int i = 0; i < filteredElements.length; i++) {
            if (maxNumber < filteredElements[i]) { // TRUE
                maxNumber = filteredElements[i];
            }
        }
        return maxNumber;
    }
}
