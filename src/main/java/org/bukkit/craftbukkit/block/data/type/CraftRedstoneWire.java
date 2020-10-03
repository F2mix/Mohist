package org.bukkit.craftbukkit.block.data.type;

import org.bukkit.block.data.type.RedstoneWire;
import org.bukkit.craftbukkit.block.data.CraftBlockData;

public abstract class CraftRedstoneWire extends CraftBlockData implements RedstoneWire {

    private static final net.minecraft.state.EnumProperty<?> NORTH = getEnum("north");
    private static final net.minecraft.state.EnumProperty<?> EAST = getEnum("east");
    private static final net.minecraft.state.EnumProperty<?> SOUTH = getEnum("south");
    private static final net.minecraft.state.EnumProperty<?> WEST = getEnum("west");

    @Override
    public Connection getFace(org.bukkit.block.BlockFace face) {
        switch (face) {
            case NORTH:
                return get(NORTH, Connection.class);
            case EAST:
                return get(EAST, Connection.class);
            case SOUTH:
                return get(SOUTH, Connection.class);
            case WEST:
                return get(WEST, Connection.class);
            default:
                throw new IllegalArgumentException("Cannot have face " + face);
        }
    }

    @Override
    public void setFace(org.bukkit.block.BlockFace face, Connection connection) {
        switch (face) {
            case NORTH:
                set(NORTH, connection);
                break;
            case EAST:
                set(EAST, connection);
                break;
            case SOUTH:
                set(SOUTH, connection);
                break;
            case WEST:
                set(WEST, connection);
                break;
            default:
                throw new IllegalArgumentException("Cannot have face " + face);
        }
    }

    @Override
    public java.util.Set<org.bukkit.block.BlockFace> getAllowedFaces() {
        return com.google.common.collect.ImmutableSet.of(org.bukkit.block.BlockFace.NORTH, org.bukkit.block.BlockFace.EAST, org.bukkit.block.BlockFace.SOUTH, org.bukkit.block.BlockFace.WEST);
    }
}
