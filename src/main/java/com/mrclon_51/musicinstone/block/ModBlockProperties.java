package com.mrclon_51.musicinstone.block;

import net.minecraft.util.StringRepresentable;

public class ModBlockProperties
{
    public enum SideHalf implements StringRepresentable {
        LEFT("left"),
        RIGHT("right");

        private final String name;

        SideHalf(String name) {
            this.name = name;
        }

        @Override
        public String getSerializedName() {
            return this.name;
        }
    }
}
