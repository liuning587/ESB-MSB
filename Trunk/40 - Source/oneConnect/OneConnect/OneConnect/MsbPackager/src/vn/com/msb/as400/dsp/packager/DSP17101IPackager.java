// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP17101IPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP17101IPackager extends DSPPackager
{

    public DSP17101IPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPCharField(40, "Description for field 1"), new DSPCharField(40, "Description for field 2"), new DSPCharField(10, "Description for field 3"), new DSPPackedField(3, 0, "Description for field 4"), new DSPCharField(10, "Description for field 5"), new DSPPackedField(4, 0, "Description for field 6")
        });
        addBody("17101I".toUpperCase(), fld);
    }
}
