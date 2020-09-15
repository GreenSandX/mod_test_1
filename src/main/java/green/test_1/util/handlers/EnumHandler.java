package green.test_1.util.handlers;

import green.test_1.util.Reference;
import net.minecraft.util.IStringSerializable;

public class EnumHandler {
	
	public static enum EnumType implements IStringSerializable{
		GRENO(0, "greno");
		
		
		private static final EnumType[] META_LOOKUP = new EnumType[values().length];
		private final int meta;
		private final String name, unlocalizeName;
		private EnumType(int meta,String name) {
			this(meta, name, name);
		}
		private EnumType(int meta,String name,String unlocalizeName) {
			this.meta = meta;
			this.name = name;
			this.unlocalizeName = unlocalizeName;
		}
		
		@Override
		public String getName() {
			return this.name;
		}
		
		public String getUnlocalizeName() {
			return this.unlocalizeName;
		}
		
		public int getMeta() {
			return this.meta;
		}
		
		@Override
		public String toString() {
			return this.name;
		}
		
		public static EnumType byMetadata(int meta) {
			return META_LOOKUP[meta];
		}
		
		static {
			for(EnumType enumType : values()) {
				META_LOOKUP[enumType.getMeta()] = enumType;
			}
		}
		
	}
	
	
	public static enum EnumBlockColor implements IStringSerializable{
		PIC0(0, "pic0"),
		PIC1(1, "pic1"),
		PIC2(2, "pic2"),
		PIC3(3, "pic3"),
		PIC4(4, "pic4"),
		PIC5(5, "pic5"),
		PIC6(6, "pic6"),
		PIC7(7, "pic7"),
		PIC8(8, "pic8"),
		PIC9(9, "pic9"),
		PIC10(10, "pic10"),
		PIC11(11, "pic11"),
		PIC12(12, "pic12"),
		PIC13(13, "pic13"),
		PIC14(14, "pic14"),
		PIC15(15, "pic15");
		
		private static final EnumBlockColor[] META_LOOKUP_LIST = new EnumBlockColor[values().length];
		private final int meta;
		private final String name, unlocalizeName;
		private EnumBlockColor(int meta,String name) {
			this(meta, name, name);
		}
		private EnumBlockColor(int meta,String name,String unlocalizeName) {
			this.meta = meta;
			this.name = "block_color_" + name;
			this.unlocalizeName = "block_color_" + unlocalizeName;
		}
		
		@Override
		public String getName() {
			return this.name;
		}
		
		public String getUnlocalizeName() {
			return this.unlocalizeName;
		}
		
		public int getMeta() {
			return this.meta;
		}
		
		@Override
		public String toString() {
			return this.name;
		}
		
		public static EnumBlockColor byMetadata(int meta) {
			return META_LOOKUP_LIST[meta];
		}
		
		static {
			for(EnumBlockColor enumType : values()) {
				META_LOOKUP_LIST[enumType.getMeta()] = enumType;
			}
		}
		
	}
	
}
