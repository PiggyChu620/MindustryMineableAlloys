package ma620;

import arc.util.*;
import ma620.content.*;
import mindustry.mod.*;


public class MA620Mod extends Mod
{
    //public static EC620NameGenerator nameGenerator;
    public MA620Mod()
    {
        /*if(Core.app.isMobile())
        {
            //listen for game load event
            Events.on(ClientLoadEvent.class, e -> {
                //show dialog upon startup
                Time.runTask(10f, () -> {
                    Dialog.DialogStyle dd=new Dialog.DialogStyle();

                    dd.titleFont= Fonts.def;
                    dd.titleFontColor=new Color(1,0,0);
                    BaseDialog dialog = new BaseDialog("Random Planet", dd);
                    dialog.cont.add("Welcome to Random Planet v0.2.1",Color.green,1.2f).row();
                    dialog.cont.add("You need to turn the phone to landscape",Color.cyan).row();
                    dialog.cont.add("in order to see the setting info,",Color.cyan).row();
                    dialog.cont.add("I can not figure out how to make it wrap,",Color.cyan).row();
                    dialog.cont.add("sorry.", Color.cyan).row();
                    //                dialog.cont.add("some of the sectors (especially Eradication maps) might even be unbeatable,",Color.cyan).row();
                    //                dialog.cont.add("so if you're a newbie, I recommend you to play the original games",Color.cyan).row();
                    //                dialog.cont.add(" and get familiar with the contents first.",Color.cyan).row();
                    //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                    //dialog.cont.image(Core.atlas.find("example-java-mod-frog")).pad(20f).row();
                    dialog.cont.button("OK", dialog::hide).size(100f, 50f);
                    dialog.show();
                });
            });
        }*/



        //Log.info("Loaded EC620JavaMod constructor.");
    }
    @Override
    public void init()
    {
        //EC620Setting.loadUI();
    }
    @Override
    public void loadContent()
    {
        Log.info("Loading Random Planet content.");

        MA620Blocks.load();
        MA620Planets.load();

        Log.info("Random Planet loaded successfully.");
    }
}
