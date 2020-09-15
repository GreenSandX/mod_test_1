package green.test_1.keyboard;


import org.lwjgl.input.Keyboard;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class KeyLoader {
	
    public static KeyBinding gjump;

    public KeyLoader()
    {
        KeyLoader.gjump = new KeyBinding("key.gjump", Keyboard.KEY_X, "key.categories.greno_keybinding");

        ClientRegistry.registerKeyBinding(KeyLoader.gjump);
    }
}
