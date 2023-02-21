import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FrogRiverOne {

    public int secondsToCrossRiver(int x, int leavesSeconds[]) {
        int secondsToCross = 0;
        if (leavesSeconds.length == 1 && x == leavesSeconds[0]) {

            return secondsToCross;
        }
        if (allNumsFrom1toXExist(x, leavesSeconds) == true) {
            List<Integer> oneTimePositionList = oneTimePositionList(leavesSeconds);
            secondsToCross = getSecondsToCross(getLastLeavePosition(oneTimePositionList), leavesSeconds);
            return secondsToCross;
        } else {
            secondsToCross = -1;
        }

        return secondsToCross;

    }

    public List<Integer> oneTimePositionList(int leavesSeconds[]) {
        List<Integer> oneRepeatArray = new ArrayList<Integer>();

        for (int i : leavesSeconds) {
            if (oneRepeatArray.stream().anyMatch(x -> x == i) == false) {
                oneRepeatArray.add(i);
            }
        }

        return oneRepeatArray;
    }

    public int getLastLeavePosition(List<Integer> orderedPositionList) {
        return orderedPositionList.get(orderedPositionList.size() - 1);
    }

    public int getSecondsToCross(int lastLeavePosition, int[] leavesSeconds) {
        int secondsToCross = 0;
        for (int i = 0; i < leavesSeconds.length; i++) {
            if (leavesSeconds[i] == lastLeavePosition) {
                secondsToCross = i;
            }
        }
        return secondsToCross;
    }

    public Boolean allNumsFrom1toXExist(int x, int leavesSeconds[]) {
        int[] range1toX = createRange1toX(x);
        for (int leavePos : range1toX) {
            if (Arrays.stream(leavesSeconds).anyMatch(s -> s == leavePos) == false) {
                return false;
            }
        }

        return true;
    }

    public int[] createRange1toX(int x) {
        return IntStream.rangeClosed(1, x).toArray();
    }

}
