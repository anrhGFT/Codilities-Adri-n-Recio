


public class Triangle {

    public int isThereATriangle(int[] arr) {
        
        for (int indxNum1 = 0; indxNum1 < arr.length; indxNum1++) {
            for (int indxNum2 = indxNum1 + 1; indxNum2 < arr.length; indxNum2++) {
                for (int indxNum3 = indxNum2 + 1; indxNum3 < arr.length; indxNum3++) {
                    if (isATriangle(arr[indxNum1], arr[indxNum2], arr[indxNum3]) == true)
                        return 1;

                }
            }
        }

        return 0;
    }

    public Boolean isATriangle(int num1, int num2, int num3) {
            Long n1=Long.valueOf(num1);
            Long n2=Long.valueOf(num2);
            Long n3=Long.valueOf(num3);
        if (n1 + n2 > n3 && n1 + n3 > n2 && n3 + n2 > n1) {
            return true;
        }
        return false;
    }

}
