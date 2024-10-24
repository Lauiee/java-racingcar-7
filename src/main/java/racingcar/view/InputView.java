package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String carsInput() {
        return readInput("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public static String timesInput() {
        return readInput("시도할 횟수는 몇 회인가요?");
    }

    private static String readInput(String message) {
        System.out.println(message);
        return Console.readLine(); // 입력을 받는 역할만 수행
    }
}