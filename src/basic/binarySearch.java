package basic;

//기초 1. 이진 검색
public class binarySearch {
    //탐색할 배열의 크기가 1이상이고 오름차순으로 정렬이 되어 있다
    //탐색할 배열에는 소수만 포함되어 있다
    public static int search(int target, int[] searchArray){
        int min = 0;
        int max = searchArray.length - 1;
        int guess = -1;

        while (min <= max){
            guess = min + (max - min) / 2;
            if (searchArray[guess] == target) {
                return guess;
            } else if (searchArray[guess] < target) {
                min = guess + 1;
            } else {
                max = guess - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int target = 1;
        int[] searchArray = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
                41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        int targetIdx = search(target,searchArray);
        System.out.println(targetIdx);
    }
}
