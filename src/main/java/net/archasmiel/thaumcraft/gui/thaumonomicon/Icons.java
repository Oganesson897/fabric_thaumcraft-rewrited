package net.archasmiel.thaumcraft.gui.thaumonomicon;

import io.github.cottonmc.cotton.gui.widget.data.Texture;
import net.archasmiel.thaumcraft.Thaumcraft;
import net.minecraft.util.Identifier;

public class Icons {

    private static final String research_path = "textures/other/research/";

    // Research tabs in original sort
    public static final Texture rt_basics =
            loadTexture(Thaumcraft.MOD_ID, research_path + "tab/r_basics.png");
    public static final Texture rt_thaumaturgy =
            loadTexture(Thaumcraft.MOD_ID, research_path + "tab/r_thaumaturgy.png");
    public static final Texture rt_alchemy =
            loadTexture(Thaumcraft.MOD_ID, research_path + "tab/r_alchemy.png");
    public static final Texture rt_artifice =
            loadTexture(Thaumcraft.MOD_ID, research_path + "tab/r_artifice.png");
    public static final Texture rt_golemancy =
            loadTexture(Thaumcraft.MOD_ID, research_path + "tab/r_golemancy.png");
    public static final Texture rt_eldritch =
            loadTexture(Thaumcraft.MOD_ID, research_path + "tab/r_eldritch.png");


    private static Texture loadTexture(String mod_id, String path) {
        return new Texture(new Identifier(mod_id, path));
    }
}
