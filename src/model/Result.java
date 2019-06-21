package model;

import java.util.List;

public class Result implements Comparable<Result>{
    private int totalNumOfCandies;
    private int sum;
    private List<Integer> candieIndexList;

    public int getTotalNumOfCandies() {
        return totalNumOfCandies;
    }

    public List<Integer> getCandieIndexList() {
        return candieIndexList;
    }

    public Result(int totalNumOfCandies, int sum, List<Integer> candieIndexList) {
        this.totalNumOfCandies = totalNumOfCandies;
        this.sum = sum;
        this.candieIndexList = candieIndexList;
    }

    @Override
    public int compareTo(Result o) {
        if (this.totalNumOfCandies == o.totalNumOfCandies) {
            return o.sum - this.sum;
        }
        return 0;
    }
}
