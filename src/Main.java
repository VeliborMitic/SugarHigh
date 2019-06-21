import model.Result;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static final String CONSTRAINTS = "Constraints violation";

    public static void main(String[] args) {

        int[] candiesArray1 = new int[]{33, 20, 12, 19, 29};
        int[] candiesArray2 = new int[]{62, 67, 100};
        int[] candiesArray3 = new int[]{16, 39, 67, 16, 38, 71};
        int[] candiesArray4 = new int[]{16, 3, 14, 17, 11};

        System.out.println(findClosestSum(candiesArray1, 33));
        System.out.println(findClosestSum(candiesArray2, 8));
        System.out.println(findClosestSum(candiesArray3, 17));
        System.out.println(findClosestSum(candiesArray4, 99));
    }

    private static List<Integer> findClosestSum(int[] candiesArray, int threshold) {

        // Constraints validation
        if (candiesArray == null || candiesArray.length > 105 || threshold < 1 || threshold > 109) {
            throw new IllegalArgumentException(CONSTRAINTS);
        }

        // Conversion from array to List
        List<Integer> candieList = Arrays.stream(candiesArray).boxed().collect(Collectors.toList());
        List<Result> resultList = new ArrayList<>();
        List<Integer> elements = new ArrayList<>();

        // filter all possible candies to matrix
        int bound = candieList.size();
        int sum = 0;
        int[][] resultMatrix = new int[bound][bound];
        for (int i = 0; i < bound; i++) {
            for (int j = i; j < bound; j++) {
                sum += candieList.get(j);
                if (sum < threshold) {
                    resultMatrix[i][j] = candieList.get(j);
                }
            }
            sum = 0;
        }

        // possible results from result matrix to model.Result objects
        for (int[] matrix : resultMatrix) {
            for (int i = 0; i < resultMatrix.length; i++) {
                int element = matrix[i];
                if (element != 0) {
                    sum += element;
                    elements.add(candieList.indexOf(element));
                }
            }
            resultList.add(new Result(sum, new ArrayList<>(elements)));
            sum = 0;
            elements.clear();
        }

        // sorting model.Result objects with chained comparator
        resultList.sort(Comparator.comparing(Result::getTotalNumOfCandies)
                .thenComparing(Result::compareTo).reversed());

        // return indexes of candies from original list
        return resultList.get(0).getCandieIndexList();
    }
}