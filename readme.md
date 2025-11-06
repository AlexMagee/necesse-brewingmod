# Necesse Mod Starter Project

This is a Gradle-based starter template for creating **Necesse** game mods. Follow the instructions below to set up, configure, test, and build your mod.

## Project Structure
```
root/
│
├─ settings.gradle # Set the root project name here
├─ app/
│ ├─ build.gradle # Optional: configure your game location (default is Windows)
│ ├─ config.gradle # Mod-specific configuration
│ └─ src/ # Build your mod here
```
## Getting Started

### 1. Set the Project Name
Edit the `settings.gradle` file and set your project name:

```gradle
rootProject.name = "YourModName"
```
### 2. Configure Your Mod
Edit `/app/config.gradle` to specify your mod’s details. Available fields:
```gradle
project.ext.modID = "your.unique.modid"         // Unique identifier for your mod
project.ext.modName = "Your Mod Name"           // Display name of your mod
project.ext.modVersion = "1.0"                  // Mod version
project.ext.gameVersion = "1.0.2"               // Compatible Necesse game version
project.ext.modDescription = "Description..."  // Short description of your mod
project.ext.author = "Your Name"                // Author name
project.ext.clientside = false                  // Set true if mod only runs on the client
```
⚠️ Make sure to update each field. modID must be unique to avoid conflicts with other mods.
### 3. Build Your Mod
All source files should be placed under `/app/src/main/`. Gradle will compile these files and generate your mod package.
### 4. (Optional) Change Game Location
By default, the build assumes Necesse is installed on Windows. To change, edit `/app/build.gradle`:
```gradle
// Example for Windows
def gameDirectory = "C:/Program Files (x86)/Steam/steamapps/common/Necesse"
```
## Running and Testing
To run your mod in the game for testing:
```bash
gradlew runClient
```
This launches Necesse with your mod loaded.

To run a server with your mod installed:
```bash
gradlew runServer
```
## Building the Mod Jar
To build the final mod jar for distribution:
```bash
gradlew buildModJar
```
The output will be in the `build/libs` directory.
