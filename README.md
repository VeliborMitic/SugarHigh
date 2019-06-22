Sugar High Problem

You have just finished Trick-or-Treating, and you cannot wait to enjoy all of the candy that you have gotten.
However, there's one problem - you can get sugar high from eating too much candy!
You would like to enjoy as many pieces of candy as possible at once before you get sugar high.

You are given an array of integers, candieIndexList, where each element represents the grams of sugar that each candy has.
You are also given a threshold which is how many grams of sugar that you can consume at once before you get sugar high.

You task is to output an array of indices of the candieIndexList that you can enjoy at once before
crossing your sugar high threshold.

Note:
Your main priority is to eat the maximum number of candieIndexList possible, but if there are multiple ways of doing this,
choose the one with the fewest grams of sugar total. If there's still a tie, choose the lower indices.

Example
For candieIndexList = [33, 20, 12, 19, 29] and threshold = 33, the output should be sugarHigh(candieIndexList, threshold) = [2, 3].
Although [1, 2] is also valid, the candieIndexList at indices 2 and 3 have a lesser sum (12 + 19 = 31) than the candieIndexList
at indices 1 and 2 (20 + 12 = 32).

For candieIndexList = [62, 67, 100] and threshold = 8, the output should be sugarHigh(candieIndexList, threshold) = [].
All of the candieIndexList have more sugar than you can handle, so you cannot have any candy.

For candieIndexList = [16, 39, 67, 16, 38, 71] and threshold = 17, the output should be sugarHigh(candieIndexList, threshold) = [0].
Although index 3 is also valid, the first candy in the list appeared earlier.

For candieIndexList = [16, 3, 14, 17, 11] and threshold = 99,
the output should be sugarHigh(candieIndexList, threshold) = [0, 1, 2, 3, 4].
The candieIndexList that you collected have a total of 16 + 3 + 14 + 17 + 11 = 72 grams of sugar compared to your threshold
of 99 grams, so you can have all of your candy!


Input/Output

[input] array.integer candieIndexList
An array of integers representing the sugar content of each candy, in grams.

Guaranteed constraints:
0 ≤ candieIndexList.length ≤ 105
0 ≤ candieIndexList[i] ≤ 100

[input] integer threshold
An integer representing the maximum amount of sugar you can consume, in grams.

Guaranteed constraints:
1 ≤ threshold ≤ 109

[output] array.integer
A sorted array of indices of the candieIndexList you can eat.
