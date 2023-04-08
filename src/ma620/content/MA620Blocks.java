package ma620.content;

import arc.Core;
import arc.struct.Seq;
import mindustry.content.*;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.environment.OreBlock;

import static arc.graphics.g2d.Draw.color;
import static arc.graphics.g2d.Lines.lineAngle;
import static arc.math.Angles.randLenVectors;
import static mindustry.type.ItemStack.with;

public class MA620Blocks
{

	public static Block oreSilicon,oreGraphite,oreMetaglass,orePyratite,oreBlastCompound,oreSurgeAlloy,orePhaseFabric,orePlastanium,oreSporePod,oreSand;
	public static Block oreCarbide,oreDormantCyst,oreFissileMatter,oreOxide;

	public static Seq<Block> serpuloBlocks;
	public static Seq<Block> allBlocks;
	public static void load()
	{
		//region Unlock hidden items
		Blocks.slagCentrifuge.requirements(Category.crafting,
										   with(Items.carbide,
												70,
												Items.graphite,
												60,
												Items.silicon,
												40,
												Items.oxide,
												40));
		Blocks.heatReactor.requirements(Category.crafting,
										with(Items.oxide, 70, Items.graphite, 20, Items.carbide, 10, Items.thorium, 80));
		//endregion
		//region Ores
		oreGraphite = new OreBlock("ore-graphite", Items.graphite)
		{{
			oreDefault = true;
			Items.graphite.hardness=2;
		}};
		oreSilicon = new OreBlock("ore-silicon", Items.silicon)
		{{
			oreDefault = true;
			Items.silicon.hardness=2;
		}};
		orePyratite = new OreBlock("ore-pyratite", Items.pyratite)
		{{
			oreDefault = true;
			Items.pyratite.hardness=3;
		}};
		oreBlastCompound = new OreBlock("ore-blast-compound", Items.blastCompound)
		{{
			oreDefault = true;
			Items.blastCompound.hardness=4;
		}};
		oreMetaglass = new OreBlock("ore-metaglass", Items.metaglass)
		{{
			oreDefault = true;
			Items.metaglass.hardness=2;
		}};
		oreSurgeAlloy = new OreBlock("ore-surge-alloy", Items.surgeAlloy)
		{{
			oreDefault = true;
			Items.surgeAlloy.hardness=5;
		}};
		orePhaseFabric = new OreBlock("ore-phase-fabric", Items.phaseFabric)
		{{
			oreDefault = true;
			Items.phaseFabric.hardness=4;
		}};
		orePlastanium = new OreBlock("ore-plastanium", Items.plastanium)
		{{
			oreDefault = true;
			Items.plastanium.hardness=3;
		}};
		oreSporePod=new OreBlock("ore-spore-pod", Items.sporePod)
		{{
			oreDefault=true;
			Items.sporePod.hardness=1;
		}};
		oreSand=new OreBlock("ore-sand",Items.sand)
		{{
			oreDefault=true;
			Items.sand.hardness=1;
		}};
		oreCarbide=new OreBlock("ore-carbide", Items.carbide)
		{{
			oreDefault=true;
			Items.carbide.hardness=5;
		}};
		oreOxide=new OreBlock("ore-oxide",Items.oxide)
		{{
			oreDefault=true;
			Items.oxide.hardness=3;
		}};
		oreDormantCyst=new OreBlock("ore-dormant-cyst", Items.dormantCyst)
		{{
			oreDefault=true;
			//Items.dormantCyst.hidden=false;
			Items.dormantCyst.hardness=4;
		}};
		oreFissileMatter=new OreBlock("ore-fissile-matter", Items.fissileMatter)
		{{
			oreDefault=true;
			Items.fissileMatter.hidden=false;
			Items.fissileMatter.hardness=4;
		}};

		serpuloBlocks = Seq.with(oreSilicon,oreGraphite,oreMetaglass,orePyratite,oreBlastCompound,oreSurgeAlloy,orePhaseFabric,orePlastanium,oreSporePod,oreSand);
		allBlocks = serpuloBlocks.copy().addAll(oreCarbide,oreDormantCyst,oreFissileMatter,oreOxide);

		for(Block b:allBlocks)
		{
			String name="ma620."+b.name;

			if(Core.settings.has(name)) b.itemDrop.hidden=!Core.settings.getBool(name);
		}
	}
}
