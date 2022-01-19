문자열 입력 받기 - GetInput#inputString
문자열 파싱(숫자, 연산자) - split(내장함수)
문자열 계산(전체 수식 받아서 정답 반환) - Calculator#calculate
문자배열을 세개씩 나눔 - Calculator#parseOperation(String[] stringArray, int start)
덧셈 - add
뺄셈 - sub
곱셈 - mul
나눗셈 - div

# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

1. [x] "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)." 출력  
2. [x] 입력 받음  
3. [x] split 내장함수 사용해서 자동차 이름 파싱, 자동차 배열 생성  
4. [x] "시도할 횟수는 몇 회인가요?" 출력  
5. [x] 입력 받음  
6. while문을 사용해서 함수 돌림  
    6-1. [x] 차별로 랜덤값 받아서 0~9 사이 난수 생성  
    6-2. 난수가 4 이상인지 확인. 4 이상이면 run  
    6-3. 출력  
## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)