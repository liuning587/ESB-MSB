// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP15102RPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP15102RPackager extends DSPPackager
{

    public DSP15102RPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPVietField(20, "Description for field 1"), new DSPPackedField(10, 0, "Description for field 2"), new DSPVietField(40, "Description for field 3"), new DSPVietField(3, "Description for field 4"), new DSPPackedField(3, 0, "Description for field 5"), new DSPVietField(40, "Description for field 6"), new DSPVietField(40, "Description for field 7"), new DSPVietField(1, "Description for field 8"), new DSPVietField(1, "Description for field 9"), new DSPVietField(1, "Description for field 10")
        });
        addBody("15102R".toUpperCase(), fld);
    }
}
