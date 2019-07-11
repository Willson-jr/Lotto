package Willson.Lotto.Generator;

import java.util.List;

public interface LottoGenerator {
    List<Integer> generate();
    String generateDescription();
}
