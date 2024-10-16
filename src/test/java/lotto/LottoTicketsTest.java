package lotto;

import lotto.domain.LottoTicket;
import lotto.domain.LottoTickets;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LottoTicketsTest {
    @Test
    @DisplayName("로또 티켓 개수 확인")
    void lottoTicketCount() {
        int price = 3000;
        LottoTickets lottoTickets = new LottoTickets(price);

        assertThat(lottoTickets.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("로또 티켓들 일치 확인")
    void lottoTicketMatchCount() {
        List<LottoTicket> tickets = new ArrayList<>();
        tickets.add(new LottoTicket(List.of(1, 2, 3, 4, 5, 6)));
        tickets.add(new LottoTicket(List.of(1, 2, 3, 4, 7, 8)));
        tickets.add(new LottoTicket(List.of(9, 10, 11, 12, 13, 14)));
        LottoTickets lottoTickets = new LottoTickets(tickets);

        LottoTicket winningNumbers = new LottoTicket(List.of(1, 2, 3, 4, 5, 6));

        assertThat(lottoTickets.matchCount(winningNumbers)).containsExactly(6, 4, 0);
    }
}
