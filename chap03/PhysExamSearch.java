package chap03;

/* 신체검사 데이터 배열에서 이진 검색 */

import java.util.*;

class PhysExamSearch 
{
    // 신체검사 데이터를 정의
    static class PhyscData
    {
        private String name; // 이름
        private int height; // 키
        private double vision; // 시력

        public PhyscData(String name, int height, double vision) // 생성자
        {   
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        // 문자열로 만들어 반환하는 메서드
        public String toString()
        {
            return name + " " + height + " " + vision;
        }

        // 키의 오름차순으로 정렬하기 위한 comparator
        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData>
        {
            public int compare(PhyscData d1, PhyscData d2)
            {
                return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
            }
        }
    }
    

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        PhyscData[] x = {
            new PhyscData("강민하", 162, 0.3),
            new PhyscData("이수연", 168, 0.4),
            new PhyscData("황지안", 169, 0.8),
            new PhyscData("유서범", 171, 1.5),
            new PhyscData("김찬우", 173, 0.7),
            new PhyscData("장경오", 174, 1.2),
            new PhyscData("박준서", 175, 2.0),
        };
        System.out.print("키가 몇 cm인 사람을 찾고 있나요?:");
        int height = scanner.nextInt();
        int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);

        if(idx < 0)
            System.out.println("그 값의 요소가 없습니다.");
        else
        {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
            System.out.println("찾은 데이터: " + x[idx]); // toStirng메서드 출력
        }

        scanner.close();
    }
}
