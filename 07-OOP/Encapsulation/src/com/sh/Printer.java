package com.sh;

public class Printer {
    private int tonerLevel;
    private int printedPages;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel >- 1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;
        this.printedPages = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount >0 && tonerAmount <= 100) {
            if(this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (duplex) {
            pagesToPrint = (pagesToPrint / 2) + (pagesToPrint % 2);
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPrintedPages() {
        return printedPages;
    }
}
