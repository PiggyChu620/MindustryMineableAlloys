package ma620.content;

import mindustry.content.Planets;

public class MA620Planets
{
    public static void load()
    {
        Planets.serpulo.generator=new MA620SerpuloPlanetGenerator();
    }
}
