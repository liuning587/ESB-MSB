// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP88218IPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP88218IPackager extends DSPPackager
{

    public DSP88218IPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPPackedField(10, 0, "Description for field 1"), new DSPPackedField(2, 0, "Description for field 2"), new DSPCharField(1, "Description for field 3"), new DSPCharField(50, "Description for field 4")
        });
        addBody("88218I".toUpperCase(), fld);
    }
}
