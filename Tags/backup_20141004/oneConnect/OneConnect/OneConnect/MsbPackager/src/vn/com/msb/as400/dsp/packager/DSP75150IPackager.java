// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP75150IPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP75150IPackager extends DSPPackager
{

    public DSP75150IPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPPackedField(3, 0, "Description for field 1"), new DSPPackedField(2, 0, "Description for field 2"), new DSPPackedField(5, 0, "Description for field 3")
        });
        addBody("75150I".toUpperCase(), fld);
    }
}
