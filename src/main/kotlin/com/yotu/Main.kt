package com.yotu

import cn.nukkit.event.Listener
import cn.nukkit.plugin.PluginBase
import com.yotu.command.setBlockCommand

class Main: PluginBase(), Listener {
    override fun onEnable() {
        this.server.pluginManager.registerEvents(this, this)
        server.commandMap.registerAll(
            "setblock", listOf(setBlockCommand())
        )
    }
}