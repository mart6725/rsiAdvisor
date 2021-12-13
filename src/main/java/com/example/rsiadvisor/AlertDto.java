package com.example.rsiadvisor;

public class AlertDto {
    private String symbol;
    private double closingPrice;
    private double rsi;
    private int rsiFilter;
    private String rsiTimeframe;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getClosingPrice() {
        return closingPrice;
    }

    public void setClosingPrice(double closingPrice) {
        this.closingPrice = closingPrice;
    }

    public double getRsi() {
        return rsi;
    }

    public void setRsi(double rsi) {
        this.rsi = rsi;
    }

    public int getRsiFilter() {
        return rsiFilter;
    }

    public void setRsiFilter(int rsiFilter) {
        this.rsiFilter = rsiFilter;
    }

    public String getRsiTimeframe() {
        return rsiTimeframe;
    }

    public void setRsiTimeframe(String rsiTimeframe) {
        this.rsiTimeframe = rsiTimeframe;
    }
}