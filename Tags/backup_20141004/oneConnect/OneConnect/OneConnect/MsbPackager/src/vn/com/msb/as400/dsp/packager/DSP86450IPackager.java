// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP86450IPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP86450IPackager extends DSPPackager
{

    public DSP86450IPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPPackedField(10, 0, "Description for field 1"), new DSPCharField(1, "Description for field 2"), new DSPPackedField(10, 0, "Description for field 3"), new DSPCharField(3, "Description for field 4"), new DSPPackedField(10, 0, "Description for field 5")
        });
        addBody("86450I".toUpperCase(), fld);
    }
}