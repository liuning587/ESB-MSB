// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSPR1Packager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSPR1Packager extends DSPPackager
{

    public DSPR1Packager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPPackedField(2, 0, "Description for field 1"), new DSPCharField(2, "Description for field 2"), new DSPCharField(4, "Description for field 3"), new DSPPackedField(5, 2, "Description for field 4"), new DSPCharField(1, "Description for field 5"), new DSPPackedField(2, 0, "Description for field 6"), new DSPPackedField(7, 7, "Description for field 7"), new DSPPackedField(7, 7, "Description for field 8"), new DSPPackedField(7, 7, "Description for field 9"), new DSPPackedField(7, 7, "Description for field 10"), 
            new DSPPackedField(7, 7, "Description for field 11"), new DSPPackedField(7, 7, "Description for field 12"), new DSPPackedField(7, 7, "Description for field 13"), new DSPPackedField(7, 7, "Description for field 14")
        });
        addBody("R1".toUpperCase(), fld);
    }
}
