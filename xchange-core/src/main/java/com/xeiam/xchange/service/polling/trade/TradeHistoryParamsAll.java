package com.xeiam.xchange.service.polling.trade;

import com.xeiam.xchange.currency.CurrencyPair;

/**
 * Generic {@link TradeHistoryParams} implementation that implements all the interfaces in the hierarchy and can be safely (without getting exceptions, if that all the required fields are non-null) passed to any implementation of {@link com.xeiam.xchange.service.polling.PollingTradeService#getTradeHistory(TradeHistoryParams)}.
 */
public class TradeHistoryParamsAll implements TradeHistoryParamsTimeSpan, TradeHistoryParamCount, TradeHistoryParamsIdSpan, TradeHistoryParamOffset, TradeHistoryParamCurrencyPair {
  private Long count;
  private String startId;
  private String endId;
  private Long endTime;
  private Long startTime;
  private Long offset;
  private CurrencyPair pair;

  @Override
  public void setCount(Long count) {

    this.count = count;
  }

  @Override
  public Long getCount() {

    return count;
  }

  @Override
  public String getStartId() {

    return startId;
  }

  @Override
  public void setEndId(String endId) {

    this.endId = endId;
  }

  @Override
  public String getEndId() {

    return endId;
  }

  @Override
  public void setStartId(String from) {

    startId = from;
  }

  @Override
  public void setEndTime(Long to) {

    endTime = to;
  }

  @Override
  public Long getEndTime() {

    return endTime;
  }

  @Override
  public void setStartTime(Long startTime) {

    this.startTime = startTime;
  }

  @Override
  public Long getStartTime() {

    return startTime;
  }

  @Override
  public void setOffset(Long offset) {

    this.offset = offset;
  }

  @Override
  public Long getOffset() {

    return offset;
  }

  @Override
  public CurrencyPair getCurrencyPair() {
    return pair;
  }

  @Override
  public void setCurrencyPair(CurrencyPair pair) {

    this.pair = pair;
  }
}
