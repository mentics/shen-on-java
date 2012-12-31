package com.mentics.shenj;

import com.mentics.shenj.cl.DirectClassLoader;


public class SwitchError extends Error {
    public final DirectClassLoader dcl;
    public final boolean useTop;


    public SwitchError(DirectClassLoader dcl, boolean useTop) {
        super();
        this.dcl = dcl;
        this.useTop = useTop;
    }
}
