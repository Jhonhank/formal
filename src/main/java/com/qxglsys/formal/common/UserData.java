package com.qxglsys.formal.common;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserData {

    private Integer code;

    private String msg;

    private Integer count;

    private Object data;
}
