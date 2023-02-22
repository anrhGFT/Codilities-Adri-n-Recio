import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingInteger {

    public int smallestPositiveNum(int[] givenArr) {
        if (checkIfAllNegativeNums(givenArr) == true)
            return 1;
        if (givenArr.length == 1 && givenArr[0] != 1)
            return 1;
        int[] rangedArr = createRangeOneToBig(biggestNumber(givenArr));
        return findSmallestPositiveNum(givenArr, rangedArr);

    }

    public Boolean checkIfAllNegativeNums(int[] givenArrs) {

        return Arrays.stream(givenArrs).allMatch(x -> x < 0);
    }

    public int findSmallestPositiveNum(int[] givenArr, int[] rangedArr) {
        int nextLastNum = rangedArr[rangedArr.length - 1] + 1;
        int smallestNum = nextLastNum;
        for (int i = 0; i < rangedArr.length; i++) {
            if (matches(rangedArr[i], givenArr) == false) {
                smallestNum = rangedArr[i];
                return smallestNum;
            }
        }
        return smallestNum;
    }

    public Boolean matches(int num, int[] missNumArray) {
        return Arrays.stream(missNumArray).anyMatch(x -> x == num);
    }

    public int biggestNumber(int[] array) {
        return Arrays.stream(array).reduce((x, y) -> x > y ? x : y).getAsInt();
    }

    public int[] createRangeOneToBig(int biggestNumber) {

        return IntStream.rangeClosed(1, biggestNumber).toArray();
    }

}
