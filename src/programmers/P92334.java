package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P92334 {
    public static void main(String[] args) {
        String[] id_list1 = {"muzi", "frodo", "apeach", "neo"};
        String[] report1 = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k1 = 2;

        String[] id_list2 = {"con", "ryan"};
        String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k2 = 3;

        String[] id_list3 = {"con", "ryan"};
        String[] report3 = {"ryan con", "ryan con", "con ryan", "ryan con"};
        int k3 = 2;

        solution(id_list1,report1,k1);

    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int idCount = id_list.length;

        int[] answer = new int[idCount];
        int[] reportedCount = new int[idCount];
        String[] reportArr = Arrays.stream(report).distinct().toArray(String[]::new); // 중복 제거

        for(int i = 0; i <idCount ; i++){
            String id = id_list[i];

            for (String relation : reportArr){
                String[]  relationArr = relation.split(" ");

                if (id.equals(relationArr[1])){
                    reportedCount[i]+=1;
                }
            }
        }



        return answer;
    }
}
