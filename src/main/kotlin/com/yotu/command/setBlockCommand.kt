package com.yotu.command

import cn.nukkit.Player
import cn.nukkit.block.Block
import cn.nukkit.command.Command
import cn.nukkit.command.CommandSender

class SetBlockCommand: Command("setblock") {
    override fun execute(sender: CommandSender?, commandLabel: String?, args: Array<out String>?): Boolean {
        if(sender !is Player) return true
        sender.level.setBlockIdAt(sender.floorX, sender.floorY, sender.floorZ, 1)
        sender.level.loadChunk(sender.floorX, sender.floorZ)
        return true
    }
}