package core.basesyntax.service;

import core.basesyntax.model.FruitTransaction;
import java.util.List;

public interface ShopService {
    List<FruitTransaction> process(List<FruitTransaction> transactions);
}
