// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP86020RPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP86020RPackager extends DSPPackager
{

    public DSP86020RPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPCharField(10, "Description for field 1"), new DSPCharField(10, "Description for field 2"), new DSPCharField(4, "Description for field 3"), new DSPCharField(1, "Description for field 4"), new DSPPackedField(2, 0, "Description for field 5"), new DSPCharField(1, "Description for field 6"), new DSPCharField(1, "Description for field 7"), new DSPCharField(2, "Description for field 8"), new DSPCharField(1, "Description for field 9"), new DSPCharField(1, "Description for field 10"), 
            new DSPCharField(1, "Description for field 11"), new DSPCharField(1, "Description for field 12"), new DSPCharField(1, "Description for field 13"), new DSPCharField(50, "Description for field 14"), new DSPCharField(1, "Description for field 15"), new DSPCharField(1, "Description for field 16"), new DSPCharField(2, "Description for field 17"), new DSPPackedField(6, 9, "Description for field 18"), new DSPPackedField(6, 9, "Description for field 19"), new DSPCharField(1, "Description for field 20"), 
            new DSPCharField(1, "Description for field 21"), new DSPCharField(5, "Description for field 22")
        });
        addBody("86020R".toUpperCase(), fld);
    }
}
