// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP87224IPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP87224IPackager extends DSPPackager
{

    public DSP87224IPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPPackedField(10, 0, "Description for field 1"), new DSPCharField(10, "Description for field 2"), new DSPPackedField(10, 0, "Description for field 3"), new DSPPackedField(4, 0, "Description for field 4"), new DSPCharField(1, "Description for field 5"), new DSPCharField(10, "Description for field 6"), new DSPPackedField(4, 0, "Description for field 7"), new DSPPackedField(2, 0, "Description for field 8"), new DSPCharField(1, "Description for field 9"), new DSPPackedField(4, 0, "Description for field 10"), 
            new DSPCharField(20, "Description for field 11"), new DSPCharField(50, "Description for field 12")
        });
        addBody("87224I".toUpperCase(), fld);
    }
}
