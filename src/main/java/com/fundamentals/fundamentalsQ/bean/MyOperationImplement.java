package com.fundamentals.fundamentalsQ.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyOperationImplement implements MyOperation{

    Log LOGGER = LogFactory.getLog(MyOperationImplement.class);

    @Override
    public int sum(int number) {
        LOGGER.debug("Mi valor" + number);
        return number;
    }
}
