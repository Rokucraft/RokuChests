plugins {
    `java-library`
    id("xyz.jpenilla.run-paper") version "2.2.3"
    id("net.minecrell.plugin-yml.bukkit") version "0.6.0"
}

group = "com.rokucraft"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.19.4-R0.1-SNAPSHOT")
}

bukkit {
    name = "RokuChests"
    version = project.version.toString()
    main = "com.rokucraft.rokuchests.RokuChestsPlugin"
    apiVersion = "1.19"
    author = "Aikovdp"
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
        sourceCompatibility = JavaVersion.VERSION_17
    }
}

tasks {
    runServer {
        minecraftVersion("1.19.4")
    }
}
