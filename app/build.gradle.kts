plugins {
    id("java")
    checkstyle
    application
}

application { mainClass.set("hexlet.code.App") }

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // зависимость для рандомного числа
}

tasks {
    compileJava {
        options.release = 21
    }

    getByName("run", JavaExec::class) {
        standardInput = System.`in`
    }

    test {
        useJUnitPlatform()
    }
}

