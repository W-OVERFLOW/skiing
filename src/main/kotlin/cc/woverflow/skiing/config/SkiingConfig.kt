package cc.woverflow.skiing.config

import com.example.template.Skiing
import gg.essential.vigilance.Vigilant
import java.io.File

object SkiingConfig : Vigilant(File(Skiing.modDir, "${Skiing.ID}.toml"), Skiing.NAME) {

    init {
        initialize()
    }
}