package core.basesyntax.service.operations;

import core.basesyntax.FruitTransaction;

public class BalanceOperation implements OperationHandler {
    @Override
    public void doOperation(FruitTransaction fruitTransaction, Integer quantity) {
        fruitTransaction.setQuantity(quantity);
    }
}