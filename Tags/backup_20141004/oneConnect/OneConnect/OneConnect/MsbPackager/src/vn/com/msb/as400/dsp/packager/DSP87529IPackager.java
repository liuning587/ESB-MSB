// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP87529IPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP87529IPackager extends DSPPackager
{

    public DSP87529IPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPPackedField(3, 0, "Description for field 1"), new DSPCharField(4, "Description for field 2"), new DSPPackedField(6, 9, "Description for field 3"), new DSPPackedField(6, 9, "Description for field 4"), new DSPPackedField(4, 0, "Description for field 5")
        });
        addBody("87529I".toUpperCase(), fld);
    }
}