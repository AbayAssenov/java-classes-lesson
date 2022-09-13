import java.util.Optional;

public class Starter {

//1 вытаскивать
//2 сортировать
//3 фильтровать
//4 выделять что одно
//    https://ru.wikipedia.org/wiki/IDE#:~:text=%D0%98%D0%BD%D1%82%D0%B5%D0%B3%D1%80%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D0%B0%D1%8F%20%D1%81%D1%80%D0%B5%D0%B4%D0%B0%20%D1%80%D0%B0%D0%B7%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D0%BA%D0%B8%20(%D0%B0%D0%BD%D0%B3%D0%BB.,%D0%B8%20%D0%BE%D0%BF%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B8%D1%85%20%D0%BF%D1%80%D0%B8%D0%B2%D0%BE%D0%B4%D0%BE%D0%B2)%20%D0%BA%20%D0%BA%D0%BE%D0%BC%D0%BF%D1%8C%D1%8E%D1%82%D0%B5%D1%80%D1%83.

//    ExtractorData
//    SorterNumber
//    FilterNumber
//    ReducerData
    public static void main(String[] array) {

        MyClassEncapsulated jonh = new MyClassEncapsulated();
        jonh.setAge(100);
        jonh.setName("Jonh");

        System.out.println(jonh.getAge() + "  " + jonh.getName());



//        ExtractorData dataNumbers = new ExtractorData();
//        int[] arrayNumbers = dataNumbers.extractData();
//
//        SorterNumber sorterInt = new SorterNumber();
//        sorterInt.sortNumbers(arrayNumbers);
//
//        FilterNumber filter = new FilterNumber();
//        int[] filteredElements = filter.filterByTwo(arrayNumbers);
//
//        ReducerData reducerMax = new ReducerData();
//        int maxNumber = reducerMax.getMaxNumber(filteredElements);
//
//        System.out.println("MAX NUMBER " + maxNumber);

    }
}
