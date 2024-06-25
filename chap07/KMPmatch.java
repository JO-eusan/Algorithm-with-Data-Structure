package chap07;

import java.util.Scanner;

public class KMPmatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("텍스트: ");
        String s1 = scanner.next();

        System.out.print("패턴: ");
        String s2 = scanner.next();

        int idx = kmpMatch(s1, s2);

        if(idx == -1)
            System.out.println("텍스트에 패턴이 없습니다.");
        else { // 일치하는 문자 바로 앞까지의 문자 개수를 반각 문자로 환산하여 구함
            int len = 0;
            for(int i=0; i<idx; i++)
                len += s1.substring(i, i+1).getBytes().length;
            len += s2.length();

            System.out.println((idx + 1) + "번째 문자부터 일치합니다.");
            System.out.println("텍스트: " + s1);
            System.out.printf(String.format("패턴: %%%ds\n", len), s2);
        }

        scanner.close();
    }

    /* KMP법으로 문자열을 검색하는 메서드 */
    static int kmpMatch(String txt, String pat) {
        int pt = 1; // txt pointer
        int pp = 0; // patter pointer
        int[] skip = new int[pat.length()+1]; // table

        skip[pt] = 0;
        /* table 채우기 */
        while(pt != pat.length()) {
            if(pat.charAt(pt) == pat.charAt(pp))
                skip[++pt] = ++pp;
            else if(pp==0)
                skip[++pt] = pp;
            else
                pp = skip[pp];
        }
        /* 검색 */
        pt = pp = 0;
        while(pt != txt.length() && pp != pat.length()) {
            if(txt.charAt(pt) == pat.charAt(pp)) {
                pt++; pp++;
            }
            else if(pp == 0)
                pt++;
            else 
                pp = skip[pp];
        }

        if(pp == pat.length()) // 검색 성공
            return pt-pp;
        return -1; // 검색 실패
    }
}
