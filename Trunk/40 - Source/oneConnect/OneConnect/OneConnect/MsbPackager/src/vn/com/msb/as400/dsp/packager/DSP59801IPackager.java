// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP59801IPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP59801IPackager extends DSPPackager
{

    public DSP59801IPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPPackedField(10, 0, "Description for field 1"), new DSPCharField(1, "Description for field 2"), new DSPPackedField(2, 0, "Description for field 3"), new DSPCharField(50, "Description for field 4"), new DSPPackedField(2, 0, "Description for field 5"), new DSPCharField(50, "Description for field 6"), new DSPPackedField(2, 0, "Description for field 7"), new DSPCharField(50, "Description for field 8"), new DSPPackedField(2, 0, "Description for field 9"), new DSPCharField(50, "Description for field 10"), 
            new DSPPackedField(2, 0, "Description for field 11"), new DSPCharField(50, "Description for field 12"), new DSPPackedField(2, 0, "Description for field 13"), new DSPCharField(50, "Description for field 14"), new DSPPackedField(2, 0, "Description for field 15"), new DSPCharField(50, "Description for field 16"), new DSPPackedField(2, 0, "Description for field 17"), new DSPCharField(50, "Description for field 18"), new DSPPackedField(2, 0, "Description for field 19"), new DSPCharField(50, "Description for field 20"), 
            new DSPPackedField(2, 0, "Description for field 21"), new DSPCharField(50, "Description for field 22"), new DSPPackedField(2, 0, "Description for field 23"), new DSPCharField(50, "Description for field 24"), new DSPPackedField(2, 0, "Description for field 25"), new DSPCharField(50, "Description for field 26"), new DSPPackedField(2, 0, "Description for field 27"), new DSPCharField(50, "Description for field 28"), new DSPPackedField(2, 0, "Description for field 29"), new DSPCharField(50, "Description for field 30"), 
            new DSPPackedField(2, 0, "Description for field 31"), new DSPCharField(50, "Description for field 32"), new DSPPackedField(2, 0, "Description for field 33"), new DSPCharField(50, "Description for field 34"), new DSPPackedField(2, 0, "Description for field 35"), new DSPCharField(50, "Description for field 36"), new DSPPackedField(2, 0, "Description for field 37"), new DSPCharField(50, "Description for field 38"), new DSPPackedField(2, 0, "Description for field 39"), new DSPCharField(50, "Description for field 40"), 
            new DSPPackedField(2, 0, "Description for field 41"), new DSPCharField(50, "Description for field 42")
        });
        addBody("59801I".toUpperCase(), fld);
    }
}
