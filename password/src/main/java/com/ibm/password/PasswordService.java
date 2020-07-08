package com.ibm.password;

public interface PasswordService {

    String hash(String input);

    String algorithm();

}