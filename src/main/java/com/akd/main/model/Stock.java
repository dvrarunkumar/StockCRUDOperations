package com.akd.main.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "PORTFOLIO_STOCKS")
public class Stock {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer stockId;

    private String stockSymbol;
    private Timestamp dateLoaded;
    private String companyName;
    private String isinCode;
    private Integer qty;
    private Float averageCostPrice;
    private Float currentMarketPrice;
    private Float percChangeOverPrevClose;
    private Float valueAtCost;
    private Float valueAtMarketPrice;
    private Float daysGain;
    private Float daysGainPerc;
    private Float realizedProfitLoss;
    private Float unrealizedProfileLoss;
    private Double unrealizedProfitLossPerc;

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    private String industry;

    // since you had declared your own constructor with args below , the "no argument constructor"
    // is not provided by java and hence you need to provide this.
    public Stock() {
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getIsinCode() {
        return isinCode;
    }

    public void setIsinCode(String isinCode) {
        this.isinCode = isinCode;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Float getAverageCostPrice() {
        return averageCostPrice;
    }

    public void setAverageCostPrice(Float averageCostPrice) {
        this.averageCostPrice = averageCostPrice;
    }

    public Float getCurrentMarketPrice() {
        return currentMarketPrice;
    }

    public void setCurrentMarketPrice(Float currentMarketPrice) {
        this.currentMarketPrice = currentMarketPrice;
    }

    public Float getPercChangeOverPrevClose() {
        return percChangeOverPrevClose;
    }

    public void setPercChangeOverPrevClose(Float percChangeOverPrevClose) {
        this.percChangeOverPrevClose = percChangeOverPrevClose;
    }

    public Float getValueAtCost() {
        return valueAtCost;
    }

    public void setValueAtCost(Float valueAtCost) {
        this.valueAtCost = valueAtCost;
    }

    public Float getValueAtMarketPrice() {
        return valueAtMarketPrice;
    }

    public void setValueAtMarketPrice(Float valueAtMarketPrice) {
        this.valueAtMarketPrice = valueAtMarketPrice;
    }

    public Float getDaysGain() {
        return daysGain;
    }

    public void setDaysGain(Float daysGain) {
        this.daysGain = daysGain;
    }

    public Float getDaysGainPerc() {
        return daysGainPerc;
    }

    public void setDaysGainPerc(Float daysGainPerc) {
        this.daysGainPerc = daysGainPerc;
    }

    public Float getRealizedProfitLoss() {
        return realizedProfitLoss;
    }

    public void setRealizedProfitLoss(Float realizedProfitLoss) {
        this.realizedProfitLoss = realizedProfitLoss;
    }

    public Float getUnrealizedProfileLoss() {
        return unrealizedProfileLoss;
    }

    public void setUnrealizedProfileLoss(Float unrealizedProfileLoss) {
        this.unrealizedProfileLoss = unrealizedProfileLoss;
    }

    public Double getUnrealizedProfitLossPerc() {
        return unrealizedProfitLossPerc;
    }

    public void setUnrealizedProfitLossPerc(Double unrealizedProfitLossPerc) {
        this.unrealizedProfitLossPerc = unrealizedProfitLossPerc;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return stockSymbol.equals(stock.stockSymbol) &&
                (dateLoaded.compareTo(stock.dateLoaded)==0);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stockSymbol, dateLoaded);
    }*/

    public Timestamp getDateLoaded() {
        return dateLoaded;
    }

    public void setDateLoaded(Timestamp dateLoaded) {
        this.dateLoaded = dateLoaded;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockSymbol='" + stockSymbol + '\'' +
                ", companyName='" + companyName + '\'' +
                ", isinCode='" + isinCode + '\'' +
                ", qty=" + qty +
                ", averageCostPrice=" + averageCostPrice +
                ", currentMarketPrice=" + currentMarketPrice +
                ", percChangeOverPrevClose=" + percChangeOverPrevClose +
                ", valueAtCost=" + valueAtCost +
                ", valueAtMarketPrice=" + valueAtMarketPrice +
                ", daysGain=" + daysGain +
                ", daysGainPerc=" + daysGainPerc +
                ", realizedProfitLoss=" + realizedProfitLoss +
                ", unrealizedProfileLoss=" + unrealizedProfileLoss +
                ", unrealizedProfitLossPerc=" + unrealizedProfitLossPerc +
                ", industry='" + industry + '\'' +
                ", dateLoaded='" + dateLoaded + '\'' +
                '}';
    }
}


