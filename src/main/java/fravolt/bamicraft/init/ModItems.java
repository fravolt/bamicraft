package fravolt.bamicraft.init;


import fravolt.bamicraft.blocks.BamiBlock;
import fravolt.bamicraft.items.BamiBall;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
    @GameRegistry.ObjectHolder("modtut:firstitem")
    public static BamiBall bamiBall;

    public static void init() {
        bamiBall= new BamiBall();
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        bamiBall.initModel();
    }
}
