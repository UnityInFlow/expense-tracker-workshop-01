# Expense Tracker Workshop — Session 1

## Kotlin & Spring Boot Basics

Workshop pro DevOps inzenyry kteri chteji porozumet backend aplikacim ktere deployuji. Zadne predchozi zkusenosti s programovanim nejsou potreba.

Na konci workshopu budete mit fungujici REST API s dokumentaci ktere muzete volat z prohlizece.

---

## Struktura workshopu

| Krok | Tema | Co postavime |
|------|------|-------------|
| Step 1 | Promenne a funkce | `val`, `var`, `fun`, string templates |
| Step 2 | Data class a instance | `data class Expense`, `copy()`, `toString()` |
| Step 3 | List a HashMap | In-memory databaze, null safety `?.` |
| Step 4 | Service class | `ExpenseService` — logika na jednom miste |
| Step 5 | Spring Boot Controller | REST API na `localhost:8080` |
| Step 6 | SpringDoc / Swagger UI | API dokumentace v prohlizeci |

Kazdy krok ma:
- **start** — projekt s TODO komentare (vase ukoly)
- **final** — kompletni reseni s vysvetlujicimi komentare

---

## Jak pracovat s timto repozitarem

### Varianta A — Slozky (doporuceno pro zacatecniky)

Nepotrebujete umet git. Staci stahnout a otvirat slozky.

**1. Stahnete repozitar:**

Kliknete na zelene tlacitko **Code** → **Download ZIP** na teto strance.
Rozbalte ZIP soubor.

**2. Zaciname — Step 1:**

1. Otevrete IntelliJ IDEA
2. File → Open → vyberte slozku `step-01-start`
3. Pockejte az se stahnou zavislosti
4. Spustte: `./mvnw spring-boot:run`
5. Vystup uvidite v terminalu IntelliJ

**3. Kdyz jste hotovi nebo se zasekli:**

Otevrete `step-01-final/` — tam je kompletni reseni s vysvetlenim.

**4. Pokracujte na dalsi krok:**

Otevrete `step-02-start/` a opakujte postup.

**Postup krok za krokem:**
```
step-01-start/  →  doplnte TODO  →  porovnejte s  →  step-01-final/
step-02-start/  →  doplnte TODO  →  porovnejte s  →  step-02-final/
step-03-start/  →  doplnte TODO  →  porovnejte s  →  step-03-final/
step-04-start/  →  doplnte TODO  →  porovnejte s  →  step-04-final/
step-05-start/  →  doplnte TODO  →  porovnejte s  →  step-05-final/
step-06-start/  →  doplnte TODO  →  porovnejte s  →  step-06-final/
```

**Pro kroky 1-4:** Vystup uvidite v terminalu IntelliJ (CommandLineRunner).

**Pro kroky 5-6:** Otevrete v prohlizeci http://localhost:8080/expenses

---

### Varianta B — Git branches (pro pokrocile)

Kazdy krok ma vlastni branch. Branch obsahuje POUZE soubory daneho kroku (na urovni root).

**1. Naklonujte repozitar:**

```bash
git clone https://github.com/UnityInFlow/expense-tracker-workshop-01.git
cd expense-tracker-workshop-01
```

**2. Prepnete na prvni krok:**

```bash
git checkout step-01-start
```

Nyni vidite kompletni Maven projekt primo v rootu repozitare.

**3. Spustte projekt:**

```bash
./mvnw spring-boot:run
```

Pro kroky 1-4: vystup uvidite v terminalu.
Pro kroky 5-6: otevrete http://localhost:8080/expenses v prohlizeci.

**Pracujte na ukolech:**

Otevrete projekt v IntelliJ IDEA a upravte soubory — doplnte kod kde vidite `// TODO:`.

**4. Kdyz jste hotovi nebo se zasekli:**

```bash
git stash                     # ulozi vase zmeny stranou
git checkout step-01-final    # prepne na reseni
```

**5. Pokracujte dalsim krokem:**

```bash
git checkout step-02-start    # dalsi krok
```

**Vsechny dostupne branches:**
```
step-01-start    step-01-final
step-02-start    step-02-final
step-03-start    step-03-final
step-04-start    step-04-final
step-05-start    step-05-final
step-06-start    step-06-final
```

**Tip — porovnani vasi prace s resenim:**
```bash
git diff step-01-final -- src/main/kotlin/dev/workshop/expense/Playground.kt
```

---

## Nastroje

| Nastroj | Pouziti |
|---------|---------|
| IntelliJ IDEA Community | Vsechny kroky |
| JDK 21 | Kompilace a spusteni |

Podrobny navod k instalaci: [SETUP.md](SETUP.md)

---

## Navazujici workshop

**Session 2 — SQLite + Repository + Validace**
https://github.com/UnityInFlow/expense-tracker-workshop-02

Data z Session 1 zmizi po restartu (HashMap = pamet). V Session 2 to opravime pomoci SQLite databaze.
