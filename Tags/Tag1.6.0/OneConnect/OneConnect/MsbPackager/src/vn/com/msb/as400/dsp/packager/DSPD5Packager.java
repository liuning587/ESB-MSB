// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSPD5Packager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSPD5Packager extends DSPPackager
{

    public DSPD5Packager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPPackedField(2, 0, "Description for field 1"), new DSPCharField(2, "Description for field 2"), new DSPCharField(40, "Description for field 3"), new DSPCharField(40, "Description for field 4"), new DSPCharField(2, "Description for field 5"), new DSPCharField(1, "Description for field 6"), new DSPCharField(40, "Description for field 7"), new DSPCharField(10, "Description for field 8"), new DSPCharField(1, "Description for field 9"), new DSPPackedField(4, 0, "Description for field 10"), 
            new DSPCharField(40, "Description for field 11"), new DSPCharField(1, "Description for field 12"), new DSPPackedField(4, 0, "Description for field 13")
        });
        addBody("D5".toUpperCase(), fld);
    }
}
