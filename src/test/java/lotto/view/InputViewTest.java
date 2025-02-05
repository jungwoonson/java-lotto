package lotto.view;

import lotto.domain.ManualLottoCount;
import lotto.domain.PlayLottoCount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class InputViewTest {

    @DisplayName("로또 금액을 입력 받는다.")
    @ParameterizedTest
    @ValueSource(strings = "14000")
    void receive_money(String input) {
        setIn(input);

        String actual = InputView.receiveMoney();

        assertThat(actual).isEqualTo("14000");
    }

    @DisplayName("지난주 당첨번호를 입력 받는다.")
    @ParameterizedTest
    @ValueSource(strings = "1, 2, 3, 4, 5, 6")
    void receive_last_week_winning_number(String input) {
        setIn(input);
        List<String> expected = List.of("1", "2", "3", "4", "5", "6");

        List<String> actual = InputView.receiveLastWeekWinningNumber();

        assertThat(actual).isEqualTo(expected);
    }

    @DisplayName("보너스 볼을 입력받는다.")
    @ParameterizedTest
    @ValueSource(strings = " 7 ")
    void receive_bonus_ball(String input) {
        setIn(input);
        String expected = "7";

        String actual = InputView.receiveBonusBall();

        assertThat(actual).isEqualTo(expected);
    }

    @DisplayName("수동 로또 수를 입력받는다.")
    @ParameterizedTest
    @ValueSource(strings = " 7 ")
    void receive_manual_lotto_count(String input) {
        setIn(input);
        String expected = "7";

        String actual = InputView.receiveManualLottoCount();

        assertThat(actual).isEqualTo(expected);
    }

    @DisplayName("수동 로또 번호를 입력 받는다.")
    @ParameterizedTest
    @ValueSource(strings = "1,2,3,4,5,6\n2,3,4,5,6,7\n3,4,5,6,7,8\n")
    void receive_manual_lottos(String input) {
        List<String> expected = List.of(
                "1,2,3,4,5,6",
                "2,3,4,5,6,7",
                "3,4,5,6,7,8"
        );
        ManualLottoCount manualLottoCount = new ManualLottoCount(new PlayLottoCount(5), 3);
        setIn(input);

        List<String> actual = InputView.receiveManualLottos(manualLottoCount);

        assertThat(actual).isEqualTo(expected);
    }

    private void setIn(String input) {
        InputStream in = generateUserInput(input);
        System.setIn(in);
    }

    private static InputStream generateUserInput(String input) {
        return new ByteArrayInputStream(input.getBytes());
    }
}
