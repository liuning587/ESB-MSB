// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP33019IPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP33019IPackager extends DSPPackager
{

    public DSP33019IPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPPackedField(2, 0, "Description for field 1"), new DSPCharField(1, "Description for field 2")
        });
        addBody("33019I".toUpperCase(), fld);
    }
}
