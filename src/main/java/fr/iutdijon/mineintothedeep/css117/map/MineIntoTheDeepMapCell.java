package fr.iutdijon.mineintothedeep.css117.map;

public class MineIntoTheDeepMapCell
{
    private final int depth;
    private final int oreAmount;
    private final MineIntoTheDeepOreType oreType;
    private final int owner;

    public MineIntoTheDeepMapCell(int depth, int oreAmount, MineIntoTheDeepOreType oreType, int owner) {
        this.depth = depth;
        this.oreAmount = oreAmount;
        this.oreType = oreType;
        this.owner = owner;
    }

    public int getDepth() {
        return depth;
    }

    public int getOreAmount() {
        return oreAmount;
    }

    public MineIntoTheDeepOreType getOreType() {
        return oreType;
    }

    public int getOwner() {
        return owner;
    }
}