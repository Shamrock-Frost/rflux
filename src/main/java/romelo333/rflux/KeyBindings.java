package romelo333.rflux;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

@SideOnly(Side.CLIENT)
public class KeyBindings {

    public static KeyBinding wandModifier;

    public static void init() {
        wandModifier = new KeyBinding("key.modifier", Keyboard.KEY_EQUALS, "key.categories.rflux");
        ClientRegistry.registerKeyBinding(wandModifier);
    }
}
