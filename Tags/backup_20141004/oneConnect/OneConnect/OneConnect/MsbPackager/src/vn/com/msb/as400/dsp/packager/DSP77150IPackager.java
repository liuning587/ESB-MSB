// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DSP77150IPackager.java

package vn.com.msb.as400.dsp.packager;

import vn.com.msb.as400.dsp.*;

public class DSP77150IPackager extends DSPPackager {

	public DSP77150IPackager() {
	}

	public void declare() {
		DSPField fld[] = null;
		fld = (new DSPField[] {
				new DSPPackedField(3, 0, "Description for field 1"),
				new DSPPackedField(2, 0, "Description for field 2"),
				new DSPPackedField(5, 0, "Description for field 3"),
				new DSPCharField(1, "Description for field 4"),
				new DSPPackedField(10, 0, "Description for field 5"),
				new DSPPackedField(3, 0, "Description for field 6"),
				new DSPPackedField(3, 0, "Description for field 7"),
				new DSPCharField(1, "Description for field 8"),
				new DSPPackedField(9, 2, "Description for field 9"),
				new DSPCharField(40, "Description for field 10"),
				new DSPCharField(20, "Description for field 11"),
				new DSPPackedField(3, 0, "Description for field 12"),
				new DSPCharField(4, "Description for field 13"),
				new DSPPackedField(7, 7, "Description for field 14"),
				new DSPCharField(1, "Description for field 15"),
				new DSPCharField(1, "Description for field 16"),
				new DSPCharField(1, "Description for field 17"),
				new DSPCharField(1, "Description for field 18"),
				new DSPCharField(10, "Description for field 19"),
				new DSPCharField(20, "Description for field 20"),
				
//				new DSPCharField(40, "Description for field 21"),
//				new DSPCharField(40, "Description for field 22"),
//				new DSPCharField(40, "Description for field 23"),
//				new DSPCharField(40, "Description for field 24"),
//				new DSPCharField(40, "Description for field 25"),
				
				//update 29/11/2012
				new DSPCharField(1, "Description for field 37"),
				new DSPCharField(5, "Description for field 38"),
				new DSPCharField(5, "Description for field 39"),
				new DSPCharField(19, "Description for field 40"),
				new DSPCharField(5, "Description for field 41"),
				//end
				
				new DSPPackedField(9, 2, "Description for field 26"),
				new DSPCharField(1, "Description for field 27"),
				new DSPPackedField(3, 0, "Description for field 28") });
		addBody("77150I".toUpperCase(), fld);
	}
}
