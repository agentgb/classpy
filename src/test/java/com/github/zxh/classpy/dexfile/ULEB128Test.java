package com.github.zxh.classpy.dexfile;

import org.junit.Assert;
import org.junit.Test;

public class ULEB128Test {
    
    @Test
    public void uleb128() {
        Assert.assertEquals(0, new DexReader(new byte[] {0}).readUleb128().getValue());
        Assert.assertEquals(1, new DexReader(new byte[] {1}).readUleb128().getValue());
        Assert.assertEquals(127, new DexReader(new byte[] {0x7f}).readUleb128().getValue());
        Assert.assertEquals(16256, new DexReader(new byte[] {(byte)0x80, 0x7f}).readUleb128().getValue());
    }
    
}