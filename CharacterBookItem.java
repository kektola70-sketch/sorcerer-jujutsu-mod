public class CharacterBookItem extends Item {

    public CharacterBookItem() {
        super(new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_MISC));
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        if (!world.isClientSide) return ActionResult.success(player.getItemInHand(hand));

        Minecraft.getInstance().setScreen(new CharacterBookScreen());
        return ActionResult.success(player.getItemInHand(hand));
    }
}