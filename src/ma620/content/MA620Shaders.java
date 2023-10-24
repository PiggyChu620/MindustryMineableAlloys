package ma620.content;

import static ma620.content.MA620Classes.*;
public class MA620Shaders
{
    public static SurfaceShader hydrogen,ozone,nitrogen,cyanogen,neoplasm;

    public static void init()
    {
        hydrogen=new SurfaceShader("hydrogen");
        ozone=new SurfaceShader("ozone");
        nitrogen=new SurfaceShader("nitrogen");
        cyanogen=new SurfaceShader("cyanogen");
        neoplasm=new SurfaceShader("neoplasm");
    }
}
