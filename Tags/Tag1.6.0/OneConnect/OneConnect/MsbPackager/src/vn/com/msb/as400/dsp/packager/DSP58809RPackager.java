// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP58809RPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP58809RPackager extends DSPPackager
{

    public DSP58809RPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPCharField(20, "Description for field 1"), new DSPPackedField(2, 0, "Description for field 2"), new DSPCharField(2, "Description for field 3"), new DSPCharField(40, "Description for field 4"), new DSPPackedField(4, 0, "Description for field 5"), new DSPPackedField(8, 2, "Description for field 6"), new DSPCharField(4, "Description for field 7"), new DSPCharField(40, "Description for field 8"), new DSPCharField(3, "Description for field 9"), new DSPPackedField(4, 0, "Description for field 10"), 
            new DSPCharField(50, "Description for field 11"), new DSPPackedField(2, 0, "Description for field 12")
        });
        addBody("58809R".toUpperCase(), fld);
    }
}
