// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP19321IPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP19321IPackager extends DSPPackager
{

    public DSP19321IPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPPackedField(10, 0, "Description for field 1"), new DSPPackedField(6, 0, "Description for field 2"), new DSPPackedField(10, 0, "Description for field 3"), new DSPPackedField(10, 0, "Description for field 4"), new DSPPackedField(2, 0, "Description for field 5"), new DSPCharField(2, "Description for field 6"), new DSPPackedField(6, 9, "Description for field 7")
        });
        addBody("19321I".toUpperCase(), fld);
    }
}
