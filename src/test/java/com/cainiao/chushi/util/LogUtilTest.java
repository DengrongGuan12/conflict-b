package com.cainiao.chushi.util;

import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by dengrong on 2017/6/2.
 */
public class LogUtilTest {
    @org.junit.Test
    public void log() throws Exception {
        LogUtil.log("name");
        Assert.assertEquals(1,1);
    }

}