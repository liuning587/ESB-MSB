// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP58631IPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP58631IPackager extends DSPPackager
{

    public DSP58631IPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPPackedField(3, 0, "Description for field 1"), new DSPCharField(16, "Description for field 2"), new DSPCharField(4, "Description for field 3")
        });
        addBody("58631I".toUpperCase(), fld);
    }
}
