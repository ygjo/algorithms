package programmers;

import java.util.*;

/**
 * date : 2021.08.13
 * url : https://programmers.co.kr/learn/courses/30/lessons/49993?language=java
 */
public class P49993 {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

        solution(skill,skill_trees);

    }

    public static int solution(String skill, String[] skill_trees) {
        int answer = -1;
        String[] singleSkill = skill.split("");
        int skillTreeCnt = skill_trees.length;
        List<HashMap<Integer,String >> skillIndex = new ArrayList<>();

        for (int x = 0; x < singleSkill.length; x++){
            for (int index = 0; index < skillTreeCnt; index++){
                String[] skillInTree= skill_trees[index].split("");
                HashMap<Integer,String> item = new HashMap<>();
                for (int j =0; j<skillInTree.length; j++){
                    if(skillInTree[j].equals(singleSkill[x])){
                        item.put(j,skillInTree[j]);
                    }
                }
                System.out.println(item);
            }
        }




        return answer;
    }
}
