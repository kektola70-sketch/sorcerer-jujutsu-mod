public class KeyInit {
    public static KeyBinding OPEN_SKILL_MENU;

    public static void register() {
        OPEN_SKILL_MENU = new KeyBinding(
                "key.jjkmod.skills",
                GLFW.GLFW_KEY_B,
                "key.categories.jjkmod"
        );
        ClientRegistry.registerKeyBinding(OPEN_SKILL_MENU);
    }
}