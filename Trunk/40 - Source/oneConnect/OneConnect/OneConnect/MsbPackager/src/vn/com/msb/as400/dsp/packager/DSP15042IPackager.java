// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP15042IPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP15042IPackager extends DSPPackager
{

    public DSP15042IPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPPackedField(10, 0, "Description for field 1"), new DSPCharField(12, "Description for field 2"), new DSPCharField(1, "Description for field 3"), new DSPCharField(19, "Description for field 4")
        });
        addBody("15042I".toUpperCase(), fld);
    }
}
