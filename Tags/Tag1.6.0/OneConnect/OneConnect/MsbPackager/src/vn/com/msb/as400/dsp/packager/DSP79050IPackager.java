// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP79050IPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP79050IPackager extends DSPPackager
{

    public DSP79050IPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPPackedField(3, 0, "Description for field 1"), new DSPPackedField(10, 0, "Description for field 2"), new DSPPackedField(3, 0, "Description for field 3"), new DSPPackedField(3, 0, "Description for field 4"), new DSPCharField(4, "Description for field 5"), new DSPCharField(4, "Description for field 6"), new DSPPackedField(1, 0, "Description for field 7"), new DSPPackedField(9, 2, "Description for field 8"), new DSPPackedField(2, 0, "Description for field 9"), new DSPPackedField(9, 2, "Description for field 10"), 
            new DSPPackedField(2, 0, "Description for field 11"), new DSPPackedField(9, 2, "Description for field 12"), new DSPPackedField(2, 0, "Description for field 13"), new DSPPackedField(9, 2, "Description for field 14"), new DSPCharField(1, "Description for field 15"), new DSPCharField(10, "Description for field 16"), new DSPCharField(8, "Description for field 17"), new DSPCharField(8, "Description for field 18"), new DSPCharField(4, "Description for field 19"), new DSPCharField(4, "Description for field 20"), 
            new DSPCharField(4, "Description for field 21"), new DSPPackedField(9, 2, "Description for field 22"), new DSPPackedField(9, 2, "Description for field 23"), new DSPCharField(4, "Description for field 24"), new DSPPackedField(9, 2, "Description for field 25"), new DSPPackedField(9, 2, "Description for field 26"), new DSPCharField(4, "Description for field 27"), new DSPPackedField(9, 2, "Description for field 28"), new DSPPackedField(9, 2, "Description for field 29"), new DSPCharField(4, "Description for field 30"), 
            new DSPPackedField(9, 2, "Description for field 31"), new DSPPackedField(9, 2, "Description for field 32"), new DSPCharField(4, "Description for field 33"), new DSPPackedField(9, 2, "Description for field 34"), new DSPPackedField(9, 2, "Description for field 35"), new DSPCharField(4, "Description for field 36"), new DSPPackedField(9, 2, "Description for field 37"), new DSPPackedField(9, 2, "Description for field 38"), new DSPCharField(4, "Description for field 39"), new DSPPackedField(9, 2, "Description for field 40"), 
            new DSPPackedField(9, 2, "Description for field 41"), new DSPCharField(4, "Description for field 42"), new DSPPackedField(9, 2, "Description for field 43"), new DSPPackedField(9, 2, "Description for field 44"), new DSPCharField(4, "Description for field 45"), new DSPPackedField(9, 2, "Description for field 46"), new DSPPackedField(9, 2, "Description for field 47"), new DSPCharField(4, "Description for field 48"), new DSPPackedField(9, 2, "Description for field 49"), new DSPPackedField(9, 2, "Description for field 50"), 
            new DSPCharField(4, "Description for field 51"), new DSPPackedField(9, 2, "Description for field 52"), new DSPPackedField(9, 2, "Description for field 53"), new DSPCharField(4, "Description for field 54"), new DSPPackedField(9, 2, "Description for field 55"), new DSPPackedField(9, 2, "Description for field 56"), new DSPCharField(4, "Description for field 57"), new DSPPackedField(9, 2, "Description for field 58"), new DSPPackedField(9, 2, "Description for field 59"), new DSPCharField(4, "Description for field 60"), 
            new DSPPackedField(9, 2, "Description for field 61"), new DSPPackedField(9, 2, "Description for field 62"), new DSPCharField(4, "Description for field 63"), new DSPPackedField(9, 2, "Description for field 64"), new DSPPackedField(9, 2, "Description for field 65"), new DSPCharField(4, "Description for field 66"), new DSPPackedField(9, 2, "Description for field 67"), new DSPPackedField(9, 2, "Description for field 68"), new DSPCharField(4, "Description for field 69"), new DSPPackedField(9, 2, "Description for field 70"), 
            new DSPPackedField(9, 2, "Description for field 71"), new DSPCharField(4, "Description for field 72"), new DSPPackedField(9, 2, "Description for field 73"), new DSPPackedField(9, 2, "Description for field 74"), new DSPCharField(4, "Description for field 75"), new DSPPackedField(9, 2, "Description for field 76"), new DSPPackedField(9, 2, "Description for field 77"), new DSPCharField(4, "Description for field 78"), new DSPPackedField(9, 2, "Description for field 79"), new DSPPackedField(9, 2, "Description for field 80"), 
            new DSPCharField(4, "Description for field 81"), new DSPPackedField(9, 2, "Description for field 82"), new DSPPackedField(9, 2, "Description for field 83"), new DSPCharField(4, "Description for field 84"), new DSPPackedField(9, 2, "Description for field 85"), new DSPPackedField(9, 2, "Description for field 86"), new DSPCharField(4, "Description for field 87"), new DSPPackedField(9, 2, "Description for field 88"), new DSPPackedField(9, 2, "Description for field 89"), new DSPCharField(4, "Description for field 90"), 
            new DSPPackedField(9, 2, "Description for field 91"), new DSPPackedField(9, 2, "Description for field 92"), new DSPPackedField(9, 2, "Description for field 93"), new DSPPackedField(9, 2, "Description for field 94"), new DSPPackedField(9, 2, "Description for field 95"), new DSPPackedField(9, 2, "Description for field 96"), new DSPPackedField(9, 2, "Description for field 97"), new DSPPackedField(9, 2, "Description for field 98"), new DSPPackedField(9, 2, "Description for field 99"), new DSPPackedField(9, 2, "Description for field 100"), 
            new DSPPackedField(9, 2, "Description for field 101"), new DSPPackedField(9, 2, "Description for field 102"), new DSPPackedField(9, 2, "Description for field 103"), new DSPPackedField(9, 2, "Description for field 104"), new DSPPackedField(9, 2, "Description for field 105"), new DSPPackedField(9, 2, "Description for field 106"), new DSPPackedField(9, 2, "Description for field 107"), new DSPPackedField(9, 2, "Description for field 108"), new DSPPackedField(9, 2, "Description for field 109"), new DSPPackedField(9, 2, "Description for field 110"), 
            new DSPPackedField(9, 2, "Description for field 111"), new DSPPackedField(9, 2, "Description for field 112"), new DSPPackedField(9, 2, "Description for field 113"), new DSPPackedField(9, 2, "Description for field 114"), new DSPPackedField(9, 2, "Description for field 115"), new DSPPackedField(9, 2, "Description for field 116"), new DSPCharField(9, "Description for field 117"), new DSPPackedField(9, 2, "Description for field 118"), new DSPCharField(9, "Description for field 119"), new DSPPackedField(9, 2, "Description for field 120"), 
            new DSPCharField(9, "Description for field 121"), new DSPPackedField(9, 2, "Description for field 122"), new DSPCharField(9, "Description for field 123"), new DSPPackedField(9, 2, "Description for field 124"), new DSPCharField(9, "Description for field 125"), new DSPPackedField(9, 2, "Description for field 126"), new DSPCharField(9, "Description for field 127"), new DSPPackedField(9, 2, "Description for field 128"), new DSPCharField(9, "Description for field 129"), new DSPPackedField(9, 2, "Description for field 130"), 
            new DSPCharField(9, "Description for field 131"), new DSPPackedField(9, 2, "Description for field 132"), new DSPCharField(9, "Description for field 133"), new DSPPackedField(9, 2, "Description for field 134"), new DSPCharField(9, "Description for field 135"), new DSPPackedField(9, 2, "Description for field 136"), new DSPCharField(9, "Description for field 137"), new DSPPackedField(9, 2, "Description for field 138"), new DSPCharField(9, "Description for field 139"), new DSPPackedField(9, 2, "Description for field 140"), 
            new DSPCharField(9, "Description for field 141"), new DSPPackedField(9, 2, "Description for field 142"), new DSPCharField(9, "Description for field 143"), new DSPPackedField(9, 2, "Description for field 144"), new DSPCharField(9, "Description for field 145"), new DSPPackedField(9, 2, "Description for field 146"), new DSPCharField(9, "Description for field 147"), new DSPPackedField(9, 2, "Description for field 148"), new DSPCharField(9, "Description for field 149"), new DSPPackedField(9, 2, "Description for field 150"), 
            new DSPCharField(9, "Description for field 151"), new DSPPackedField(9, 2, "Description for field 152"), new DSPCharField(9, "Description for field 153"), new DSPPackedField(9, 2, "Description for field 154"), new DSPCharField(9, "Description for field 155"), new DSPPackedField(9, 2, "Description for field 156")
        });
        addBody("79050I".toUpperCase(), fld);
    }
}
