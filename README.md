# Expense Tracker Workshop — Session 1

## Kotlin & Spring Boot Basics

Workshop for DevOps engineers who want to understand the backend applications they deploy. No prior programming experience required.

By the end of the workshop you will have a working REST API with documentation that you can call from a browser.

---

## Workshop structure

| Step | Topic | What we build |
|------|-------|---------------|
| Step 1 | Variables and functions | `val`, `var`, `fun`, string templates |
| Step 2 | Data class and instances | `data class Expense`, `copy()`, `toString()` |
| Step 3 | List and HashMap | In-memory database, null safety `?.` |
| Step 4 | Service class | `ExpenseService` — logic in one place |
| Step 5 | Spring Boot Controller | REST API at `localhost:8080` |
| Step 6 | SpringDoc / Swagger UI | API documentation in the browser |

Each step has:
- **start** — project with TODO comments (your tasks)
- **final** — complete solution with explanatory comments

---

## How to work with this repository

### Option A — Folders (recommended for beginners)

You don't need to know git. Just download and open the folders.

**1. Download the repository:**

Click the green **Code** button → **Download ZIP** on this page.
Extract the ZIP file.

**2. Getting started — Step 1:**

1. Open IntelliJ IDEA
2. File → Open → select the `step-01-start` folder
3. Wait for dependencies to download
4. Run: `./mvnw spring-boot:run`
5. You will see the output in the IntelliJ terminal

**3. When you're done or get stuck:**

Open `step-01-final/` — there is the complete solution with explanation.

**4. Continue to the next step:**

Open `step-02-start/` and repeat the process.

**Step by step flow:**
```
step-01-start/  →  fill in TODOs  →  compare with  →  step-01-final/
step-02-start/  →  fill in TODOs  →  compare with  →  step-02-final/
step-03-start/  →  fill in TODOs  →  compare with  →  step-03-final/
step-04-start/  →  fill in TODOs  →  compare with  →  step-04-final/
step-05-start/  →  fill in TODOs  →  compare with  →  step-05-final/
step-06-start/  →  fill in TODOs  →  compare with  →  step-06-final/
```

**For steps 1-4:** You will see the output in the IntelliJ terminal (CommandLineRunner).

**For steps 5-6:** Open in your browser http://localhost:8080/expenses

---

### Option B — Git branches (for advanced users)

Each step has its own branch. The branch contains ONLY the files for that step (at the root level).

**1. Clone the repository:**

```bash
git clone https://github.com/UnityInFlow/expense-tracker-workshop-01.git
cd expense-tracker-workshop-01
```

**2. Switch to the first step:**

```bash
git checkout step-01-start
```

You will now see the complete Maven project directly in the repository root.

**3. Run the project:**

```bash
./mvnw spring-boot:run
```

For steps 1-4: you will see the output in the terminal.
For steps 5-6: open http://localhost:8080/expenses in your browser.

**Work on the tasks:**

Open the project in IntelliJ IDEA and edit the files — fill in the code where you see `// TODO:`.

**4. When you're done or get stuck:**

```bash
git stash                     # saves your changes aside
git checkout step-01-final    # switches to the solution
```

**5. Continue to the next step:**

```bash
git checkout step-02-start    # next step
```

**All available branches:**
```
step-01-start    step-01-final
step-02-start    step-02-final
step-03-start    step-03-final
step-04-start    step-04-final
step-05-start    step-05-final
step-06-start    step-06-final
```

**Tip — comparing your work with the solution:**
```bash
git diff step-01-final -- src/main/kotlin/dev/workshop/expense/Playground.kt
```

---

## Tools

| Tool | Usage |
|------|-------|
| IntelliJ IDEA Community | All steps |
| JDK 21 | Compilation and running |

Detailed installation guide: [SETUP.md](SETUP.md)

---

## Follow-up workshop

**Session 2 — SQLite + Repository + Validation**
https://github.com/UnityInFlow/expense-tracker-workshop-02

Data from Session 1 disappears after restart (HashMap = memory). In Session 2 we fix this with an SQLite database.
