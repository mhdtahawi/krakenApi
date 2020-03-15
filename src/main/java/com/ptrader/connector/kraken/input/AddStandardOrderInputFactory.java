package com.ptrader.connector.kraken.input;

import java.math.BigDecimal;
import java.util.Optional;

public class AddStandardOrderInputFactory {

    public static AddStandardOrderInput createMarketOrder(String pair, TransactionType type, BigDecimal volume, boolean validate) {
        return AddStandardOrderInput.builder()
                .pair(pair)
                .transactionType(type)
                .volume(volume)
                .validate(validate)
                .orderType(OrderType.MARKET).build();

    }

    public static AddStandardOrderInput createLimitOrder(String pair,
                                                         TransactionType type,
                                                         BigDecimal volume,
                                                         boolean validate,
                                                         BigDecimal limitPrice) {
        return AddStandardOrderInput.builder()
                .pair(pair)
                .transactionType(type)
                .volume(volume)
                .validate(validate)
                .orderType(OrderType.LIMIT)
                .price(Optional.of(limitPrice)).build();
    }

    public static AddStandardOrderInput createStopLossOrder(String pair,
                                                            TransactionType type,
                                                            BigDecimal volume,
                                                            boolean validate,
                                                            BigDecimal stopLossPrice) {
        return AddStandardOrderInput.builder()
                .pair(pair)
                .transactionType(type)
                .volume(volume)
                .validate(validate)
                .orderType(OrderType.STOP_LOSS)
                .price(Optional.of(stopLossPrice)).build();
    }

    public static AddStandardOrderInput createTakeProfitOrder(String pair,
                                                              TransactionType type,
                                                              BigDecimal volume,
                                                              boolean validate,
                                                              BigDecimal takeProfitPrice) {
        return AddStandardOrderInput.builder()
                .pair(pair)
                .transactionType(type)
                .volume(volume)
                .validate(validate)
                .orderType(OrderType.TAKE_PROFIT)
                .price(Optional.of(takeProfitPrice)).build();
    }

    public static AddStandardOrderInput createStopLossProfitOrder(String pair,
                                                                  TransactionType type,
                                                                  BigDecimal volume,
                                                                  boolean validate,
                                                                  BigDecimal stopLossPrice,
                                                                  BigDecimal takeProfitPrice) {
        return AddStandardOrderInput.builder()
                .pair(pair)
                .transactionType(type)
                .volume(volume)
                .validate(validate)
                .orderType(OrderType.STOP_LOSS_PROFIT)
                .price(Optional.of(stopLossPrice))
                .price2(Optional.of(takeProfitPrice)).build();
    }

    public static AddStandardOrderInput createStopLossProfitLimitOrder(String pair,
                                                                       TransactionType type,
                                                                       BigDecimal volume,
                                                                       boolean validate,
                                                                       BigDecimal stopLossPrice,
                                                                       BigDecimal takeProfitPrice) {
        return AddStandardOrderInput.builder()
                .pair(pair)
                .transactionType(type)
                .volume(volume)
                .validate(validate)
                .orderType(OrderType.STOP_LOSS_PROFIT_LIMIT)
                .price(Optional.of(stopLossPrice))
                .price2(Optional.of(takeProfitPrice)).build();
    }

    public static AddStandardOrderInput createStopLossLimitOrder(String pair,
                                                                 TransactionType type,
                                                                 BigDecimal volume,
                                                                 boolean validate,
                                                                 BigDecimal stopLossTrigger,
                                                                 BigDecimal triggeredLimitPrice) {
        return AddStandardOrderInput.builder()
                .pair(pair)
                .transactionType(type)
                .volume(volume)
                .validate(validate)
                .orderType(OrderType.STOP_LOSS_LIMIT)
                .price(Optional.of(stopLossTrigger))
                .price2(Optional.of(triggeredLimitPrice)).build();
    }

    public static AddStandardOrderInput createTakeProfitLimitOrder(String pair,
                                                                   TransactionType type,
                                                                   BigDecimal volume,
                                                                   boolean validate,
                                                                   BigDecimal takeProfitTrigger,
                                                                   BigDecimal triggeredLimitPrice) {
        return AddStandardOrderInput.builder()
                .pair(pair)
                .transactionType(type)
                .volume(volume)
                .validate(validate)
                .orderType(OrderType.TAKE_PROFIT_LIMIT)
                .price(Optional.of(takeProfitTrigger))
                .price2(Optional.of(triggeredLimitPrice)).build();
    }

    public static AddStandardOrderInput createTrailingStopOrder(String pair,
                                                                TransactionType type,
                                                                BigDecimal volume,
                                                                boolean validate,
                                                                BigDecimal trailingStopOffset) {
        return AddStandardOrderInput.builder()
                .pair(pair)
                .transactionType(type)
                .volume(volume)
                .validate(validate)
                .orderType(OrderType.TRAILING_STOP)
                .price(Optional.of(trailingStopOffset)).build();
    }

    public static AddStandardOrderInput createTrailingStopLimitOrder(String pair,
                                                                     TransactionType type,
                                                                     BigDecimal volume,
                                                                     boolean validate,
                                                                     BigDecimal trailingStopOffset,
                                                                     BigDecimal triggeredLimitOffset) {
        return AddStandardOrderInput.builder()
                .pair(pair)
                .transactionType(type)
                .volume(volume)
                .validate(validate)
                .orderType(OrderType.TRAILING_STOP_LIMIT)
                .price(Optional.of(trailingStopOffset))
                .price2(Optional.of(triggeredLimitOffset)).build();
    }

    public static AddStandardOrderInput createStopLossAndLimitOrder(String pair,
                                                                    TransactionType type,
                                                                    BigDecimal volume,
                                                                    boolean validate,
                                                                    BigDecimal stopLossPrice,
                                                                    BigDecimal limitPrice) {
        return AddStandardOrderInput.builder()
                .pair(pair)
                .transactionType(type)
                .volume(volume)
                .validate(validate)
                .orderType(OrderType.STOP_LOSS_AND_LIMIT)
                .price(Optional.of(stopLossPrice))
                .price2(Optional.of(limitPrice)).build();
    }

    public static AddStandardOrderInput createSettlePositionOrder(String pair,
                                                                  TransactionType type,
                                                                  BigDecimal volume,
                                                                  boolean validate) {
        return AddStandardOrderInput.builder()
                .pair(pair)
                .transactionType(type)
                .volume(volume)
                .validate(validate)
                .orderType(OrderType.SETTLE_POSITION).build();
    }
}
