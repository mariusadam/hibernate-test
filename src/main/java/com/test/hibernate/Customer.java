package com.test.hibernate;


public class Customer {
    private Long customerId;
    private String customerFirstName;
    private String customerLastName;
    private String customerMobile;
    private String customerEmailId;
   
    public Long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
    public String getCustomerFirstName() {
        return customerFirstName;
    }
    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }
    public String getCustomerLastName() {
        return customerLastName;
    }
    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }
    public String getCustomerMobile() {
        return customerMobile;
    }
    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }
    public String getCustomerEmailId() {
        return customerEmailId;
    }
    public void setCustomerEmailId(String customerEmailId) {
        this.customerEmailId = customerEmailId;
    }
}
