import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PermCheck {

    public int IsAPermutation(int[] givenArrs) {

        List<Integer> sortdList = sortGivenArrayToList(givenArrs);
        int[] rangedArr = createRangeSmallToBig(smallestNumber(givenArrs), biggestNumber(givenArrs));

        return comparesListandArray(sortdList, rangedArr);
    }

    public int comparesListandArray(List<Integer> sortedList, int[] rangedArr) {
        int isPermutation = 0;

        if (sortedList.get(0) != 1) {

            return isPermutation;
        }
        if (sortedList.size() == 1) {
            if (sortedList.get(0) == 1) {
                isPermutation = 1;
                return isPermutation;
            }
            return isPermutation;
        }

        for (int i = 0; i < rangedArr.length; i++) {
            int rangeNum = rangedArr[i];
            if (sortedList.stream().allMatch(x -> x == rangeNum) == true)
                return isPermutation;
            if (sortedList.get(i) == rangedArr[i]) {

                isPermutation = 1;
            } else {
                isPermutation = 0;
                return isPermutation;
            }
        }

        return isPermutation;
    }

    public List<Integer> sortGivenArrayToList(int[] givenArrs) {
        List<Integer> sortedList = new ArrayList<>();
        sortedList = Arrays.stream(givenArrs).sorted().boxed().collect(Collectors.toList());

        return sortedList;
    }

    public int smallestNumber(int[] array) {
        return Arrays.stream(array).reduce((x, y) -> x < y ? x : y).getAsInt();
    }

    public int biggestNumber(int[] array) {
        return Arrays.stream(array).reduce((x, y) -> x > y ? x : y).getAsInt();
    }

    public int[] createRangeSmallToBig(int smallestNumber, int biggestNumber) {

        return IntStream.rangeClosed(smallestNumber, biggestNumber).toArray();
    }

}
