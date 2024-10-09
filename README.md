# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 문자열 사칙 연산 계산기 기능 요구사항
- InputView
  - 사용자가 입력한 문자열 값 받음 (ex. 2 + 3 * 4 / 2)
- Tokens
  - 토큰 값이 없을 경우 IllegalArgumentException throw
  - 사칙연산 기호가 아닌 경우 IllegalArgumentException throw
- ResultView
  - 계산 결과를 출력
- CalculatorApp
  - 전체 계산기 실행 수행
- Calculator
  - 사용자가 입력한 문자열 값에 따라 사칙연산을 수행
    - 나눗셈의 경우 결과 값을 정수로 떨어지는 값으로 한정
    - 문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정
    - 테스트할 수 있는 단위로 나누어 구현 목록을 만들어야 함
      - 덧셈
      - 뺄셈
      - 곱셈
      - 나눗셈
