package com.springboot.app.domain.account;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString
@XmlRootElement
@NoArgsConstructor
public class Account implements Serializable {

    private String accountNumber;
    private String accountName;
}
