package com.example.besecure;

public class userHelper {

    String KEY_etName, KEY_etAddress, KEY_etContact1, KEY_etContact2, KEY_etContact3;

    public userHelper() {

    }

    public userHelper( String etName_KEY, String etAddress_KEY, String etContact1_KEY, String etContact2_KEY, String etContact3_KEY) {

        this.KEY_etName = etName_KEY;
        this.KEY_etAddress = etAddress_KEY;
        this.KEY_etContact1 = etContact1_KEY;
        this.KEY_etContact2 = etContact2_KEY;
        this.KEY_etContact3 = etContact3_KEY;
    }

    public String getName() {
        return KEY_etName;
    }

    public void setName(String etName_KEY) {
        this.KEY_etName = etName_KEY;
    }

    public String getAddress() {
        return KEY_etAddress;
    }

    public void setAddress(String etAddress_KEY) {
        this.KEY_etAddress = etAddress_KEY;
    }

    public String getContact1() {
        return KEY_etContact1;
    }

    public void setContact1(String etContact1_KEY) {
        this.KEY_etContact1 = etContact1_KEY;
    }

    public String getContact2() {
        return KEY_etContact2;
    }

    public void setContact2(String etContact2_KEY) {
        this.KEY_etContact2 = etContact2_KEY;
    }

    public String getContact3() {
        return KEY_etContact3;
    }

    public void setContact3(String etContact3_KEY) {
        this.KEY_etContact3 = etContact3_KEY;
    }
}
