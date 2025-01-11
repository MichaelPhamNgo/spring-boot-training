package com.springboot.app.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MyAsyncResponse {
    private String userResponse;
    private String accountResponse;
    private String billingResponse;
    private String usageResponse;

}
