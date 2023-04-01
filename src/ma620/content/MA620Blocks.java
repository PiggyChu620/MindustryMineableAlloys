package ma620.content;

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

	public static Block oreSilicon,oreGraphite,oreMetaglass,orePyratite,oreBlastCompound,oreSurgeAlloy,orePhaseFabric,orePlastanium;
	public static Block oreCarbide,oreDormantCyst,oreFissileMatter,oreOxide;
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
			Items.pyratite.hardness=2;
		}};
		oreBlastCompound = new OreBlock("ore-blast-compound", Items.blastCompound)
		{{
			oreDefault = true;
			Items.blastCompound.hardness=3;
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
			Items.dormantCyst.hidden=false;
			Items.dormantCyst.hardness=4;
		}};
		oreFissileMatter=new OreBlock("ore-fissile-matter", Items.fissileMatter)
		{{
			oreDefault=true;
			Items.fissileMatter.hidden=false;
			Items.fissileMatter.hardness=4;
		}};
	}
}
