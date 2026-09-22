# Wren's Corail Tombstone Patch
**For use with CleanroomMC, Corail Tombstone 4.8.0**
*other versions may not work, or in the future may patch this bug.*

Tombstone 4.8.0 has an access transformer (a file telling Forge to make certain Minecraft fields public at load time). But its manifest is missing the FMLAT: line that makes Forge load that file. This patch simply relists the classes and fields it uses.
