// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP87319RPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP87319RPackager extends DSPPackager
{

    public DSP87319RPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPPackedField(10, 0, "Description for field 1"), new DSPCharField(3, "Description for field 2"), new DSPPackedField(10, 0, "Description for field 3"), new DSPCharField(5, "Description for field 4"), new DSPCharField(3, "Description for field 5"), new DSPPackedField(6, 9, "Description for field 6"), new DSPCharField(20, "Description for field 7"), new DSPPackedField(6, 9, "Description for field 8")
        });
        addBody("87319R".toUpperCase(), fld);
    }
}
