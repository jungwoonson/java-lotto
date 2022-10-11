# 로또

## Step1 기능 요구사항
* 사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
* 입력 문자열의 숫자와 사칙 연산 사이에는 반드시 빈 공백 문자열이 있다고 가정한다.
* 나눗셈의 경우 결과 값을 정수로 떨어지는 값으로 한정한다.
* 문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
* 예를 들어 2 + 3 * 4 / 2와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.

## 계산기 구현 목록
- 입력
  - [x] 계산될 문자열을 입력받는다.
  - [x] " "(white space)로 문자열을 분리한다.
- 출력
  - [x] 계산 결과를 출력한다.
- 어플리케이션
  - [x] 입력 문자열을 계산기에게 알려준다.
  - [x] 결과를 출력에게 알려준다.
- 계산기
  - [x] 계산 가능한 식인지 확인한다.
  - [x] 식을 계산한다.
- 숫자리스트
  - [x] 숫자인지 확인한다.
  - [x] 문자형인 숫자를 정수형으로 변환한다.
  - [x] 숫자 개수를 알려준다.
- 연산자
  - [x] 연산자인지 확인한다.
  - [x] 문자인 연산자를 Operator형으로 반환한다.
  - [x] 해당 연산자로 연산한다.
- 연산자리스트
  - [x] 연산 가능한 식인지 확인한다.
  - [x] 주어진 계산식 리스트를 숫자와, 연산자로 분리한다.

## Step2 기능 요구사항
* 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
* 로또 1장의 가격은 1000원이다.
* 3개 6개까지 일치한 로또 수를 출력한다. (0개도 출력)
* 총 수익률을 출력한다. 구매금액과 판매금액이 같을 경우 수익률이 1이다.

### 로또 구현 목록
- 입력
  - [x] 돈을 입력 받는다.
  - [x] 지난 주 당첨 번호를 입력받는다.
- 출력
  - [x] 주어진 로또 수를 출력한다.
  - [x] 주어진 로또들을 출력한다.
- 돈
  - [x] 돈의 액수를 입력 받는다.
  - [x] 돈이 아닌 문자를 입력 받으면 예외가 발생한다.
  - [x] 0이상의 수가 아니면 예외를 발생시킨다.
  - [x] 주어진 단위로 나눈 수를 준다.
- 판매원
  - [x] 돈을 받는다.
  - [x] 1000원 단위의 돈이 아니면 예외를 발생시킨다.
  - [x] 플레이 가능한 로또 수를 알려준다.
- 로또 생성기
  - [x] 주어진 수 만큼 로또들을 생성한다. 
- 로또 번호
  - [x] 1~45 사이의 숫자.
  - [x] 6개의 수.
  - [x] 중복되지 않아야함.
  - [x] 오름차순으로 정렬된 로또 숫자들을 문자형으로 반환한다.
- 등수
  - [ ] 등수에 따른 상금을 알고 있다.
- Application
  - [x] 입력이 올바르지 않으면 다시 입력하도록 유도한다.

1. 입력을 받는다.
2. 천원 단위로 로또를 산다.
3. 로또가 자동 생성된다.
4. 당첨번호를 입력한다.
5. 당첨 결과를 알려준다.
6. 수익률을 알려준다.