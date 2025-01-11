package com.springboot.app.domain.account;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.springboot.app.domain.common.ServiceStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@NoArgsConstructor
public class AccountResponse {

    private ServiceStatus serviceStatus;
    private Account account;
    private String username;
    private List<Account> accountList;
}
