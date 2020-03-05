package com.epam.lab.hw_14_xml.task3;

import com.epam.lab.hw_14_xml.task3.tariffs_child.CallPrices;
import com.epam.lab.hw_14_xml.task3.tariffs_child.Parameters;


public class Tariffs {
    private String name;
    private String operatorName;
    private int payroll;
    private CallPrices call_price;
    private int smsPrice;
    private Parameters parameter;

    public Tariffs(String name, String operatorName, int payroll, CallPrices call_price, int smsPrice, Parameters parameter) {
        this.name = name;
        this.operatorName = operatorName;
        this.payroll = payroll;
        this.call_price = call_price;
        this.smsPrice = smsPrice;
        this.parameter = parameter;
    }
}
