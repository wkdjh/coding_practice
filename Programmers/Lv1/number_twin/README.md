<h1>문제 풀이 방법</h1>
<div>
  먼저 입력된 문자열에서 문자를 하나씩 분리한 다음 동일한지 비교하려 했다.
  분리하는 방법으로는 
  <li>split 이용</li>
  <li>list, map 등을 이용 </li>
  <li>배열로 변환, toCharArray 함수 이용</li>
  이렇게 3가지를 생각했다. 그 중 배열로 변환하여 문제를 풀었다.
</div>
<hr>

<div>
  <h3>사용된 개념 설명</h3>
  1. toCharArray
  toCharArray: String 문자열을 Char형 배열로 바꿔주는 메서드
  <br>
  ex) ABC라는 문자열을 
  char[0]=A, char[1]=B, char[2]=C로 바꿔준다.
  <br>
  <br>
  2. StringBuilder
  여러 개의 string을 더할 때 그냥 '+'를 이용할 수도 있지만 string은 불변 객체이다. 즉 한 번 생성되면 변경할 수 없기 때문에 더해질 때 마다 새로운 객체가 생성되고 새로운 메모리 할당이 발생한다. 이렇게 되면 연산이 많아져서 성능적으로 좋지 않다.
  그래서 이용하는 메서드가 StringBuilder이다.
  <br>
  StringBuilder: 위의 언급한 문제를 해결하기 위해 사용하는 메서드, 변경 가능한 문자열 
  <br>
  <br>
  -사용법 
  <br>
  Stringbuilder 객체를 생성 후 .append를 이용하여 문자열 변경을 반영한다. 그리고 출력 시에는 toString()을 붙여야 한다.
  
</div>
