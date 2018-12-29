package fravolt.bamicraft.init;

import fravolt.bamicraft.blocks.BamiBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    @GameRegistry.ObjectHolder("bamicraft:bamiblock")
    public static BamiBlock bamiBlock;

    public static void init() {
        bamiBlock= new BamiBlock();
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        bamiBlock.initModel();
    }
}
