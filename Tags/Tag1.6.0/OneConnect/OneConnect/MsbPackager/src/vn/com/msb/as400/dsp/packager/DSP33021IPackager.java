// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP33021IPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP33021IPackager extends DSPPackager
{

    public DSP33021IPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPPackedField(4, 0, "Description for field 1"), new DSPPackedField(4, 0, "Description for field 2"), new DSPPackedField(8, 2, "Description for field 3"), new DSPCharField(1, "Description for field 4"), new DSPCharField(1, "Description for field 5"), new DSPCharField(1, "Description for field 6")
        });
        addBody("33021I".toUpperCase(), fld);
    }
}