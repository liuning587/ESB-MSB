// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP26271RPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP26271RPackager extends DSPPackager
{

    public DSP26271RPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPPackedField(10, 0, "Description for field 1"), new DSPCharField(1, "Description for field 2"), new DSPPackedField(5, 0, "Description for field 3"), new DSPCharField(3, "Description for field 4"), new DSPCharField(1, "Description for field 5"), new DSPPackedField(4, 0, "Description for field 6"), new DSPPackedField(4, 0, "Description for field 7"), new DSPPackedField(4, 0, "Description for field 8"), new DSPPackedField(5, 2, "Description for field 9"), new DSPCharField(10, "Description for field 10"), 
            new DSPCharField(50, "Description for field 11")
        });
        addBody("26271R".toUpperCase(), fld);
    }
}