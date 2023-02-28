

public class MaxProductOfThree {

    public int maxProductOfThree(int[] givenArr) {
        int maxProduct = givenArr[0] * givenArr[1] * givenArr[2];
        int product = 0;
        for (int firstNum = 0; firstNum < givenArr.length; firstNum++) {
            product = getMaxProductOfThreePerFirstNum(firstNum, givenArr);
            if (product > maxProduct)
                maxProduct = product;
            if (givenArr.length - firstNum == 3)
                break;
        }

        return maxProduct;
    }

    private int getMaxProductOfThreePerFirstNum(int firstNum, int[] giveArr) {
        int highestProduct = giveArr[firstNum] * giveArr[firstNum + 1] * giveArr[firstNum + 2];
        int product = 0;
        for (int scndNum = firstNum + 1; scndNum < giveArr.length; scndNum++) {

            for (int thrdNum = scndNum + 1; thrdNum < giveArr.length; thrdNum++) {
                product = giveArr[firstNum] * giveArr[scndNum] * giveArr[thrdNum];
                if (product > highestProduct)
                    highestProduct = product;
            }
            if (giveArr.length - scndNum == 2)
                break;
        }
        return highestProduct;
    }
}
