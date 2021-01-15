package hash;

import java.util.*;

/*
 * 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.

구조대 : 119
박준영 : 97 674 223
지영석 : 11 9552 4421
전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.

제한 사항
phone_book의 길이는 1 이상 1,000,000 이하입니다.
각 전화번호의 길이는 1 이상 20 이하입니다.
입출력 예제
phone_book	return
[119, 97674223, 1195524421]	false
[123,456,789]	true
[12,123,1235,567,88]	false
입출력 예 설명
입출력 예 #1
앞에서 설명한 예와 같습니다.

입출력 예 #2
한 번호가 다른 번호의 접두사인 경우가 없으므로, 답은 true입니다.

입출력 예 #3
첫 번째 전화번호, “12”가 두 번째 전화번호 “123”의 접두사입니다. 따라서 답은 false입니다.
 */

public class Hash_2 {

	public static boolean solution(String[] phone_book) {
		boolean answer = true;

		Map<String, char[]> map = new HashMap<>();

		for (String a : phone_book) {
			map.put(a, a.toCharArray());

		}

		for (String a : map.keySet()) {
			
			// 모든 배열을 보내서 비교메소드 써줌
			for (String b : map.keySet()) {
				if (map.get(a).length < map.get(b).length) {  // 배열 a의 길이가 배열 b의 길이보다 작을경우 에만 실행
					
					answer = check(map.get(a), map.get(b));
					System.out.println(answer);
					if (!answer) return answer;					
				}
				
			}
			
		}

		return answer;
	}
	
	static boolean check(char[] a, char[] b) {
		
		
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] != b[i]) {
				return true;
			}
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		String[] a = { "113", "44", "4544" };

		System.out.println(solution(a));

	}
}
