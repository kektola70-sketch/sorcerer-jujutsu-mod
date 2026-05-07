public class PlayerStats {

    private int level = 1;
    private int cursedEnergy = 0;
    private String character = "non_sorcerer";

    public int getLevel() { return level; }
    public void addLevel(int amount) { this.level += amount; }

    public int getCursedEnergy() { return cursedEnergy; }
    public void addCursedEnergy(int amount) { this.cursedEnergy += amount; }

    public String getCharacter() { return character; }
    public void setCharacter(String character) { this.character = character; }
}