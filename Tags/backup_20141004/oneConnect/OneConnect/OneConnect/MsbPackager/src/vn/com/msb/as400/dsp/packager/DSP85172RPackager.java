// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP85172RPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP85172RPackager extends DSPPackager
{

    public DSP85172RPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPPackedField(5, 0, "Description for field 1"), new DSPPackedField(5, 0, "Description for field 2"), new DSPPackedField(8, 2, "Description for field 3"), new DSPPackedField(6, 9, "Description for field 4"), new DSPPackedField(8, 2, "Description for field 5"), new DSPCharField(3, "Description for field 6"), new DSPPackedField(8, 2, "Description for field 7")
        });
        addBody("85172R".toUpperCase(), fld);
    }
}
