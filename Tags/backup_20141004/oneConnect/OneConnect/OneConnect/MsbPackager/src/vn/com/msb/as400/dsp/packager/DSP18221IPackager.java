// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP18221IPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP18221IPackager extends DSPPackager
{

    public DSP18221IPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPCharField(40, "Description for field 1"), new DSPCharField(1, "Description for field 2"), new DSPCharField(2, "Description for field 3"), new DSPCharField(2, "Description for field 4"), new DSPCharField(3, "Description for field 5"), new DSPCharField(3, "Description for field 6"), new DSPCharField(40, "Description for field 7"), new DSPCharField(40, "Description for field 8"), new DSPCharField(40, "Description for field 9"), new DSPPackedField(3, 0, "Description for field 10"), 
            new DSPPackedField(4, 0, "Description for field 11"), new DSPPackedField(4, 0, "Description for field 12"), new DSPPackedField(4, 0, "Description for field 13"), new DSPPackedField(10, 0, "Description for field 14"), new DSPCharField(1, "Description for field 15"), new DSPPackedField(10, 0, "Description for field 16"), new DSPCharField(4, "Description for field 17"), new DSPPackedField(5, 0, "Description for field 18"), new DSPPackedField(4, 0, "Description for field 19"), new DSPCharField(40, "Description for field 20"), 
            new DSPCharField(40, "Description for field 21"), new DSPCharField(50, "Description for field 22"), new DSPCharField(50, "Description for field 23"), new DSPCharField(50, "Description for field 24"), new DSPCharField(40, "Description for field 25"), new DSPCharField(40, "Description for field 26"), new DSPCharField(40, "Description for field 27"), new DSPCharField(20, "Description for field 28"), new DSPCharField(10, "Description for field 29"), new DSPCharField(10, "Description for field 30"), 
            new DSPPackedField(4, 0, "Description for field 31"), new DSPCharField(10, "Description for field 32"), new DSPPackedField(4, 0, "Description for field 33"), new DSPPackedField(4, 0, "Description for field 34"), new DSPCharField(1, "Description for field 35")
        });
        addBody("18221I".toUpperCase(), fld);
    }
}
