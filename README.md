# java-racingcar-precourse

# 구현 기능 목록

- [ ] 사용자 입력
    - [ ] 자동차 이름 입력
      - [ ] 자동차 이름 파싱
    - [ ] 경주 실행 횟수 입력
- [ ] 경주 실행
  - [ ] 랜덤값을 이용해 전진 유무 판단
  - [ ] 모든 자동차에 차수별 실행 적용
  - [ ] 매 결과를 출력
  - [ ] 입력받은 실행 횟수만큼 전체 경주 실행
- [ ] 우승자 선출
  - [ ] 공동우승은 콤마(,)로 구분해서 한 줄로 출력

# 예외 상황
### 사용자 입력
    자동차 이름 입력
    - 빈 문자열
    - 구분자 사이가 비어있는 경우
    - 구분자로 쉼표(,)를 사용하지 않은 경우

    경주 실행횟수 입력
    - 빈 문자열
    - 숫자가 아닌 경우
    - 숫자가 Integer의 값을 넘어갈 경우
