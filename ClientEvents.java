@Mod.EventBusSubscriber(modid = "jjkmod", value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void onKeyInput(InputEvent.KeyInputEvent event) {
        if (KeyInit.OPEN_SKILL_MENU.isPressed()) {
            Minecraft.getInstance().setScreen(new SkillScreen());
        }
    }
}