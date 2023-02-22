import java.util.Arrays;


public class MaxCounters {

    public int[] finalCounter(int N, int[] givenArrs) {
        int[] counterArr = increaseOrMaxCounter(givenArrs, N);

        return counterArr;

    }

    public int[] increaseOrMaxCounter(int[] givenArrs, int N) {
        int[] counterArr = new int[N];

        for (int i = 0; i < givenArrs.length; i++) {
            int index = givenArrs[i];
            index -= 1;
            if (givenArrs[i] <= N) {
                counterArr = increase(index, counterArr);
            }
            if (givenArrs[i] > N) {
                counterArr = maxCounter(counterArr);
            }

        }
        return counterArr;
    }

    public int[] increase(int index, int[] counterArr) {

        counterArr[index] += 1;

        return counterArr;

    }

    public int[] maxCounter(int[] counterArr) {
        int biggestNumber = Arrays.stream(counterArr).reduce((x, y) -> x > y ? x : y).getAsInt();
        for (int i = 0; i < counterArr.length; i++) {
            counterArr[i] = biggestNumber;
        }
        return counterArr;
    }
}
