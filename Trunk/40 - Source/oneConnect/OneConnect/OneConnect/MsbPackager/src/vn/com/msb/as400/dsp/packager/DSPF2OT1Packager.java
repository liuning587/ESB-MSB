// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSPF2OT1Packager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSPF2OT1Packager extends DSPPackager
{

    public DSPF2OT1Packager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPPackedField(2, 0, "Description for field 1"), new DSPCharField(1, "Description for field 2"), new DSPCharField(1, "Description for field 3"), new DSPCharField(1, "Description for field 4"), new DSPCharField(21, "Description for field 5"), new DSPCharField(1, "Description for field 6"), new DSPCharField(6, "Description for field 7"), new DSPCharField(1, "Description for field 8")
        });
        addBody("F2OT1".toUpperCase(), fld);
    }
}
