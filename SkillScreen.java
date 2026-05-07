public class SkillScreen extends Screen {

    protected SkillScreen() {
        super(new StringTextComponent("JJK Skills"));
    }

    @Override
    protected void init() {

        this.addButton(new Button(
                this.width / 2 - 50,
                this.height / 2 - 10,
                100,
                20,
                new StringTextComponent("Level Up"),
                button -> {
                    // Тут увеличиваем уровень
                }
        ));
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }
}