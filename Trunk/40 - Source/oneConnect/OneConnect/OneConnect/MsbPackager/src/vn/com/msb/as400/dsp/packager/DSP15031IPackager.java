// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP15031IPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP15031IPackager extends DSPPackager
{

    public DSP15031IPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPCharField(6, "Description for field 1")
        });
        addBody("15031I".toUpperCase(), fld);
    }
}
