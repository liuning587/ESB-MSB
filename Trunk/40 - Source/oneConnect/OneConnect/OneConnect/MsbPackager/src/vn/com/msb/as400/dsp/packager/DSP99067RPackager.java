// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP99Packager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP99067RPackager extends DSPPackager
{

    public DSP99067RPackager()
    {
    }

    public void declare()
    {
        DSPField fld[] = null;
        fld = (new DSPField[] {
        		new DSPCharField(100,"Description for field 3"),
        		new DSPCharField(20,"Description for field 4"),
        		new DSPCharField(1,"Description for field 5"),
        		new DSPCharField(20,"Description for field 6"),
        		new DSPCharField(4,"Description for field 7"),
        		new DSPNumericField(8,"Description for field 8"),
        		new DSPNumericField(4,"Description for field 9"),
        		new DSPCharField(1,"Description for field 10"),
        		new DSPCharField(1,"Description for field 11"),
        		new DSPCharField(1,"Description for field 12"),
        		new DSPCharField(4,"Description for field 13"),
        		new DSPCharField(2,"Description for field 14"),
        		new DSPCharField(3,"Description for field 15"),
        		new DSPCharField(2,"Description for field 16"),
        		new DSPNumericField(2,"Description for field 17"),
        		new DSPCharField(2,"Description for field 18"),
        		new DSPCharField(8,"Description for field 19"),
        		new DSPCharField(4,"Description for field 20"),
        		new DSPCharField(8,"Description for field 21"),
        		new DSPCharField(4,"Description for field 22"),
        		new DSPCharField(8,"Description for field 23"),
        		new DSPCharField(4,"Description for field 24"),
        		new DSPCharField(8,"Description for field 25"),
        		new DSPCharField(4,"Description for field 26"),
        		new DSPNumericField(19,"Description for field 27"),
        		new DSPCharField(1,"Description for field 28"),
        		new DSPCharField(1,"Description for field 29"),
        		new DSPCharField(4,"Description for field 30"),
        		new DSPNumericField(5,"Description for field 31"),
        		new DSPNumericField(2,"Description for field 32"),
        		new DSPNumericField(19,"Description for field 33"),
        		new DSPCharField(1,"Description for field 34"),
        		new DSPCharField(1,"Description for field 35"),
        		new DSPCharField(4,"Description for field 36"),
        		new DSPNumericField(5,"Description for field 37"),
        		new DSPNumericField(2,"Description for field 38"),
        		new DSPNumericField(19,"Description for field 39"),
        		new DSPCharField(1,"Description for field 40"),
        		new DSPCharField(1,"Description for field 41"),
        		new DSPCharField(4,"Description for field 42"),
        		new DSPNumericField(5,"Description for field 43"),
        		new DSPNumericField(2,"Description for field 44"),
        		new DSPNumericField(19,"Description for field 45"),
        		new DSPCharField(1,"Description for field 46"),
        		new DSPCharField(1,"Description for field 47"),
        		new DSPCharField(4,"Description for field 48"),
        		new DSPNumericField(5,"Description for field 49"),
        		new DSPNumericField(2,"Description for field 50"),
        		new DSPNumericField(19,"Description for field 51"),
        		new DSPCharField(1,"Description for field 52"),
        		new DSPCharField(1,"Description for field 53"),
        		new DSPCharField(4,"Description for field 54"),
        		new DSPNumericField(5,"Description for field 55"),
        		new DSPNumericField(2,"Description for field 56"),
        		new DSPNumericField(19,"Description for field 57"),
        		new DSPCharField(1,"Description for field 58"),
        		new DSPCharField(1,"Description for field 59"),
        		new DSPCharField(4,"Description for field 60"),
        		new DSPNumericField(5,"Description for field 61"),
        		new DSPNumericField(2,"Description for field 62"),
        		new DSPNumericField(19,"Description for field 63"),
        		new DSPCharField(1,"Description for field 64"),
        		new DSPCharField(1,"Description for field 65"),
        		new DSPCharField(4,"Description for field 66"),
        		new DSPNumericField(5,"Description for field 67"),
        		new DSPNumericField(2,"Description for field 68"),
        		new DSPNumericField(19,"Description for field 69"),
        		new DSPCharField(1,"Description for field 70"),
        		new DSPCharField(1,"Description for field 71"),
        		new DSPCharField(4,"Description for field 72"),
        		new DSPNumericField(5,"Description for field 73"),
        		new DSPNumericField(2,"Description for field 74"),
        		new DSPNumericField(19,"Description for field 75"),
        		new DSPCharField(1,"Description for field 76"),
        		new DSPCharField(1,"Description for field 77"),
        		new DSPCharField(4,"Description for field 78"),
        		new DSPNumericField(5,"Description for field 79"),
        		new DSPNumericField(2,"Description for field 80"),
        		new DSPNumericField(19,"Description for field 81"),
        		new DSPCharField(1,"Description for field 82"),
        		new DSPCharField(1,"Description for field 83"),
        		new DSPCharField(4,"Description for field 84"),
        		new DSPNumericField(5,"Description for field 85"),
        		new DSPNumericField(2,"Description for field 86"),
        		new DSPNumericField(19,"Description for field 87"),
        		new DSPCharField(1,"Description for field 88"),
        		new DSPCharField(1,"Description for field 89"),
        		new DSPCharField(4,"Description for field 90"),
        		new DSPNumericField(5,"Description for field 91"),
        		new DSPNumericField(2,"Description for field 92"),
        		new DSPNumericField(19,"Description for field 93"),
        		new DSPCharField(1,"Description for field 94"),
        		new DSPCharField(1,"Description for field 95"),
        		new DSPCharField(4,"Description for field 96"),
        		new DSPNumericField(5,"Description for field 97"),
        		new DSPNumericField(2,"Description for field 98"),
        		new DSPNumericField(19,"Description for field 99"),
        		new DSPCharField(1,"Description for field 100"),
        		new DSPCharField(1,"Description for field 101"),
        		new DSPCharField(4,"Description for field 102"),
        		new DSPNumericField(5,"Description for field 103"),
        		new DSPNumericField(2,"Description for field 104"),
        		new DSPNumericField(19,"Description for field 105"),
        		new DSPCharField(1,"Description for field 106"),
        		new DSPCharField(1,"Description for field 107"),
        		new DSPCharField(4,"Description for field 108"),
        		new DSPNumericField(5,"Description for field 109"),
        		new DSPNumericField(2,"Description for field 110"),
        		new DSPNumericField(19,"Description for field 111"),
        		new DSPCharField(1,"Description for field 112"),
        		new DSPCharField(1,"Description for field 113"),
        		new DSPCharField(4,"Description for field 114"),
        		new DSPNumericField(5,"Description for field 115"),
        		new DSPNumericField(2,"Description for field 116"),
        		new DSPNumericField(19,"Description for field 117"),
        		new DSPCharField(1,"Description for field 118"),
        		new DSPCharField(1,"Description for field 119"),
        		new DSPCharField(4,"Description for field 120"),
        		new DSPNumericField(5,"Description for field 121"),
        		new DSPNumericField(2,"Description for field 122"),
        		new DSPNumericField(19,"Description for field 123"),
        		new DSPCharField(1,"Description for field 124"),
        		new DSPCharField(1,"Description for field 125"),
        		new DSPCharField(4,"Description for field 126"),
        		new DSPNumericField(5,"Description for field 127"),
        		new DSPNumericField(2,"Description for field 128"),
        		new DSPNumericField(19,"Description for field 129"),
        		new DSPCharField(1,"Description for field 130"),
        		new DSPCharField(1,"Description for field 131"),
        		new DSPCharField(4,"Description for field 132"),
        		new DSPNumericField(5,"Description for field 133"),
        		new DSPNumericField(2,"Description for field 134"),
        		new DSPNumericField(19,"Description for field 135"),
        		new DSPCharField(1,"Description for field 136"),
        		new DSPCharField(1,"Description for field 137"),
        		new DSPCharField(4,"Description for field 138"),
        		new DSPNumericField(5,"Description for field 139"),
        		new DSPNumericField(2,"Description for field 140"),
        		new DSPNumericField(19,"Description for field 141"),
        		new DSPCharField(1,"Description for field 142"),
        		new DSPCharField(1,"Description for field 143"),
        		new DSPCharField(4,"Description for field 144"),
        		new DSPNumericField(5,"Description for field 145"),
        		new DSPNumericField(2,"Description for field 146"),
        		new DSPNumericField(19,"Description for field 147"),
        		new DSPCharField(1,"Description for field 148"),
        		new DSPCharField(1,"Description for field 149"),
        		new DSPCharField(4,"Description for field 150"),
        		new DSPNumericField(5,"Description for field 151"),
        		new DSPNumericField(2,"Description for field 152"),
        		new DSPNumericField(19,"Description for field 153"),
        		new DSPCharField(1,"Description for field 154"),
        		new DSPCharField(1,"Description for field 155"),
        		new DSPCharField(4,"Description for field 156"),
        		new DSPNumericField(5,"Description for field 157"),
        		new DSPNumericField(2,"Description for field 158"),
        		new DSPNumericField(19,"Description for field 159"),
        		new DSPCharField(1,"Description for field 160"),
        		new DSPCharField(1,"Description for field 161"),
        		new DSPCharField(4,"Description for field 162"),
        		new DSPNumericField(5,"Description for field 163"),
        		new DSPNumericField(2,"Description for field 164"),
        		new DSPNumericField(19,"Description for field 165"),
        		new DSPCharField(1,"Description for field 166"),
        		new DSPCharField(1,"Description for field 167"),
        		new DSPCharField(4,"Description for field 168"),
        		new DSPNumericField(5,"Description for field 169"),
        		new DSPNumericField(2,"Description for field 170"),
        		new DSPNumericField(19,"Description for field 171"),
        		new DSPCharField(1,"Description for field 172"),
        		new DSPCharField(1,"Description for field 173"),
        		new DSPCharField(4,"Description for field 174"),
        		new DSPNumericField(5,"Description for field 175"),
        		new DSPNumericField(2,"Description for field 176"),
        		new DSPNumericField(19,"Description for field 177"),
        		new DSPCharField(1,"Description for field 178"),
        		new DSPCharField(1,"Description for field 179"),
        		new DSPCharField(4,"Description for field 180"),
        		new DSPNumericField(5,"Description for field 181"),
        		new DSPNumericField(2,"Description for field 182"),
        		new DSPNumericField(19,"Description for field 183"),
        		new DSPCharField(1,"Description for field 184"),
        		new DSPCharField(1,"Description for field 185"),
        		new DSPCharField(4,"Description for field 186"),
        		new DSPNumericField(5,"Description for field 187"),
        		new DSPNumericField(2,"Description for field 188"),
        		new DSPNumericField(19,"Description for field 189"),
        		new DSPCharField(1,"Description for field 190"),
        		new DSPCharField(1,"Description for field 191"),
        		new DSPCharField(4,"Description for field 192"),
        		new DSPNumericField(5,"Description for field 193"),
        		new DSPNumericField(2,"Description for field 194"),
        		new DSPNumericField(19,"Description for field 195"),
        		new DSPCharField(1,"Description for field 196"),
        		new DSPCharField(1,"Description for field 197"),
        		new DSPCharField(4,"Description for field 198"),
        		new DSPNumericField(5,"Description for field 199"),
        		new DSPNumericField(2,"Description for field 200"),
        		new DSPNumericField(19,"Description for field 201"),
        		new DSPCharField(1,"Description for field 202"),
        		new DSPCharField(1,"Description for field 203"),
        		new DSPCharField(4,"Description for field 204"),
        		new DSPNumericField(5,"Description for field 205"),
        		new DSPNumericField(2,"Description for field 206"),
        		new DSPNumericField(19,"Description for field 207"),
        		new DSPCharField(1,"Description for field 208"),
        		new DSPCharField(1,"Description for field 209"),
        		new DSPCharField(4,"Description for field 210"),
        		new DSPNumericField(5,"Description for field 211"),
        		new DSPNumericField(2,"Description for field 212"),
        		new DSPNumericField(19,"Description for field 213"),
        		new DSPCharField(1,"Description for field 214"),
        		new DSPCharField(1,"Description for field 215"),
        		new DSPCharField(4,"Description for field 216"),
        		new DSPNumericField(5,"Description for field 217"),
        		new DSPNumericField(2,"Description for field 218"),
        		new DSPNumericField(19,"Description for field 219"),
        		new DSPCharField(16,"Description for field 220"),
        		new DSPNumericField(2,"Description for field 221"),
        		new DSPNumericField(8,"Description for field 222"),
        		new DSPNumericField(8,"Description for field 223"),
        		new DSPNumericField(8,"Description for field 224"),
        		new DSPNumericField(4,"Description for field 225"),
        		new DSPNumericField(8,"Description for field 226"),
        		new DSPNumericField(15,"Description for field 227"),
        		new DSPNumericField(15,"Description for field 228"),
        		new DSPNumericField(15,"Description for field 229"),
        		new DSPNumericField(15,"Description for field 230"),
        		new DSPNumericField(15,"Description for field 231"),
        		new DSPNumericField(15,"Description for field 232"),
        		new DSPNumericField(15,"Description for field 233"),
        		new DSPNumericField(8,"Description for field 234"),
        		new DSPNumericField(15,"Description for field 235"),
        		new DSPNumericField(15,"Description for field 236"),
        		new DSPNumericField(7,"Description for field 237"),
        		new DSPNumericField(2,"Description for field 238"),
        		new DSPNumericField(15,"Description for field 239"),
        		new DSPNumericField(2,"Description for field 240"),
        		new DSPCharField(1,"Description for field 241"),
        		new DSPNumericField(15,"Description for field 242"),
        		new DSPNumericField(6,"Description for field 243"),
        		new DSPNumericField(8,"Description for field 244"),
        		new DSPCharField(16,"Description for field 245"),
        		new DSPCharField(16,"Description for field 246"),
        		new DSPCharField(16,"Description for field 247"),
        		new DSPNumericField(2,"Description for field 248"),
        		new DSPNumericField(2,"Description for field 249"),
        		new DSPCharField(4,"Description for field 250"),
        		new DSPCharField(4,"Description for field 251"),
        		new DSPNumericField(2,"Description for field 252"),
        		new DSPNumericField(8,"Description for field 253"),
        		new DSPNumericField(8,"Description for field 254"),
        		new DSPNumericField(8,"Description for field 255"),
        		new DSPNumericField(8,"Description for field 3"),
        		new DSPNumericField(8,"Description for field 4"),
        		new DSPNumericField(5,"Description for field 5"),
        		new DSPNumericField(8,"Description for field 6"),
        		new DSPNumericField(2,"Description for field 7"),
        		new DSPNumericField(8,"Description for field 8"),
        		new DSPNumericField(8,"Description for field 9"),
        		new DSPNumericField(8,"Description for field 10"),
        		new DSPNumericField(8,"Description for field 11"),
        		new DSPCharField(4,"Description for field 12"),
        		new DSPCharField(19,"Description for field 13"),
        		new DSPCharField(40,"Description for field 14"),
        		new DSPCharField(3,"Description for field 15"),
        		new DSPCharField(3,"Description for field 16"),
        		new DSPCharField(40,"Description for field 17"),
        		new DSPCharField(3,"Description for field 18"),
        		new DSPCharField(3,"Description for field 19"),
        		new DSPCharField(20,"Description for field 20"),
        		new DSPCharField(26,"Description for field 21"),
        		new DSPCharField(40,"Description for field 22"),
        		new DSPCharField(40,"Description for field 23"),
        		new DSPCharField(1,"Description for field 24"),
        		new DSPNumericField(3,"Description for field 25"),
        		new DSPCharField(40,"Description for field 26"),
        		new DSPCharField(40,"Description for field 27"),
        		new DSPCharField(40,"Description for field 28"),
        		new DSPCharField(40,"Description for field 29"),
        		new DSPCharField(20,"Description for field 30"),
        		new DSPCharField(20,"Description for field 31"),
        		new DSPCharField(1,"Description for field 32"),
        		new DSPNumericField(4,"Description for field 33"),
        		new DSPCharField(40,"Description for field 34"),
        		new DSPCharField(40,"Description for field 35"),
        		new DSPNumericField(8,"Description for field 36"),
        		new DSPNumericField(3,"Description for field 37"),
        		new DSPCharField(10,"Description for field 38"),
        		new DSPNumericField(3,"Description for field 39"),
        		new DSPCharField(4,"Description for field 40"),
        		new DSPNumericField(8,"Description for field 41"),
        		new DSPNumericField(6,"Description for field 42"),
        		new DSPNumericField(8,"Description for field 43"),
        		new DSPNumericField(6,"Description for field 44"),
        		new DSPCharField(10,"Description for field 45"),
        		new DSPNumericField(19,"Description for field 46"),
        		new DSPCharField(40,"Description for field 47"),
        		new DSPCharField(16,"Description for field 48"),
        		new DSPCharField(40,"Description for field 49"),
        		new DSPCharField(3,"Description for field 50"),
        		new DSPCharField(3,"Description for field 51"),
        		new DSPCharField(10,"Description for field 52"),
        		new DSPNumericField(8,"Description for field 53"),
        		new DSPNumericField(6,"Description for field 54"),
        		new DSPNumericField(8,"Description for field 55"),
        		new DSPCharField(25,"Description for field 56"),
        		new DSPCharField(2,"Description for field 57"),
        		new DSPCharField(1,"Description for field 58"),
        		new DSPNumericField(8,"Description for field 59"),
        		new DSPNumericField(8,"Description for field 60"),
        		new DSPCharField(1,"Description for field 61"),
        		new DSPCharField(4,"Description for field 62"),
        		new DSPCharField(20,"Description for field 63"),
        		new DSPNumericField(8,"Description for field 64"),
        		new DSPCharField(1,"Description for field 65"),
        		new DSPCharField(1,"Description for field 66"),
        		new DSPNumericField(2,"Description for field 67"),
        		new DSPNumericField(2,"Description for field 68"),
        		new DSPCharField(1,"Description for field 69"),
        		new DSPCharField(20,"Description for field 70"),
        		new DSPCharField(10,"Description for field 71"),
        		new DSPCharField(1,"Description for field 72"),
        		new DSPCharField(1,"Description for field 73"),
        		new DSPCharField(47,"Description for field 74")
        });
        addBody("99067R".toUpperCase(), fld);
    }
}
