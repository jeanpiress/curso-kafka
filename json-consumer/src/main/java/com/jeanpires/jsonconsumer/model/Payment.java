package com.jeanpires.jsonconsumer.model;

import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@ToStringgi
@Getter
public class Payment implements Serializable {

    private Long id;
    private Long idUser;
    private Long idProduct;
    private String carNumber;

}
