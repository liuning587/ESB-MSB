// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSPLN2APPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSPLN2APPackager extends DSPPackager
{

    public DSPLN2APPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPPackedField(2, 0, "Description for field 1"), new DSPCharField(1, "Description for field 2"), new DSPCharField(1, "Description for field 3"), new DSPCharField(1, "Description for field 4"), new DSPCharField(17, "Description for field 5"), new DSPCharField(13, "Description for field 6"), new DSPCharField(8, "Description for field 7"), new DSPCharField(1, "Description for field 8"), new DSPCharField(13, "Description for field 9"), new DSPCharField(11, "Description for field 10"), 
            new DSPCharField(8, "Description for field 11"), new DSPCharField(1, "Description for field 12"), new DSPCharField(16, "Description for field 13"), new DSPCharField(8, "Description for field 14"), new DSPCharField(3, "Description for field 15"), new DSPCharField(1, "Description for field 16"), new DSPCharField(8, "Description for field 17"), new DSPCharField(1, "Description for field 18"), new DSPCharField(1, "Description for field 19"), new DSPCharField(1, "Description for field 20"), 
            new DSPCharField(13, "Description for field 21"), new DSPCharField(9, "Description for field 22"), new DSPCharField(8, "Description for field 23"), new DSPCharField(1, "Description for field 24"), new DSPCharField(8, "Description for field 25"), new DSPCharField(1, "Description for field 26"), new DSPCharField(18, "Description for field 27"), new DSPCharField(3, "Description for field 28"), new DSPCharField(8, "Description for field 29"), new DSPCharField(1, "Description for field 30"), 
            new DSPCharField(8, "Description for field 31"), new DSPCharField(1, "Description for field 32"), new DSPCharField(1, "Description for field 33")
        });
        addBody("LN2AP".toUpperCase(), fld);
    }
}
