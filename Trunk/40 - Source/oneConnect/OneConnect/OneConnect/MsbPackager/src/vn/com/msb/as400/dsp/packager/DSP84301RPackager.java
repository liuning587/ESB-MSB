// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP84301RPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP84301RPackager extends DSPPackager
{

    public DSP84301RPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPCharField(20, "Description for field 1"), new DSPPackedField(10, 0, "Description for field 2"), new DSPPackedField(10, 0, "Description for field 3"), new DSPCharField(20, "Description for field 4"), new DSPCharField(40, "Description for field 5"), new DSPCharField(1, "Description for field 6")
        });
        addBody("84301R".toUpperCase(), fld);
    }
}
