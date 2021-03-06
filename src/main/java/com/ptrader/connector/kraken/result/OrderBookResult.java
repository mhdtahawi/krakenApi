package com.ptrader.connector.kraken.result;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ptrader.connector.kraken.utils.JSONUtils;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class OrderBookResult extends Result<Map<String, OrderBookResult.OrderBook>> {

    public static class OrderBook {
        public List<Market> asks;
        public List<Market> bids;

        @Override
        public String toString() {
            return JSONUtils.toString(this);
        }
    }

    @JsonFormat(shape = JsonFormat.Shape.ARRAY)
    @JsonPropertyOrder({"price", "volume", "timestamp"})
    public static class Market {
        public BigDecimal price;
        public BigDecimal volume;
        public Integer timestamp;

        private Market() {}

        public Market(BigDecimal price, BigDecimal volume, Integer timestamp) {
            this.price = price;
            this.volume = volume;
            this.timestamp = timestamp;
        }

        @Override
        public String toString() {
            return JSONUtils.toString(this);
        }
    }
}
