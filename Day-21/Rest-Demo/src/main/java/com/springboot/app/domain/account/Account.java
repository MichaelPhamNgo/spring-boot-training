package com.bfs.restdemo.domain.account;

import lombok.*;

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
