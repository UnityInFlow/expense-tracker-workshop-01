# Setup Guide — Expense Tracker Workshop

## 1. IntelliJ IDEA Community Edition

### macOS
1. Download from https://www.jetbrains.com/idea/download/ (Community Edition — free)
2. Open `.dmg`, drag to Applications
3. Launch IntelliJ IDEA

### Windows
1. Download from https://www.jetbrains.com/idea/download/ (Community Edition — free)
2. Run the installer, leave everything at default values
3. Launch IntelliJ IDEA

### Linux
```bash
sudo snap install intellij-idea-community --classic
```

## 2. JDK 21

### Via SDKMAN (recommended — macOS / Linux)
```bash
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk install java 21-tem
```

### Manually (Windows)
1. Download from https://adoptium.net/temurin/releases/?version=21
2. Run the installer
3. Verify in terminal: `java -version` → should show `openjdk version "21..."`

### Verification
```bash
java -version
# expected output: openjdk version "21.x.x" ...
```

## 3. Kotlin Playground

Open in browser: https://play.kotlinlang.org

Verify it works — type `println("Hello")` and click Run.

## 4. Git + Workshop repo

```bash
git clone https://github.com/UnityInFlow/expense-tracker-workshop-01.git
cd expense-tracker-workshop-01
git checkout step-01-start
```

## 5. Opening the project in IntelliJ

1. Open IntelliJ IDEA
2. File → Open → select the `expense-tracker-workshop-01` folder
3. Wait for IntelliJ to download dependencies (progress bar at the bottom)
4. In the bottom right corner verify that JDK 21 is set

## Troubleshooting

**IntelliJ does not recognize Kotlin:**
→ File → Settings → Plugins → verify the Kotlin plugin is enabled

**java -version shows an old version:**
→ `sdk use java 21-tem` (SDKMAN) or set JAVA_HOME manually

**Git clone fails:**
→ Verify you have `git` installed: `git --version`

**IntelliJ is downloading dependencies for too long:**
→ Normal on first open. Wait 2-5 minutes.
