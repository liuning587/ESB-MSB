// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP33999RPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP33999RPackager extends DSPPackager
{

    public DSP33999RPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPCharField(8, "Description for field 1"), new DSPCharField(1, "Description for field 2"), new DSPCharField(20, "Description for field 3")
        });
        addBody("33999R".toUpperCase(), fld);
    }
}