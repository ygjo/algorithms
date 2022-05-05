package programmers;

public class P72410 {
    public static void main(String[] args) {
        String id1 = "...!@BaT#*..y.abcdefghijklm";
        String id2 = "z-+.^.";
        String id3 = "=.=";
        String id4 = "123_.def";
        String id5 = "abcdefghijklmn.p";
        String id6 = "bc";

        solution(id6);

    }

    public static String solution(String new_id) {

        String lowerCaseId = new_id.toLowerCase();
        String specialCharPattern = "[~!@#[$][*][+]&%^:?,<>/={}\\[\\]()]"; // 특수문자 패턴
        String dotPattern = "[.]{2,}";//dot 2번 이상 연속 패턴
        String firstLastDotPattern = "^[.]|[.]$";//앞 뒤 . 패턴

        lowerCaseId = lowerCaseId.replaceAll(specialCharPattern,"").replaceAll(dotPattern,".").replaceAll(firstLastDotPattern,"");

        if (lowerCaseId.length() == 0){
            lowerCaseId = "a";
        }

        if (lowerCaseId.length() < 3){
            String lastChar = lowerCaseId.substring(lowerCaseId.length()-1);
            while (lowerCaseId.length() != 3){
               lowerCaseId = lowerCaseId.concat(lastChar);
            }
        }

        if (lowerCaseId.length() > 15){
            lowerCaseId = lowerCaseId.substring(0,15).replaceAll(firstLastDotPattern,"");
        }

        System.out.println(lowerCaseId);
        return lowerCaseId;
    }
}
