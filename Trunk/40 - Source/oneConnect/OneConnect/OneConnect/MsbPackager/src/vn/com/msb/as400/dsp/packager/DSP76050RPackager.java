// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP76050RPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP76050RPackager extends DSPPackager
{

    public DSP76050RPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
            new DSPPackedField(3, 0, "Description for field 1"), new DSPPackedField(10, 0, "Description for field 2"), new DSPPackedField(3, 0, "Description for field 3"), new DSPPackedField(3, 0, "Description for field 4"), new DSPCharField(4, "Description for field 5"), new DSPCharField(4, "Description for field 6"), new DSPCharField(20, "Description for field 7"), new DSPCharField(1, "Description for field 8"), new DSPCharField(8, "Description for field 9"), new DSPCharField(1, "Description for field 10"), 
            new DSPCharField(1, "Description for field 11"), new DSPCharField(1, "Description for field 12"), new DSPPackedField(3, 0, "Description for field 13"), new DSPPackedField(10, 0, "Description for field 14"), new DSPCharField(4, "Description for field 15"), new DSPCharField(8, "Description for field 16"), new DSPPackedField(9, 2, "Description for field 17"), new DSPCharField(2, "Description for field 18"), new DSPPackedField(9, 2, "Description for field 19"), new DSPCharField(2, "Description for field 20"), 
            new DSPPackedField(9, 2, "Description for field 21"), new DSPCharField(2, "Description for field 22"), new DSPPackedField(9, 2, "Description for field 23"), new DSPCharField(2, "Description for field 24"), new DSPPackedField(9, 2, "Description for field 25"), new DSPCharField(2, "Description for field 26"), new DSPPackedField(9, 2, "Description for field 27"), new DSPCharField(2, "Description for field 28"), new DSPPackedField(9, 2, "Description for field 29"), new DSPCharField(2, "Description for field 30"), 
            new DSPPackedField(9, 2, "Description for field 31"), new DSPCharField(2, "Description for field 32"), new DSPPackedField(9, 2, "Description for field 33"), new DSPCharField(2, "Description for field 34"), new DSPPackedField(1, 0, "Description for field 35"), new DSPPackedField(9, 2, "Description for field 36"), new DSPPackedField(9, 2, "Description for field 37"), new DSPCharField(2, "Description for field 38"), new DSPPackedField(2, 0, "Description for field 39"), new DSPPackedField(9, 2, "Description for field 40"), 
            new DSPPackedField(2, 0, "Description for field 41"), new DSPPackedField(9, 2, "Description for field 42"), new DSPPackedField(2, 0, "Description for field 43"), new DSPPackedField(9, 2, "Description for field 44"), new DSPPackedField(9, 2, "Description for field 45"), new DSPPackedField(9, 2, "Description for field 46"), new DSPPackedField(9, 2, "Description for field 47"), new DSPPackedField(9, 2, "Description for field 48"), new DSPPackedField(9, 2, "Description for field 49"), new DSPPackedField(9, 2, "Description for field 50"), 
            new DSPPackedField(9, 2, "Description for field 51"), new DSPPackedField(9, 2, "Description for field 52"), new DSPPackedField(9, 2, "Description for field 53"), new DSPPackedField(9, 2, "Description for field 54"), new DSPPackedField(9, 2, "Description for field 55"), new DSPPackedField(9, 2, "Description for field 56"), new DSPPackedField(9, 2, "Description for field 57"), new DSPPackedField(9, 2, "Description for field 58"), new DSPPackedField(9, 2, "Description for field 59"), new DSPPackedField(9, 2, "Description for field 60"), 
            new DSPPackedField(9, 2, "Description for field 61"), new DSPPackedField(9, 2, "Description for field 62"), new DSPPackedField(9, 2, "Description for field 63"), new DSPPackedField(9, 2, "Description for field 64"), new DSPPackedField(9, 2, "Description for field 65"), new DSPPackedField(9, 2, "Description for field 66"), new DSPPackedField(9, 2, "Description for field 67"), new DSPPackedField(9, 2, "Description for field 68"), new DSPPackedField(9, 2, "Description for field 69"), new DSPPackedField(9, 2, "Description for field 70"), 
            new DSPPackedField(9, 2, "Description for field 71"), new DSPPackedField(9, 2, "Description for field 72"), new DSPPackedField(9, 2, "Description for field 73"), new DSPPackedField(9, 2, "Description for field 74"), new DSPPackedField(9, 2, "Description for field 75"), new DSPPackedField(9, 2, "Description for field 76"), new DSPPackedField(9, 2, "Description for field 77"), new DSPPackedField(9, 2, "Description for field 78"), new DSPPackedField(9, 2, "Description for field 79"), new DSPPackedField(9, 2, "Description for field 80"), 
            new DSPPackedField(9, 2, "Description for field 81"), new DSPPackedField(9, 2, "Description for field 82"), new DSPPackedField(9, 2, "Description for field 83"), new DSPPackedField(9, 2, "Description for field 84"), new DSPPackedField(9, 2, "Description for field 85"), new DSPPackedField(9, 2, "Description for field 86"), new DSPPackedField(9, 2, "Description for field 87"), new DSPPackedField(9, 2, "Description for field 88"), new DSPPackedField(9, 2, "Description for field 89"), new DSPPackedField(9, 2, "Description for field 90"), 
            new DSPPackedField(9, 2, "Description for field 91"), new DSPPackedField(9, 2, "Description for field 92"), new DSPPackedField(9, 2, "Description for field 93"), new DSPPackedField(9, 2, "Description for field 94"), new DSPPackedField(9, 2, "Description for field 95"), new DSPPackedField(9, 2, "Description for field 96"), new DSPPackedField(9, 2, "Description for field 97"), new DSPPackedField(9, 2, "Description for field 98"), new DSPPackedField(9, 2, "Description for field 99"), new DSPPackedField(9, 2, "Description for field 100"), 
            new DSPPackedField(9, 2, "Description for field 101"), new DSPPackedField(9, 2, "Description for field 102"), new DSPPackedField(9, 2, "Description for field 103"), new DSPPackedField(9, 2, "Description for field 104"), new DSPPackedField(9, 2, "Description for field 105"), new DSPPackedField(9, 2, "Description for field 106"), new DSPPackedField(9, 2, "Description for field 107"), new DSPPackedField(9, 2, "Description for field 108"), new DSPPackedField(9, 2, "Description for field 109"), new DSPPackedField(9, 2, "Description for field 110"), 
            new DSPPackedField(9, 2, "Description for field 111"), new DSPPackedField(9, 2, "Description for field 112"), new DSPPackedField(9, 2, "Description for field 113"), new DSPPackedField(9, 2, "Description for field 114"), new DSPPackedField(9, 2, "Description for field 115"), new DSPPackedField(9, 2, "Description for field 116"), new DSPCharField(1, "Description for field 117"), new DSPCharField(10, "Description for field 118"), new DSPCharField(8, "Description for field 119"), new DSPCharField(8, "Description for field 120"), 
            new DSPCharField(4, "Description for field 121"), new DSPCharField(4, "Description for field 122"), new DSPPackedField(9, 2, "Description for field 123"), new DSPCharField(2, "Description for field 124"), new DSPPackedField(9, 2, "Description for field 125"), new DSPCharField(2, "Description for field 126"), new DSPPackedField(4, 0, "Description for field 127"), new DSPPackedField(3, 0, "Description for field 128"), new DSPPackedField(3, 0, "Description for field 129"), new DSPPackedField(3, 0, "Description for field 130"), 
            new DSPPackedField(3, 0, "Description for field 131"), new DSPPackedField(9, 2, "Description for field 132"), new DSPCharField(2, "Description for field 133"), new DSPPackedField(9, 2, "Description for field 134"), new DSPCharField(2, "Description for field 135"), new DSPPackedField(9, 2, "Description for field 136"), new DSPCharField(2, "Description for field 137"), new DSPPackedField(9, 2, "Description for field 138"), new DSPCharField(2, "Description for field 139"), new DSPPackedField(3, 0, "Description for field 140"), 
            new DSPPackedField(3, 0, "Description for field 141"), new DSPPackedField(3, 0, "Description for field 142"), new DSPPackedField(3, 0, "Description for field 143"), new DSPPackedField(9, 2, "Description for field 144"), new DSPCharField(2, "Description for field 145"), new DSPPackedField(9, 2, "Description for field 146"), new DSPCharField(2, "Description for field 147"), new DSPPackedField(9, 2, "Description for field 148"), new DSPCharField(2, "Description for field 149"), new DSPPackedField(9, 2, "Description for field 150"), 
            new DSPCharField(2, "Description for field 151"), new DSPCharField(2, "Description for field 152"), new DSPCharField(2, "Description for field 153"), new DSPCharField(2, "Description for field 154"), new DSPCharField(2, "Description for field 155"), new DSPCharField(2, "Description for field 156"), new DSPCharField(2, "Description for field 157"), new DSPCharField(2, "Description for field 158"), new DSPCharField(2, "Description for field 159"), new DSPCharField(2, "Description for field 160"), 
            new DSPCharField(2, "Description for field 161"), new DSPCharField(2, "Description for field 162"), new DSPCharField(2, "Description for field 163"), new DSPCharField(2, "Description for field 164"), new DSPCharField(2, "Description for field 165"), new DSPCharField(2, "Description for field 166"), new DSPCharField(2, "Description for field 167"), new DSPCharField(2, "Description for field 168"), new DSPCharField(2, "Description for field 169"), new DSPCharField(2, "Description for field 170"), 
            new DSPCharField(2, "Description for field 171"), new DSPCharField(2, "Description for field 172"), new DSPCharField(2, "Description for field 173"), new DSPCharField(2, "Description for field 174"), new DSPCharField(2, "Description for field 175"), new DSPCharField(2, "Description for field 176"), new DSPCharField(2, "Description for field 177"), new DSPCharField(2, "Description for field 178"), new DSPCharField(2, "Description for field 179"), new DSPCharField(2, "Description for field 180"), 
            new DSPCharField(2, "Description for field 181"), new DSPCharField(2, "Description for field 182"), new DSPCharField(2, "Description for field 183"), new DSPCharField(2, "Description for field 184"), new DSPCharField(2, "Description for field 185"), new DSPCharField(2, "Description for field 186"), new DSPCharField(2, "Description for field 187"), new DSPCharField(2, "Description for field 188"), new DSPCharField(2, "Description for field 189"), new DSPCharField(2, "Description for field 190"), 
            new DSPCharField(2, "Description for field 191"), new DSPCharField(2, "Description for field 192"), new DSPCharField(2, "Description for field 193"), new DSPCharField(2, "Description for field 194"), new DSPCharField(2, "Description for field 195"), new DSPCharField(2, "Description for field 196"), new DSPCharField(2, "Description for field 197"), new DSPCharField(2, "Description for field 198"), new DSPCharField(2, "Description for field 199"), new DSPPackedField(9, 2, "Description for field 200"), 
            new DSPCharField(2, "Description for field 201"), new DSPPackedField(9, 2, "Description for field 202"), new DSPCharField(2, "Description for field 203"), new DSPPackedField(9, 2, "Description for field 204"), new DSPCharField(2, "Description for field 205"), new DSPPackedField(9, 2, "Description for field 206"), new DSPCharField(2, "Description for field 207"), new DSPPackedField(9, 2, "Description for field 208"), new DSPCharField(2, "Description for field 209"), new DSPPackedField(9, 2, "Description for field 210"), 
            new DSPCharField(2, "Description for field 211"), new DSPPackedField(9, 2, "Description for field 212"), new DSPCharField(2, "Description for field 213"), new DSPPackedField(9, 2, "Description for field 214"), new DSPCharField(2, "Description for field 215"), new DSPPackedField(9, 2, "Description for field 216"), new DSPCharField(2, "Description for field 217"), new DSPPackedField(9, 2, "Description for field 218"), new DSPCharField(2, "Description for field 219"), new DSPPackedField(9, 2, "Description for field 220"), 
            new DSPCharField(2, "Description for field 221"), new DSPPackedField(9, 2, "Description for field 222"), new DSPCharField(2, "Description for field 223"), new DSPPackedField(9, 2, "Description for field 224"), new DSPCharField(2, "Description for field 225"), new DSPPackedField(9, 2, "Description for field 226"), new DSPCharField(2, "Description for field 227"), new DSPPackedField(9, 2, "Description for field 228"), new DSPCharField(2, "Description for field 229"), new DSPPackedField(9, 2, "Description for field 230"), 
            new DSPCharField(2, "Description for field 231"), new DSPPackedField(9, 2, "Description for field 232"), new DSPCharField(2, "Description for field 233"), new DSPPackedField(9, 2, "Description for field 234"), new DSPCharField(2, "Description for field 235"), new DSPPackedField(9, 2, "Description for field 236"), new DSPCharField(2, "Description for field 237"), new DSPPackedField(9, 2, "Description for field 238"), new DSPCharField(2, "Description for field 239"), new DSPPackedField(9, 2, "Description for field 240"), 
            new DSPPackedField(9, 2, "Description for field 241"), new DSPPackedField(9, 2, "Description for field 242"), new DSPPackedField(9, 2, "Description for field 243"), new DSPPackedField(9, 2, "Description for field 244"), new DSPPackedField(9, 2, "Description for field 245"), new DSPPackedField(9, 2, "Description for field 246"), new DSPPackedField(9, 2, "Description for field 247"), new DSPPackedField(9, 2, "Description for field 248"), new DSPPackedField(9, 2, "Description for field 249"), new DSPPackedField(9, 2, "Description for field 250"), 
            new DSPPackedField(9, 2, "Description for field 251"), new DSPPackedField(9, 2, "Description for field 252"), new DSPPackedField(9, 2, "Description for field 253"), new DSPPackedField(9, 2, "Description for field 1"), new DSPPackedField(9, 2, "Description for field 2"), new DSPPackedField(9, 2, "Description for field 3"), new DSPPackedField(9, 2, "Description for field 4"), new DSPPackedField(9, 2, "Description for field 5"), new DSPPackedField(9, 2, "Description for field 6"), new DSPPackedField(9, 2, "Description for field 7"), 
            new DSPPackedField(9, 2, "Description for field 8"), new DSPPackedField(9, 2, "Description for field 9"), new DSPPackedField(9, 2, "Description for field 10"), new DSPPackedField(9, 2, "Description for field 11"), new DSPPackedField(9, 2, "Description for field 12"), new DSPPackedField(9, 2, "Description for field 13"), new DSPPackedField(9, 2, "Description for field 14"), new DSPPackedField(9, 2, "Description for field 15"), new DSPPackedField(9, 2, "Description for field 16"), new DSPPackedField(9, 2, "Description for field 17"), 
            new DSPPackedField(9, 2, "Description for field 18"), new DSPPackedField(9, 2, "Description for field 19"), new DSPPackedField(9, 2, "Description for field 20"), new DSPPackedField(9, 2, "Description for field 21"), new DSPPackedField(9, 2, "Description for field 22"), new DSPPackedField(9, 2, "Description for field 23"), new DSPPackedField(9, 2, "Description for field 24"), new DSPPackedField(9, 2, "Description for field 25"), new DSPPackedField(9, 2, "Description for field 26"), new DSPPackedField(9, 2, "Description for field 27"), 
            new DSPPackedField(9, 2, "Description for field 28"), new DSPPackedField(9, 2, "Description for field 29"), new DSPPackedField(9, 2, "Description for field 30"), new DSPPackedField(9, 2, "Description for field 31"), new DSPPackedField(9, 2, "Description for field 32"), new DSPPackedField(9, 2, "Description for field 33"), new DSPPackedField(9, 2, "Description for field 34"), new DSPPackedField(3, 0, "Description for field 35"), new DSPPackedField(3, 0, "Description for field 36"), new DSPPackedField(3, 0, "Description for field 37"), 
            new DSPPackedField(3, 0, "Description for field 38"), new DSPPackedField(3, 0, "Description for field 39"), new DSPPackedField(3, 0, "Description for field 40"), new DSPPackedField(3, 0, "Description for field 41"), new DSPPackedField(3, 0, "Description for field 42"), new DSPPackedField(3, 0, "Description for field 43"), new DSPPackedField(3, 0, "Description for field 44"), new DSPPackedField(3, 0, "Description for field 45"), new DSPPackedField(3, 0, "Description for field 46"), new DSPPackedField(3, 0, "Description for field 47"), 
            new DSPPackedField(3, 0, "Description for field 48"), new DSPPackedField(3, 0, "Description for field 49"), new DSPPackedField(3, 0, "Description for field 50"), new DSPPackedField(3, 0, "Description for field 51"), new DSPPackedField(3, 0, "Description for field 52"), new DSPPackedField(3, 0, "Description for field 53"), new DSPPackedField(3, 0, "Description for field 54"), new DSPPackedField(3, 0, "Description for field 55"), new DSPPackedField(3, 0, "Description for field 56"), new DSPPackedField(3, 0, "Description for field 57"), 
            new DSPPackedField(3, 0, "Description for field 58"), new DSPCharField(9, "Description for field 59"), new DSPCharField(9, "Description for field 60"), new DSPCharField(9, "Description for field 61"), new DSPCharField(9, "Description for field 62"), new DSPCharField(9, "Description for field 63"), new DSPCharField(9, "Description for field 64"), new DSPCharField(9, "Description for field 65"), new DSPCharField(9, "Description for field 66"), new DSPCharField(9, "Description for field 67"), 
            new DSPCharField(9, "Description for field 68"), new DSPCharField(9, "Description for field 69"), new DSPCharField(9, "Description for field 70"), new DSPCharField(9, "Description for field 71"), new DSPCharField(9, "Description for field 72"), new DSPCharField(9, "Description for field 73"), new DSPCharField(9, "Description for field 74"), new DSPCharField(9, "Description for field 75"), new DSPCharField(9, "Description for field 76"), new DSPCharField(9, "Description for field 77"), 
            new DSPCharField(9, "Description for field 78"), new DSPCharField(9, "Description for field 79"), new DSPCharField(9, "Description for field 80"), new DSPCharField(9, "Description for field 81"), new DSPCharField(9, "Description for field 82"), new DSPCharField(9, "Description for field 83"), new DSPCharField(9, "Description for field 84"), new DSPCharField(9, "Description for field 85"), new DSPCharField(9, "Description for field 86"), new DSPCharField(9, "Description for field 87"), 
            new DSPCharField(9, "Description for field 88"), new DSPCharField(9, "Description for field 89"), new DSPCharField(9, "Description for field 90"), new DSPCharField(9, "Description for field 91"), new DSPCharField(9, "Description for field 92"), new DSPCharField(9, "Description for field 93"), new DSPCharField(9, "Description for field 94"), new DSPCharField(9, "Description for field 95"), new DSPCharField(9, "Description for field 96"), new DSPCharField(9, "Description for field 97"), 
            new DSPCharField(9, "Description for field 98"), new DSPCharField(9, "Description for field 99"), new DSPCharField(9, "Description for field 100"), new DSPCharField(9, "Description for field 101"), new DSPCharField(9, "Description for field 102")
        });
        addBody("76050R".toUpperCase(), fld);
    }
}