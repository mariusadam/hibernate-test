package com.test.hibernate;

import java.util.Date;

public class Order {
    private Long orderId;
    private String orderNbr;
    private Date orderDate;
    private String orderDesc;
    private Long orderQty;
    private Double totalPrice;
    private String orderPaymentMethod;
    private Customer orderCustomer;
    private Product orderProduct;

    public Long getOrderId() {
        return orderId;
    }      

    public String getOrderNbr() {
        return orderNbr;
    }

    public void setOrderNbr(String orderNbr) {
        this.orderNbr = orderNbr;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public Long getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(Long orderQty) {
        this.orderQty = orderQty;
    }       

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getOrderPaymentMethod() {
        return orderPaymentMethod;
    }

    public void setOrderPaymentMethod(String orderPaymentMethod) {
        this.orderPaymentMethod = orderPaymentMethod;
    }

    public Customer getOrderCustomer() {
        return orderCustomer;
    }

    public void setOrderCustomer(Customer orderCustomer) {
        this.orderCustomer = orderCustomer;
    }

    public Product getOrderProduct() {
        return orderProduct;
    }

    public void setOrderProduct(Product orderProduct) {
        this.orderProduct = orderProduct;
    }

    public String toString() {
        return "Order: nbr[" + orderNbr + "] date [" + orderDate + "] desc["
                + orderDesc + "] qty[" + orderQty + "]";
    }
}
