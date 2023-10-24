package ma620.content;

import mindustry.graphics.CacheLayer;

public class MA620CacheLayer extends CacheLayer
{
    public static CacheLayer ozone,hydrogen,nitrogen,cyanogen,neoplasm;

    public static void init()
    {
        addLast
        (
            ozone=new ShaderLayer(MA620Shaders.ozone),
            hydrogen=new ShaderLayer(MA620Shaders.hydrogen),
            nitrogen=new ShaderLayer(MA620Shaders.nitrogen),
            cyanogen=new ShaderLayer(MA620Shaders.cyanogen),
            neoplasm=new ShaderLayer(MA620Shaders.neoplasm)
        );
    }
}
