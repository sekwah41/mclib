package mchorse.mclib.utils.coremod;

import net.minecraft.launchwrapper.IClassTransformer;

public abstract class CoreClassTransformer implements IClassTransformer
{
    public static boolean obfuscated = false;

    public boolean checkName(String name, String notch, String mcp)
    {
        if (name.equals(mcp) || name.equals(notch))
        {
            obfuscated = name.equals(notch);

            return true;
        }

        return false;
    }
}