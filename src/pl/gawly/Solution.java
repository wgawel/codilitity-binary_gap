package pl.gawly;

class Solution {
    public int solution(int N) {
        int currentGapLength = 0;
        int maxGapLength = 0;

        int currN = N;
        while (currN % 2 == 0 && currN > 0) {
            currN /= 2;
        }
        while (currN > 0) {
            if (currN % 2 == 0) {
                currentGapLength++;
            } else {
                if (currentGapLength > maxGapLength) {
                    maxGapLength = currentGapLength;
                }
                currentGapLength = 0;
            }
            currN /= 2;
        }

        return maxGapLength;
    }
//    public int solution1(int N) {
//        char[] nb = Integer.toBinaryString(N).toCharArray();
//
//        int currentGapLength = 0;
//        int maxGapLength = 0;
//        for (int i = 0; i < nb.length; i++) {
//            if (nb[i] == '0') {
//                currentGapLength++;
//            } else {
//                if (currentGapLength > maxGapLength) {
//                    maxGapLength = currentGapLength;
//                }
//                currentGapLength = 0;
//            }
//        }
//
//        return maxGapLength;
//    }
}
