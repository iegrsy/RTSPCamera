package com.ieg.rtpcamera;

import android.view.SurfaceView;

/**
 * Created by ieg on 18.08.2017.
 */

public class IPCamSrc {

    String IPAdress = null;
    SurfaceView surfaceView = null;

    public IPCamSrc(String IPAdress, SurfaceView surfaceView)
    {
        this.IPAdress = IPAdress;
        this.surfaceView = surfaceView;
    }
}
