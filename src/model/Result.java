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

    public Result(int sum, List<Integer> candieIndexList) {
        this.sum = sum;
        this.candieIndexList = candieIndexList;
        this.totalNumOfCandies = candieIndexList.size();
    }

    @Override
    public int compareTo(Result o) {
        if (this.totalNumOfCandies == o.totalNumOfCandies) {
            return o.sum - this.sum;
        }
        return 0;
    }
}
