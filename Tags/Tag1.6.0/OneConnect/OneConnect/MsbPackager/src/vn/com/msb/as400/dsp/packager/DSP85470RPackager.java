// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP85470RPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP85470RPackager extends DSPPackager
{

    public DSP85470RPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPPackedField(10, 0, "Description for field 1"), new DSPCharField(1, "Description for field 2"), new DSPPackedField(4, 0, "Description for field 3"), new DSPPackedField(4, 0, "Description for field 4"), new DSPCharField(10, "Description for field 5"), new DSPCharField(40, "Description for field 6"), new DSPPackedField(2, 0, "Description for field 7"), new DSPCharField(1, "Description for field 8"), new DSPPackedField(8, 2, "Description for field 9"), new DSPPackedField(8, 2, "Description for field 10"), 
            new DSPCharField(10, "Description for field 11"), new DSPPackedField(4, 0, "Description for field 12"), new DSPPackedField(4, 0, "Description for field 13"), new DSPCharField(2, "Description for field 14"), new DSPPackedField(5, 0, "Description for field 15"), new DSPCharField(40, "Description for field 16"), new DSPPackedField(4, 0, "Description for field 17"), new DSPNumericField(7, "Description for field 18"), new DSPPackedField(4, 0, "Description for field 19")
        });
        addBody("85470R".toUpperCase(), fld);
    }
}
