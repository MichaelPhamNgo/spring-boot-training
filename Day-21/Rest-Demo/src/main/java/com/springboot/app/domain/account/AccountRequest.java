package com.bfs.restdemo.domain.account;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
public class AccountRequest {

    private String accountNumber;
}
