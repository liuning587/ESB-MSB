// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP56632RPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP56632RPackager extends DSPPackager
{

    public DSP56632RPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPPackedField(3, 0, "Description for field 1"), new DSPCharField(16, "Description for field 2"), new DSPCharField(4, "Description for field 3"), new DSPCharField(10, "Description for field 4"), new DSPCharField(2, "Description for field 5"), new DSPPackedField(3, 0, "Description for field 6"), new DSPPackedField(4, 0, "Description for field 7"), new DSPPackedField(9, 2, "Description for field 8"), new DSPPackedField(5, 0, "Description for field 9"), new DSPCharField(16, "Description for field 10"), 
            new DSPPackedField(4, 0, "Description for field 11"), new DSPCharField(1, "Description for field 12"), new DSPPackedField(9, 2, "Description for field 13"), new DSPCharField(1, "Description for field 14"), new DSPPackedField(9, 2, "Description for field 15"), new DSPCharField(4, "Description for field 16"), new DSPPackedField(9, 2, "Description for field 17"), new DSPCharField(10, "Description for field 18")
        });
        addBody("56632R".toUpperCase(), fld);
    }
}
