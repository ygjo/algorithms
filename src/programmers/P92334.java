package programmers;

import java.lang.reflect.Array;
import java.util.*;

public class P92334 {
    public static void main(String[] args) {
        String[] id_list1 = {"muzi", "frodo", "apeach", "neo"};
        String[] report1 = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k1 = 2;

        String[] id_list2 = {"con", "ryan"};
        String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k2 = 3;

        String[] id_list3 = {"con", "ryan"};
        String[] report3 = {"ryan con"};
        int k3 = 1;

        solution(id_list3,report3,k3);

    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int idCount = id_list.length;
        int[] answer = new int[idCount];
        Map<String,Integer> ids = new HashMap<>();
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));

        List<String> reporters = new ArrayList<>();
        List<String> reported = new ArrayList<>();
        Map<String,Integer> reportedCount = new HashMap<>();
        List<String > receiveEmailUser = new ArrayList<>();

        for (int i = 0; i <idCount; i++){
            ids.put(id_list[i],i);
        }

        reportSet.forEach(str->{
            String[] strArr = str.split(" ");
            reporters.add(strArr[0]);
            reported.add(strArr[1]);
        });

        for (String r : reported){
            reportedCount.put(r, reportedCount.getOrDefault(r,0)+1);
        }

        reportedCount.keySet().forEach(key ->{
            if (reportedCount.get(key) >= k){
                for (int index = 0; index < reported.size(); index++){
                    if (reported.get(index).equals(key)){
                        receiveEmailUser.add(reporters.get(index));

                    }

                }
            }
        });

        for (int i =0; i< receiveEmailUser.size(); i++){
            int index = ids.get(receiveEmailUser.get(i));
            answer[index]++;
        }


        return answer;
    }
}
