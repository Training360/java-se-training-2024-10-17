# Bevezetés a nyelvi eszközökbe
## Java SE alapok - Bevezetés


## Eszközkészlet
class: inverse, center, middle

# Java történeti háttér

---

# Történeti háttér

* Szoftverkrízis fogalma már 1968-ban megjelent
* Válaszok között: új programozási paradigmák, pl. objektumorientált programozás
* 1991 Sun titkos projektje (Green Project), James Gosling - programozási eszköz digitális eszközökhöz
* Mosaic - WebRunner - HotJava, később Netscape<br /> böngészőbe integrálva

---

# Java célkitűzések

* egyszerű, objektumorientált
* robusztus, biztonságos
* architektúra-semleges, hordozható
* nagyteljesítményű
* interpretált, többszálú és dinamikus

---

# Java jelene

* Oracle
* Főleg nagyvállalati backend rendszerek
* Mobil: Android
* Kliens oldal kevésbé hangsúlyos, de létező: Swing, NetBeans Platform, Eclipse Platform
* Kliens oldali próbálkozás: JavaFX
* IoT, Big Data
* 10 millió Java fejlesztő, 15 milliárd eszköz

---

# Java verziószámok

* Verziószámozás
    * Régebben: Java SE 8u111, `java version "1.8.0_201"`
    * Újabban konzisztens `java version "12.0.1" 2019-04-16`
* https://en.wikipedia.org/wiki/Java\_version\_history






class: inverse, center, middle



# Java platform

---

# Mi kell a Javához?

Futtatáshoz:
* JRE (Java Runtime Environment):
  JVM (Java Virtual Machine) + osztálykönyvtárak
  (Java 11-től megszűnt)
Fejlesztéshez:
* JDK (Java Development Kit):
  JRE + fejlesztőeszközök (pl. compiler)

---

# Fejlesztés menete

![Fejlesztés menete](images/development.png)



class: inverse, center, middle



# Maven

---

# Maven

* Nincs Java platformon standard projekt struktúra
* Segít a build folyamatban
* Függőségkezelés
* Software project management and comprehension tool
* Convention over configuration

---

# Build folyamat

* Forrásállományok fordítása
* Többi, ún. erőforrás állomány kezelése
* Teszt esetek futtatása
* Alkalmazás összecsomagolása

---

# Struktúra

* `pom.xml` projekt leíró állomány
* `src\main\java` Java forráskódok
* `src\main\resources` Erőforrás állományok
* `src\test\java` Teszt esetek, nem része az alkalmazásnak
* `src\test\resources` Teszt esetekhez szükséges egyéb erőforrás állományok, nem része az alkalmazásnak

---

# `pom.xml` felépítése

* Projekt azonosítói: `groupId`, `artifactId`, `version`
* Karakterkódolás
* Java verziója
* Függőségek




class: inverse, center, middle



# IDE

---

# Java IDE-k

* NetBeans
* Eclipse
* IntelliJ IDEA

---

# IDE munkafolyamat

* New project
* New class
* Kódszerkesztő ablak
* Project ablak
* Projekt futtatása
* Run Tool Window

---

# Projekt

* Projekt fogalma
* Maven `pom.xml` szinkronizáció
* Sources root könyvtár
* Több projekt kezelése

---

# Hasznos billentyűkombinációk

* Keymap reference
* `Ctrl` + `Space` - code completion
* `Alt` + `Enter` - quick fix
* Code template-ek: `psvm` + `Tab`, `sout` + `Tab`


class: inverse, center, middle



# Git használata az IDE-ben

---

# Git IDE-ben

* Enable Version Control Integration
* Version Control Tools Window
* Commit, revert
* Git/Repository/Pull, Push








## Bevezetés a Java osztályok használatába
class: inverse, center, middle

# Kiírás és beolvasás konzolról

---

# Osztályok

* Java alkalmazás alapvető építőkövei az osztályok
* Tipikusan egy fájlban egy osztály
* Csomagokba, könyvtárakba rendezve
    * Struktúrát ad az alkalmazásunknak
    * Láthatóságot szabályoz

---

# Első programunk

* Osztály: tervrajz
* Metódus: utasítások összessége, névvel ellátva
    * `main`: belépési pont 
* Kiírás: `System.out.println` metódus hívásával

```java
package hello;

public class HelloWorld {

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }

}
```

---

# Változó használata

* Típus, név, érték
* `String` osztály, mint típus

```java
public static void main(String[] args) {
   String message = "Hello World!";
   System.out.println(message);
}
```

---

# Érték bekérése `Scanner`-rel
    
* `Scanner` típusú változó, mely egy osztály, melyet importálni kell
* Példányosítás `new` kulcsszóval
* `nextLine()` metódussal sor beolvasása
* String konkatenálás `+` operátorral

---

# Érték bekérése

```java
package hello;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
```

---

# Egész típusú változó

* `int` primitív típus
* `Scanner` osztály `nextInt()` metódusával kérhetjük le
* Összeadás `+`, kivonás `-` operátorral
* Stringhez `int` típusú érték is konkatenálható

```java
public static void main(String[] args) {
    System.out.println("Year of birth?");
    int yearOfBirth = scanner.nextInt();
    int age = 2019 - yearOfBirth;
    System.out.println("Age: " + age);
}
```


class: inverse, center, middle

# Objektumok és attribútumok

---

# Osztály felépítése

* Példány: osztály alapján készített objektum
    * Objektumorientált nyelv alapja, a program objektumok együttműködése
* Attribútumok: állapot - adatok, értékek tárolására
    * Lefoglalásra kerül a memóriában

---

# Attribútumok

* Felépítése:
    * Típus
    * Név - főnév legyen

```java
package trainerapp;

public class Trainer {

    String name;

}
```

---

# Több attribútum

```java
package trainerapp;

public class Trainer {

    String name;

    int yearOfBirth;

}
```

---

# Tesztelés `main` metódusból

* `main` metódust tesztelés céljából elhelyezhetjük az adott osztályban is

```java
package trainerapp;

public class TrainerMain {

    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        trainer.name = "John Doe";
        trainer.yearOfBirth = 1980;
        System.out.println(trainer.name);
        System.out.println(trainer.yearOfBirth);

        Trainer anotherTrainer = new Trainer();
        anotherTrainer.name = "Jack Doe";
    }
}
```



class: inverse, center, middle

# Metódusok

---

# Metódusok

* Utasítások sorozata, mely névvel rendelkezik
* Metódusok: állapot lekérdezésére és módosítására
* Példányhoz tartozik
* Egységbezárás: osztály egységbe zárja az adatokat és rajta végzett műveleteket

---

# Lekérdező metódus

```java
package trainerapp;

public class Trainer {

    String name;

    public String getName() {
        return name;
    }
}
```

```java
Trainer trainer = new Trainer();
trainer.name = "John Doe";
System.out.println(trainer.getName());
```

---

# További lekérdező metódusok

```java
package trainerapp;

public class Trainer {

    String name;

    int yearOfBirth;

    public String getNameAndYearOfBirth() {
        return name + ": " + yearOfBirth;
    }

    public int getAge(int year) {
        return year - yearOfBirth;
    }
}
```

---

# További metódusok használata

```java
Trainer trainer = new Trainer();
trainer.name = "John Doe";
trainer.yearOfBirth = 1980;
System.out.println(trainer.getNameAndYearOfBirth());
System.out.println(trainer.getAge(2019));
```


---

# Módosító metódus

* Paraméter neve elfedi az attribútum nevét
* A `this` kulcsszóval mondjuk meg, hogy az attribútum értékét akarjuk módosítani

```java
public void changeName(String name) {
    this.name = name;
}
```

```java
Trainer trainer = new Trainer();
trainer.name = "John Doe";
trainer.changeName("Jack Doe");
System.out.println(trainer.name);
```


---

# Getter és setter metódusok

```java
public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getYearOfBirth() {
    return yearOfBirth;
}

public void setYearOfBirth(int yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
}
```

---

# Getter és setter hívás

```java
Trainer trainer = new Trainer();
trainer.setName("John Doe");
System.out.println(trainer.getName());
trainer.setName("Jack Doe");
System.out.println(trainer.getName());
```
---

# Attribútumok láthatósági módosítója

* Information hiding - `private` módosítóval rendelkező attribútumokhoz nem lehet kívülről hozzáférni

```java
public class Trainer {

    private String name;

    private int yearOfBirth;

}
```


class: inverse, center, middle

# Konstruktorok

---

# Konstruktor

* Állapot inicializálására
* Példányosításkor fut le

---

# Példa konstruktor

```java
package trainerapp;

public class Trainer {

    private String name;

    private int yearOfBirth;

    public Trainer() {
        this.name = "John Doe";
        this.yearOfBirth = 1980;
    }

    // getter és setter metódusok

}
```

```java
Trainer trainer = new Trainer();
System.out.println(trainer.getName());
```

---

# Paraméteres konstruktor

```java
package trainerapp;

public class Trainer {

    private String name;

    private int yearOfBirth;

    public Trainer(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    // getter és setter metódusok

}
```

```java
Trainer trainer = new Trainer("John Doe", 1980);
System.out.println(trainer.getName());
```

class: inverse, center, middle

# Osztályok

---

# Osztály felépítése

* Egységbezárás: osztály egységbe zárja az adatokat és a rajtuk végzett műveleteket
* Csomagokba rendezzük
* Attribútumok: állapot - adatok, értékek tárolására
    * Az attribútumokhoz közvetlenül nem lehet hozzáférni, csak getter és setter metódusokon keresztül
* Metódusok: állapot lekérdezésére és módosítására
    * Speciális metódusok: getter és setter
* Konstruktorok: állapot inicializálására

---

# UML ábrázolás

* Egységes jelölőnyelv
* Diagramtípusok
* Osztálydiagram
* Osztályok és kapcsolatok

---

# UML osztálydiagram

![UML osztálydiagram](images/trainer_class.png)

---

# Kapcsolatok

![UML osztálydiagram kapcsolatokkal](images/trainer_class_association.png)

---

# Beolvasás konzolról

```java
public static void main(String[] args) {
    System.out.println("What is your name?");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();

    System.out.println("Year of birth?");
    int yearOfBirth = scanner.nextInt();

    Trainer trainer = new Trainer(name, yearOfBirth);

    System.out.println(trainer.getName());
    System.out.println(trainer.getNameAndYearOfBirth());
    System.out.println("Age: " + trainer.getAge(2019));
}
```



## A nyelv építőkövei
class: inverse, center, middle



# Kódolási konvenciók

---

# Kódformázás

* http://www.oracle.com/technetwork/java/codeconvtoc-136057.html
* [Google Java Style Code](https://google.github.io/styleguide/javaguide.html)
* IDE támogatás
* Behúzás

---

# Elnevezések

* Karakterkészlet
* Kulcsszavak
* CamelCase
* Mozaikszavak

---

# Megjegyzések

* Egysoros megjegyzések
* Többsoros megjegyzések
* Dokumentációs megjegyzések

---

# Sorrendezés

* Csomag definíció
* Importok
* Osztály neve
* Attribútumok
* Konstruktorok
* Metódusok
* Publikus tagok előre?




class: inverse, center, middle



# Literálok és lokális változók

---

# Bevezetés a literálok használatába

* Leírva önmagában is van jelentése
* Logikai `true` vagy `false`
* Egész szám decimális számrendszerben, pl. `12`, típusa `int` primitív típus, 
nagy esetén olvashatóság javítható, pl. `1_000_000`
* Lebegőpontos szám decimális számrendszerben, pl. `3.14`, típusa `double` primitív típus, a `0.0` is
* Speciális `null` literál
* Osztály típusú, speciális `String` literál

---

# Lokális változók

* Metóduson belüli változók

---

# Típusa

* Java szigorúan típusos nyelv
* Primitív típus, pl. `boolean`, `int`, `double`
* Osztály típusú, pl. `String`, `Integer`, `ArrayList`

---

# Típuskonverzió

* Automatikus: pl. `int` értékből `double` értékbe
* Explicit: pl. `double` értékből `int` értékbe, pl. `(int) 3.14`

---

# Metóduson belüli változók

* Láthatósága a definíciótól a blokk végéig, és az összes utána következő tartalmazott blokkban
* Nincs default inicializálás
* Értékadás

---

# Élettartam

* Metódus hívás végéig
* Amíg van rá referencia, és a GC úgy nem dönt, hogy kidobja


class: inverse, center, middle



# Kifejezések és utasítások

---

# Kifejezések

* Tipikusan egy érték kiszámítására
* Tartalmazhat operátorokat, operandusokat (változók, metódushívások)

---

# Operátorok

* Gyakori operátorok, matematikai operátorok `+`, `-`, `*`, `/`
* Példányosításra a `new` operátor
* Értékadó operátor `=`
* Összehasonlítás, egyenlőségvizsgálat, pl. `<`, `<=`, `>`, `>=`, `==`
* Logikai operátorok, pl. `!`, `&&`, `||`
* Egy operandusú operátor, pl. `++`, `--`
* Háromoperandusú operátor `?:`
* Megfelelő zárójelezés

---

# Utasítás

* Értékadó utasítás
* Kifejezés egy operandusú operátorral
* Példányosítás
* Metódushívás
* Vezérlő utasítások

class: inverse, center, middle



# Csomagok

---

# Csomagok célja

* Strukturáltság (pl. alkalmazás rétegek, funkciók)
* Névütközés feloldására
* Láthatóság

---

# Csomagok használata

* Könyvtár és package struktúra
* Default csomagok használata (nem javasolt)
* Javasolt elnevezési konvenció: domain név, fordítva
* A `package` kulcsszó használata
* Az `import` kulcsszó használata
* Wildcard használata (nem javasolt)

---

# Csomag minősítő használata

* `import` kulcsszó nélkül
* Névütközés kezelése


class: inverse, center, middle



# Java API

---

# Java API

* Gazdag osztálykönyvtár
  * Pl.: párhuzamosság, naplózás, reguláris kifejezések, dátum és időkezelés, XML kezelés, adatbázis kezelés, felhasználói felületek
* Csomagokba szervezve
* Dokumentációja: https://docs.oracle.com/en/java/javase/12/docs/api/index.html
* `java.lang` csomag automatikusan <br />importálásra kerül
* Forráskód (`src.zip`)


class: inverse, center, middle



# JAR állomány

---

# JAR állomány

* Terjesztéshez
* ZIP formátumú
* Maven támogatás
* JVM classpath (`java -classpath`)

---

# Futtatható JAR állomány

* Maven konfiguráció
* JAR `META-INF/MANIFEST.MF`
* JVM `-jar` kapcsoló


class: inverse, center, middle



# Szöveges típus

---

# `String` típus

* Osztály
* Literál, objektumot példányosít a JVM
* Üres `String`
* Konkatenáció
* Egyenlőségvizsgálat

---

# Néhány hasznos metódus

* `indexOf()`
* `length()`
* `substring()`


class: inverse, center, middle

# Sortörés

---

# Sortörés karakterek

* Nem látható karakter, azt eredményezi, hogy a következő szöveg új sorban jelenik meg
* Máshogy reprezentálják különböző operációs rendszerekben
    * Windows: két bájt, Carriage Return + Line Feed (CRLF), azaz kocsivissza + soremelés
    * Linux: egy bájt, Line Feed, csak soremelés

---

# Kiírás sortöréssel

```java
System.out.println("John");
System.out.println("Doe");
```

```plaintext
John 
Doe
```

* Sortörés nélkül

```java
System.out.print("John");
System.out.print("Doe");
```

```plaintext
JohnDoe
```

---

# Sortörés karakter Javaban

* Kocsivissza: `\r`, soremelés: `\n`

---

# Sortörés karakter használata

Windowsban helyesen:

```java
System.out.println("John\r\nDoe");
```

Linuxban helyesen:

```java
System.out.println("John\nDoe");
```

* Windows esetén is gyakran ezt használjuk

```plaintext
John
Doe
```

---

# Önmagában álló sortörés karakter

```java
System.out.println("John" + "\n" + "Doe");
```
---

# Sortörés operációs rendszer függetlenül

* Lekérhető a `System.lineSeparator()` metódus meghívásával

```java
System.out.println("John" + System.lineSeparator() + "Doe");
```

---

# Hosszú Stringek tárolása

```java
String names = "John Doe " +
               "Jack Doe " +
               "Jane Doe";
```

```plaintext
John Doe Jack Doe Jane Doe
```

Sortöréssel:

```java
String names = "John Doe\n" +
               "Jack Doe\n" +
               "Jane Doe\n";
```

```plaintext
John Doe 
Jack Doe 
Jane Doe
```


class: inverse, center, middle



# Dátum- és időkezelés alapok

---

# Használt osztályok

* `java.time` csomagban
* `LocalDate` csak dátumot tartalmaz idő nélkül
* `LocalTime` csak időt tartalmaz
* `LocalDateTime` időt és dátumot is tartalmaz

---

# Létrehozásuk

```java
LocalDate date = LocalDate.of(2015, Month.JANUARY, 20);
LocalDate anotherDate = LocalDate.of(2015, 1, 20);

LocalDateTime dateTime = LocalDateTime.of(2015, Month.JANUARY, 20, 10, 15);
LocalDateTime anotherDateTime = LocalDateTime.of(2015, Month.JANUARY, 20, 10, 15, 30);
LocalDateTime thirdDateTime = LocalDateTime.now();

LocalTime time = LocalTime.of(10, 15);
```
---

# Kiírása

* ISO-8601 szabvány szerint

```java
System.out.println(dateTime); // 2015-01-20T10:15
```

class: inverse, center, middle



# Bevezetés a vezérlési szerkezetekbe

---

# Elágazás

* Vezérlési szerkezet
* `if`, `else` kulcsszavak használata, blokk

```java
if ((x % 2) == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

---

# Ciklus

* Ciklus képzése `for` kulcsszóval

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```




## Bonyolultabb típusok
class: inverse, center, middle

# Tömbök

---

# Tömbök

* Létrehozás a `new` kulcsszóval
* Kezdőérték
* Indexelés 0-tól
* Indexhatár ellenőrzés (`IndexOutOfBoundsException`)
* Hossza a `length` használatával
* Tömbliterál, primitív és objektum típus esetén
* Tömb elemeinek bejárása
* `System.arraycopy()`


class: inverse, center, middle

# Parancssori paraméterek

---

# Parancssori paraméterek

* A `main` metódus paramétere egy `String[]` tömb
    * Ebben kapja meg a parancsori paramétereket
    * Beállítható parancssori futtatáskor, de a fejlesztőeszközben is

---

# Main metódus

```java
public static void main(String[] args) {
  System.out.println(args.length);
  System.out.println(args[0]);
  System.out.println(args[1]);
}
```

Futtatás:

```shell
java TrainerMain John 1970
java TrainerMain John Doe 1970
java TrainerMain "John Doe" 1970
java -jar trainers.jar John 1970
```



class: inverse, center, middle



# Tömbök tömbje

---

# Tömbök tömbje

* Nincs többdimenziós tömb
* De egy tömb tömbökből is állhat
* Nem kell minden elemnek azonos hosszúnak lennie


class: inverse, center, middle



# Tömbök kezelése

---

# `Arrays` osztály használata

* Statikus metódusok gyűjteménye
* `toString()` metódus
* `asList()` metódus
* `deepToString(Object[] a)` metódus
* `equals()` és `deepEquals()` metódus
* `sort()` metódus
* `copyOf()` és `copyOfRange()` metódus


class: inverse, center, middle



# Lista

---

# `ArrayList` osztály

* Definiálása mindig `List`-tel
* Elemek sorrendben
* Generikus (`List<String>`), diamond operátor
* `toString()`
* Tömbök helyett inkább ez használatos <br/> dinamikus volta miatt
* `Arrays.asList()` metódus, változó <br /> paraméterlista

---

# `List` metódusok

* `add()`
* `get()`
* `clear()`
* `contains()`
* `indexOf()`
* `remove()`
* `size()`

---

# Bejárás

* for-each ciklussal


class: inverse, center, middle

# Lista létrehozása

---

# Lista létrehozása példányosítással

```java
List<String> names = new ArrayList<>();
names.add("John");
names.add("Jack");
names.add("Jane");
```

* Módosítható lista, elem hozzáadható, módosítható, törölhető

---

# Lista létrehozása `Arrays.asList()` metódussal

```java
List<String> names = Arrays.asList("John", "Jack", "Jane");
```

* Ún. _fix méretű lista_
* Ha megpróbálunk elemet hozzáadni, `UnsupportedOperationException` kivétel keletkezik
* Elemet lehet módosítani

---

# Módosítható lista létrehozása `Arrays.asList()` metódussal

```java
List<String> names = new ArrayList(Arrays.asList("John", "Jack", "Jane"));
```



class: inverse, center, middle

# Ciklusok fajtái

---

# Ciklusok szintaxisa tömbbel

* For ciklus tömbbel

```java
String[] names = {"John", "Jack" , "Jane"};
for (int i = 0; i < names.length; i++)  {
    System.out.println(names[i]);
}
```

* For-each ciklus tömbbel (nem hivatalos elnevezés)

```java
String[] names = {"John", "Jack" , "Jane"};
for (String name: names)  {
    System.out.println(name);
}
```

---

# Ciklusok szintaxisa listával

* For ciklus listával

```java
List<String> names = Arrays.asList("John", "Jack", "Jane");
for (int i = 0; i < names.size(); i++)  {
    System.out.println(names.get(i));
}
```

* For-each ciklus listával

```java
List<String> names = Arrays.asList("John", "Jack", "Jane");
for (String name: names)  {
    System.out.println(name);
}
```

---

# Legjobb gyakorlat

* Kerüljük a tömbök használatát
* Amikor csak lehet, használjunk for-each ciklust az átláthatóság miatt
* Használjunk for ciklust, ha szükségünk van az indexre

```java
List<String> names = Arrays.asList("John", "Jack", "Jane");
for (int i = 0; i < names.size(); i++) {
    System.out.println(i + ". elem: " + names.get(i));
}
```

* Sose égessük be a for ciklus fejébe az elemszámot

---

# Legjobb gyakorlat - speciális bejárás

* Visszafele

```java
List<String> names = Arrays.asList("John", "Jack", "Jane");
for (int i = names.size() - 1; i >= 0; i--) {
    System.out.println(names.get(i));
}
```

* Minden második elem

```java
List<String> names = Arrays.asList("John", "Jack", "Jane");
for (int i = 0; i < names.size(); i += 2) {
    System.out.println(names.get(i));
}
```

---

# Előző elemek

* Az adott elem kisebb vagy nagyobb-e mint az előző

```java
List<Integer> numbers = Arrays.asList(1, 2, 1, 2, 3, 1);
for (int i = 1; i < numbers.size(); i++) {
    if (numbers.get(i - 1) < numbers.get(i)) {
        System.out.println("nő");
    }
    else if (numbers.get(i - 1) > numbers.get(i)) {
        System.out.println("csökken");
    }
}
```

---

# Hiba az indexeléssel

* Egy `n` elemű tömb vagy lista `0`-tól `n - 1`-ig indexelhető
* Amennyiben az index ezektől eltér, `ArrayIndexOutOfBoundsException` kivétel keletkezik
* Vigyázzunk a helyes indexelésre


class: inverse, center, middle

# Módosítás bejáráskor

---


# Tömb módosítása

* Ciklusváltozónak nincs hatása a tömbre!

```java
int[] numbers = {1, 2, 3};
for (int number: numbers) {
    number = 0;
}
```

```java
int[] numbers = {1, 2, 3};
for (int i = 0; i < numbers.length; i++) {
    numbers[i] = numbers[i] * 2;
}
```

---

# Lista módosítása klasszikus ciklussal

```java
List<String> names = new ArrayList<>(Arrays.asList("John", "Jack", "Jane"));
for (int i = 0; i < names.size(); i++) {
    names.set(i, i + ". " + names.get(i));
}
```

---

# Lista módosítása bejárás közben

```java
List<String> names = new ArrayList<>(Arrays.asList("John", "Jack", "Jane"));
for (String name: names) {
    if (name.equals("Jane")) {
        names.remove("Jane");
        // vagy names.add(0, "Joe");
    }
}
```

* `ConcurrentModificationException` kivétel keletkezik

---

# Elem vagy elemek törlése

```java
List<String> names = new ArrayList<>(Arrays.asList("John", "Jack", "Jane"));
List<String> elementsToRemove = new ArrayList<>();
for (String name: names) {
    if (name.substring(0, 2).equals("Ja")) {
        elementsToRemove.add(name);
    }
}
names.removeAll(elementsToRemove);
```

class: inverse, center, middle



# Debug

---

# Debugger

* Fejlesztőkörnyezet által biztosított eszköz hibakeresésre
* Breakpoint
* Attribútumok, változók értékei
* Kifejezés kiértékelése
* Léptetés, továbbfuttatás, leállítás
* Érdemes teszteseten használni

class: inverse, center, middle



# Konstans értékek használata

---

# `final` módosító szó

* `final` módosítóval ellátott változónak csak egyszer adható érték
* attribútumnál, metódus paraméternél, lokális változónál használható

---

# Kvázi konstans

* Javaban nincs konstans fogalom
* Konstansszerű értékeket tipikusan `static final` módosítókkal látunk el
* Elnevezési konvenció, csupa nagybetűkkel és aláhúzás jelekkel elválasztva
* Helye a felhasználáshoz közel
* Használata saját és más osztályból
* Static import


class: inverse, center, middle



# Math és Random osztály

---

# `Math` osztály

* `E` és `PI` konstans
* Kerekítések
* Szögfüggvények
* Abszolútérték, minimum, maximum

---

# `Random` osztály

* Pseudorandom fogalma
* Seed fogalma
* `nextInt()` és `nextInt(int bound)` metódusok




## Részletesebben az osztályokról és objektumokról
class: inverse, center, middle



#Objektumok

---

# Objektumok

* Osztály csak egy típus, egy minta
* Konkrét példányosítással egy objektum, egy osztály példánya
* Állapota van, az attribútumainak értéke a memóriában
* A változó csak egy név, melynek típusa van, értéke
  * Speciális `null` érték
  * Referencia az objektumra
* Változó értékadás referencia változtatás
* Tömbben szerepelhetnek
* Kollekciókban szerepelhetnek
* Más osztály attribútuma


class: inverse, center, middle



# Bevezetés az attribútumok használatába

---

# Típusa

* Objektum állapota
* Java szigorúan típusos nyelv
* Primitív típus
* Osztály típusú, objektumok közötti kapcsolat (kollekció is), UML ábrázolás

---

# Attribútumok

* Láthatósága az objektumon keresztül, láthatósági módosítószótól függ
  * Senki számára sem látható
  * Csomagban látható
  * Csomagban és leszármazottban látható
  * Mindenki számára látható
* Értékadás tipikusan konstruktoron vagy metóduson keresztül
* Getter és setter metódusok (`boolean` és egyéb típus esetén)
* Default érték `null`, szám típus esetén `0` vagy `0.0`

---

# Élettartam

* Amíg a GC úgy nem dönt, hogy kidobja


class: inverse, center, middle



# Bevezetés a konstruktorok használatába

---

# Konstruktorok

* Objektum állapotának inicializálására
* Neve az osztály nevével megegyező, nincs visszatérési értéke
* Default konstruktor
* Példányosításkor kerül meghívásra

---

# Konstruktor paraméterek

* Formális paraméter különbözik az attribútumtól
* A formális paraméter elfedi az attribútumot, hivatkozás a `this` kulcsszóval


class: inverse, center, middle



# Bevezetés a metódusok használatába

---

# Metódusok

* Két típust szeretünk megkülönböztetni, és ez alapján elnevezni
  * Lekérdező (pl. getter metódusok is ide tartoznak)
  * Állapotot módosító (pl. setter metódusok is ide tartoznak)
* Imperatív programozás eszközei
* Utasításokat tartalmaz
* Attribútumokhoz fér hozzá
* Lokális változókat definiálhat és fér hozzá

---

# Metódus felépítése

* Szignatúra és törzs
* Paraméterlista

---

# Metódushívás

* Hívhat más metódusokat
  * Saját példányon belül
  * Attribútumok (objektumok) metódusait
  * Lokális változók (objektumok) metódusait

---

# Metódus paraméterek

* Formális paraméterek elfedhetik az attribútumokat,
hivatkozás a `this` kulcsszóval
* Lokális változók elfedhetik az attribútumokat,
lehetőleg kerüljük
* Formális paraméterek láthatósága a metódus törzsében
* Lokális változók láthatósága blokkszintű, deklarációtól kezdve

---

# Speciális metódusok

* `toString()` metódus


class: inverse, center, middle

# Referenciák

---

# Stack (verem)

* Metódusonként lefoglalt memóriaterület: stack (verem)
* Primitív típusnál az érték a stacken kerül letárolásra

```java
public static void main(String[] args) {
  int yearOfBirth = 1980;  // Stacken jön létre  
}
```

---

# Stack ábra

![Stack](images/stack.png)

---

# Heap

* Objektumoknak lefoglalt memóriaterület: heap
* Objektum, pontosabban annak állapota a heapen kerül letárolásra
* Referencia, amit a változónév hordoz a stacken kerül letárolásra

```java
public static void main(String[] args) {
  String employeeName = "John Doe";
    // "John Doe" string objektum a heapen jön létre
    // name, ami egy referencia, a stacken jön létre
  Employee jack = new Employee("Jack Doe", 1970);  
    // alkalmazott objektum a heapen jön létre
    // john, ami egy referencia, a stacken jön létre
}
```

---

# Heap ábra

![Heap](images/heap.png)


---

# Objektum gráf

* Attribútumokkal bonyolult objektumgráf alakítható ki

![Stack](images/graph.png)

---

# Referenciák használata

* Értékadás referenciának: ugyanarra az objektumra fog mutatni
* Referencia, azonosság ellenőrzés a `==` operátorral
    * Ez nem egyezik meg az állapot egyenlőségének vizsgálatával


```java
public static void main(String[] args) {
  Employee jack = new Employee("Jack Doe", 1970);
  Employee sameJack = jack;  
  
  System.out.println(john == sameJack); // true
  
  Employee anotherJack = new Employee("Jack Doe", 1970);
  
  System.out.println(jack == anotherJack); // false
}
```

---

# Referenciák használata ábra

![Stack](images/operator.png)

---

# Objektum referencája önmagára

* Önmagára referencia `this`, mely a metódusokban elérhető, <br /> főleg elfedéskor használjuk

```java
public class Employee {
  private String name;
  
  public void setName(String name) {
    this.name = name;
  }
}
```



class: inverse, center, middle

# Kompozíció

---

# Miért van rá szükség?

* Tegyük fel, hogy az oktató rendelkezik cím adatokkal

```java
public class Trainer {

    private String name;

    private String city;

    private String line1;
}
```

* Rendelkezzen a hallgató is cím adatokkal!
* Nem jó, ha abban is felvesszük a `city` és `line1` attribútumokat, kódismétlés

---

# Megoldás

* Új `Address` osztály felvétele, `Trainer` osztályban mint attribútum
* Újrafelhasználhatóság
* Attribútumok egy csoportja kiemelve külön osztályba

---

# Megoldás kódban

```java
public class Address {

    private String city;

    private String line1;

    // Getter és setter metódusok, konstruktor
}
```

```java
public class Trainer {

    private String name;

    private Address address;

    // Getter és setter metódusok, konstruktor
}
```
---

# Viselkedése

```java
Trainer trainer = new Trainer("John Doe");
System.out.println(trainer.getAddress()); // null
```

Ha írunk hozzá settert

```java
Trainer trainer = new Trainer();
Address address = new Address("Budapest", "Váci utca");
trainer.setAddress(address);
// Vagy azonnal közbülső változó nélkül: trainer.setAddress(new Address("Budapest", "Váci utca"));

// Lekérdezhető külön
Address address = trainer.getAddress();
System.out.println(address.getCity()); // Budapest

// Lekérdezhető metódushívások láncolásával
System.out.println(trainer.getAddress().getCity()); // Budapest
```

---

# Konstruktorban átadva

```java
Trainer trainer = new Trainer("John Doe", new Address("Budapest", "Váci utca"));
```

---

# Mindez a memóriában

![Memória](images/composition-memory.png)

---

# UML jelölés

![UML diagram](images/composition-class-diagram.png)

class: inverse, center, middle

# Kompozíció listával

---

# Miért van rá szükség?

* Tegyük fel, hogy az oktató több cím adattal rendelkezik

```java
public class Trainer {

    private String name;

    private List<Address> addresses;

    // getterek, setterek, konstruktor
}
```

---

# Alapértelmezett érték

```java
Trainer trainer = new Trainer();
System.out.println(trainer.getAddresses()); // null
```

---

# Lista feltöltése

```java
Trainer trainer = new Trainer();
List<Address> addresses = new ArrayList<>(Arrays.asList(
    new Address("Budapest", "Váci utca"), new Address("Pécs", "Fő utca")));
trainer.setAddresses(addresses);
// vagy azonnal 
// trainer.setAddresses(new ArrayList<>(Arrays.asList(
// new Address("Budapest", "Váci utca"), new Address("Pécs", "Fő utca"))));
```

---

# Hozzáférés a listához

```java
List<Address> addresses = trainer.getAddresses();
addresses.add(new Address("Győr", "Bástya u."));

// Vagy metódusok láncoltan hívva
String city = trainer.getAddresses().get(0).getCity();
```

---

# Inicializálás üres listával

```java
public class Trainer {

    private String name;

    private List<Address> addresses = new ArrayList<>();
}
```

---

# Legjobb gyakorlat

```java
public class Trainer {

    private String name;

    private List<Address> addresses = new ArrayList<>();

    public void addAddress(Address address) {
        addresses.add(address);
    }
}
```

---

# Kezdőérték átadás konstruktorban

```java
public class Trainer {

    private String name;

    private List<Address> addresses;

    public Trainer(String name, List<Address> addresses) {
        this.name = name;
        this.addresses = addresses;
    }
}
```

```java
List<Address> addresses = new ArrayList<>(Arrays.asList(
    new Address("Budapest", "Váci utca"), new Address("Pécs", "Fő utca")));
Trainer trainer = new Trainer("John Doe", addresses);
  // Vagy akár egy utasításban
```


---

# Memóriában

![Memória](images/composition-list-memory.png)

---

# UML jelölés

![UML diagram](images/composition-list-class-diagram.png)



## Projektfeladat
class: inverse, center, middle

# MeetingRoom projektfeladat

---

# Tárgyalók nyilvántartása

* Konzolos menü

```
1. Tárgyalók sorrendben
2. Tárgyalók visszafele sorrendben
3. Minden második tárgyaló
4. Területek
5. Keresés pontos név alapján
6. Keresés névtöredék alapján
7. Keresés terület alapján
8. Kilépés
```

---

# UML diagram

![Tárgyalók UML diagram](images/meetingrooms.png)

# A Java nyelv részletes megismerése
## Típusok és operátorok
class: inverse, center, middle



# Literálok

---

# Objektumliterál

* Objektumliterál: `null`

---

# Logikai literál

* `true` és `false` logikai értékek

---

# Egész számok

* Bináris, pl. `0b0011`
* Oktális, pl. `0377`
* Hexadecimális, pl. `0xff`
* Decimális, pl. `12`
* Típusa `int`, `l` vagy `L` karakterrel módosítható
* Olvashatóság javítására `_` karakter
	* `0b0011_1100` vagy `100_000`

---

# Lebegőpontos számok

* Decimális megadási mód, pl. `-12.3`
* Exponens használata, pl. `-12.3e4`
* Típusa `double`, vagy `f` vagy `F` karakterrel `float` típussá módosítható

---

# Karakteres literálok

* Karakter
  * Encoding (fájl és belső reprezentáció kódolása eltérhet)
  * Fájl encoding megadása Mavenben
  * Speciális karakterek, pl. `\n`, `\"`, `\\`
  * Karakter oktális vagy hexadecimális számrendszerben: `\017` vagy `\u01AF`
* Szöveg
  * Objektumként jön létre
* Típust reprezentáló osztály objektum
  * pl. `String.class`


class: inverse, center, middle



# Egyszerű típusok

---

# Egyszerű típusok 1.

* `boolean`, csomagoló osztálya `Boolean`, logikai
* `char`, csomagoló osztálya `Character`, 16 bites Unicode karakter (UTF-16)
* `byte`, csomagoló osztálya `Byte`, 8 bites előjeles egész szám
* `short`, csomagoló osztálya `Short`, 16 bites előjeles egész szám
* `int`, csomagoló osztálya `Integer`, 32 bites előjeles egész szám
* `long`, csomagoló osztálya `Long`, 64 bites előjeles egész szám

---

# Egyszerű típusok 2.

* `float`, csomagoló osztálya `Float`, 32 bites lebegőpontos racionális szám
* `double`, csomagoló osztálya `Double`, 64 bites lebegőpontos racionális szám

---

# Autoboxing

* Fordító végzi
* Egyszerű típus és csomagoló közötti konverzió

---

# Számrendszerek

* `Integer.toString(100, 8)` oktális számrendszerben
* `Integer.toString(100, 2)` bináris számrendszerben
* `Integer.toString(100, 16)` hexadecimális számrendszerben
* Kettes komplementer tárolás
  * `Integer.toBinaryString(100)`

---

# Szövegből átalakítás

* `new Integer("123")`
* `int Integer.parseInt("123")`

---

# "Szélsőséges" eredmények

* Pl. `Integer.MIN_VALUE`, `Integer.MAX_VALUE`
* IEEE szabvány
  * `1.0 / 0` eredménye `Double.POSITIVE_INFINITY`
  * `-1.0 / 0` eredménye `Double.NEGATIVE_INFINITY`
  * `Double.POSITIVE_INFINITY / Double.NEGATIVE_INFINITY` eredménye `NaN`


class: inverse, center, middle

# Karakter

---

# Karakterkódolás

* Minden karakterhez egy egyedi számot rendel
* Régebbi karakterkódolási rendszer: ASCII
  * 7 biten tárolható, azaz 128 különböző jel tárolására alkalmas
  * Pl. a `A` betű karakterkódja 65, `Z` betű karakterkódja 90, a `a` karakterkódja 97
  * Pl. a magyar ékezetes karaktereket nem ábrázolja

---

# ASCII tábla

![ASCII](images/ASCII_Code_Chart.svg.png)

---

# Unicode

* Különböző írásrendszerek egységes kódolását és használatát leíró szabvány
* Segítségével egységesen ábrázolható egy latin betű, egy magyar ékezetes karakter,
  japán kandzsi (szóírás), magyar rovásírás, stb.
* Majdnem 150 ezer jel, több, mint 150 ábécét, valamint számos szimbólumkészletet fed le
* Unicode szövegeket különböző karakterkódolással tárolhatunk
* Ebből a leggyakoribb az UTF-8, amikor a karaktereket változó hosszon tárolja (1-4 bájt)
  * Első 128 karaktere az ASCII-val megegyezik

---

# Karakter a Javaban

* Karakterliterál aposztrófok között

```java
System.out.println('a');
```

* Számként is típuskényszeríthető

```java
System.out.println((int) 'a'); // 97
```

---

# A karakter összehasonlítható

```java
char c = 'p';
System.out.println(c == 'p');
System.out.println(c < 'q');
```

---

# Karakter eltolás

```java
char c = 'a';
char d = (char)(c + 1); // b
```

---

# Számjegy vagy betű?

* A számjegynek is van kódja (pl. `0` számjegynek `48`)

```java
System.out.println((int) '0'); // 48
```

```java
System.out.println('a' < c && c < 'z'); // Kisbetű
System.out.println('0' < c && c < '9'); // Számjegy
```

---

# Számjegy vagy betű - előregyártott metódusok

```java
System.out.println(Character.isAlphabetic(c));
System.out.println(Character.isDigit(c));
System.out.println(Character.isWhitespace(c));
```

---

# String egy karakterének lekérdezése

```java
String s = "Hello Java 8";
System.out.println(s.charAt(0)); // H
```

![Karakterek](images/chars.png)

---

# String, mint karakterek tömbje

* String a `toCharArray()` metódussal karakterek tömbjévé (`char[]`) alakítható
* Érdemes for-each ciklussal bejárni

```java
String s = "Hello Java 8";
System.out.println(s.toCharArray()[0]); // H

for (char c: s.toCharArray()) {
    System.out.println(c);
    System.out.println(Character.isAlphabetic(c));
}
```

---

# Tömbből String

```java
char[] chars = {'a', 'b', 'c'};
String s = new String(chars);
System.out.println(s); // abc
```

class: inverse, center, middle

# Felsorolásos típus

---

# Felsorolásos típus

* Osztály (attribútummal, konstruktorral, metódussal rendelkezhet)
* Csak a definiált elemeket lehet neki értékül adni
* Konstansok, nagybetűvel
* Sorrendiség, index, elemei for ciklussal bejárhatóak
* Switch-ben használható
* Gyakran használjuk logikai értékek helyett is

---

# Hasznos metódusok

* `valueOf()`
* `name()`
* `ordinal()`


class: inverse, center, middle



# Operátorok

---

# Operátorok kiértékelési sorrendje

* Először a belső zárójel tartalma
* Nagyobb precedenciájú operátor
* Balról jobbra, néhány operátor esetében jobbról balra

---

# Precedenciatáblázat 1

* Postfix operátor (`kifejezés++`, `kifejezés--`)
* Prefix operátor (`++kifejezés`, `--kifejezés`)
* További egyoperandusú operátorok (`+`, `-`, `!`)
* Multiplikatív operátorok (`*`, `/`, `%`)
* Additív operátorok (`+`, `-`)
* Léptető műveletek (`<<`, `>>`, `>>>`)
* Összehasonlítás (`<`, `<=`, `>`, `>=`)
* Egyenlőségvizsgálat (`==`, `!=`)

---

# Precedenciatáblázat 2

* Bitenkénti ÉS (`&`)
* Bitenkénti KIZÁRÓ VAGY (`^`)
* Bitenkénti VAGY (`|`)
* Logikai ÉS (`&&`)
* Logikai VAGY(`||`)
* Feltételes kifejezés (`? :`)
* Értékadások (`=`, `+=`, `-=`, `*=`, `=`, `>>=`, `<<=`, `>>>=`, `&=`, `^=`, `|=`)

---

# Léptető műveletek 1

* `9` binárisan `1001`, `Integer.toBinaryString(9)`
* `Integer.toBinaryString(9 >> 1)` eredménye `100`
* `Integer.toBinaryString(9 << 1)` eredménye `10010`

---

# Léptető műveletek 2

* `Integer.toBinaryString(Integer.MIN_VALUE)` értéke `10000000000000000000000000000000`
* `Integer.toBinaryString(Integer.MIN_VALUE >> 1)` értéke `11000000000000000000000000000000`
  * Legmagasabb helyiértékű bit lép be
* `Integer.toBinaryString(Integer.MIN_VALUE >>> 1)` értéke `01000000000000000000000000000000`
  * Balról nulla lép be
* Segítség visszafele konvertáláshoz: `Integer.parseInt(String, int)`, második paramétere a számrendszer

---

# Bitenkénti operátorok

* Egész számok esetén a bináris reprezentáció minden bitjére végrehajtja
* Az ÉS (`&`) eredménye csak akkor 1, ha minden operandus 1
* A VAGY (`|`) eredménye csak akkor 0, ha minden operandus 0
* A KIZÁRÓ VAGY (`^`) eredménye csak akkor 1, ha az operandusok eltérnek

---

# Logikai operátorok

* Egész számok esetén a bináris reprezentáció minden bitjére végrehajtja
* Az ÉS (`&&`) eredménye csak akkor `true`, ha minden operandus `true`
* A VAGY (`||`) eredménye csak akkor `false`, ha minden operandus `false`

---

# Rövidzár kifejezés

* `true || (1/0 == 0)` kifejezés értéke `true`
* `true | (1/0 == 0)` kifejezés kiértékelése közben `java.lang.ArithmeticException:` keletkezik `/ by zero` üzenettel

---

# Értékadás

Az értékadás operátornak is van eredménye (a bal oldali változóba kerülő érték), és ez tovább használható operandusként




class: inverse, center, middle



# Típuskonverzió

---

# Típuskonverzió

* Erősen típusos nyelv
* Kifejezésben összeegyeztethető típusok vannak-e
* Főleg fordítási időben ellenőrizhető
* Futási időben kivétel

---

# Automatikus konverzió

* Bővebb ábrázolt tartomány felé van automatikus típuskonverzió
* `float` változónak adható `long` érték, `double` változónak adható `long` érték, adatvesztéssel járhat
* `byte`, `short`, `char` típusnak értékül adható megfelelő `int` literál

---

# Automatikus konverziók

![Automatikus konverziók](images/automatic_conversions.png)

---

# Explicit konverzió

* Szűkebb ábrázolási tartomány felé kell explicit típuskonverzió
* Információvesztés történhet
* Egész számok esetén a felső bitek elvesznek
* Lebegőpontos számok egészre konvertálásakor nem kerekítés történik



class: inverse, center, middle

# Egész és lebegőpontos számok

---

# Osztás egésszel

```java
double d = 1 / 2;
System.out.println(d); // 0
```

Megoldás

```java
double d = 1 / 2.0;
```

```java
double d = 1 / 2D;
```

```java
double d = (double) 1 / 2;
```

---

# Lebegőpontos számok összehasonlítása

```java
System.out.println(0.1 * 3 == 0.3); // false
```

```java
System.out.println(0.1 * 3); // 0.30000000000000004
```

Megoldás

```java
System.out.println(Math.abs(0.1 * 3 - 0.3) < 0.005); // true
System.out.println(Math.abs(0.1 * 3 - 0.3) < 1.0e-15); // true
```


class: inverse, center, middle

# Konverziók

---

# Különböző konverziók

* Típuskényszerítés
* Boxing és unboxing
* parse/format

---

# Típuskényszerítés

* Ha eltér a primitív típusú változók (literálok) típusa: típuskényszerítés (cast)
  * Pl. `byte` és `int` között
  * Két fajtája: automatikus (nagyobb ábrázolási tartomány felé), explicit (kisebb ábrázolási tartomány felé)
  * Típuskényszerítés operátorral (kerek zárójelek között)

---

# Boxing és unboxing

* Primitív típus és hozzá tartozó burkoló osztály között: boxing
  * Primitívből osztályba: boxing, fordítva: unboxing
  * Metódushívással
  * Nem is szükséges metódushívás: autoboxing és autounboxing

---

# Parse és format

* Szöveg és primitív típus között
  * Szövegből primitív típus: parse
  * Primitívből szöveggé: szöveggé alakítás

---

# Típuskényszerítés 

* Explicit típuskényszerítés kell, mert kisebb ábrázolási tartományba konvertálunk, adat veszhet el

```java
int i = 900;
byte b = (byte) i;
```

* Automatikus a nagyobb ábrázolási tartomány felé

```java
int i = 900;
long l = i;
l = (long) i; // Itt explicit típuskényszerítés nem szükséges és nem is javasolt
long m = 900; // A 900 literál alapból int
```
---

# Boxing

* Boxing

```java
int i = 900;
Integer o = Integer.valueOf(i);
```

* Autoboxing

```java
Integer o = 900;
int i = 900;
Integer p = i;
```

---

# Unboxing 

* Unboxing

```java
Integer o = 900;
int i = o.intValue();
```

* Autounboxing

```java
Integer o = 900;
int j = o; // Auto
```

---

# Szöveg és primitív típus közötti konverzió

```java
int i = 900;
String s = "" + i; // Nem javasolt
String t = Integer.toString(i);
```

Parse:

```java
String s = "900";
int i = Integer.parseInt(s);
```

---

# Konverziók összefoglalása

<img src="images/conversions.png" alt="Konverziók összefoglalása" width="550" />





## Unit tesztelés JUnittal
class: inverse, center, middle



# Unit tesztelés JUnittal

---

# Unit tesztelés

* A kód egy darabjának tesztelésére
* Automatikus
* Bízunk benne, ha a darabok hibátlanok, akkor az egész is az
* Hibákat mielőbb megtaláljuk
* Gondolunk a szélsőséges esetekre
* Könnyebben módosítunk
* Dokumentálja a kódot
* Strukturáltabb lesz a kód

---

# JUnit

* Keretrendszer a unit teszteléshez
* Given - when - then
* Assert, Hamcrest
* Maven támogatás
* IDE támogatás

---

# Teszt lefedettség

* Méri, hogy mely kódsorok futottak le a tesztek futtatása közben
* IDE támogatás




class: inverse, center, middle

# JUnit assert metódusok

---

## További assert metódusok

* Leggyakrabban használt az `assertEquals()` metódus
    * Primitívek esetén az értéküket, objektumok esetén az állapotukat hasonlítja össze
* `assertNull()`, `assertNotNull()` `null` vizsgálatra
* `assertNotEquals()` annak ellenőrzésére, hogy nem egyenlőek
* `assertSame()`, `assertNotSame()` hasonlít össze referenciákat
* `assertTrue()`, `assertFalse()` - lehetőleg kerüljük, <br /> helyette `assertEquals()`

---

## `assertEquals` lebegőpontos <br /> számoknál

* Számábrázolási pontatlanságok miatt adjunk meg egy `delta` paramétert

```java
assertEquals(1.23, d, 0.005);
```
---

## Assert metódusok több elem <br /> esetén

* `assertArrayEquals` tömbök kezelésére


class: inverse, center, middle

# Tesztesetek életciklusa

---

# Test fixture

* Minden, ami szükséges a teszteset sikeres lefutásához <br /> (inicializálás - ismert állapotba hozás, előfeltételek)
* Kiemelhető külön metódusba
* `@BeforeEach`, `@AfterEach` annotációkkal ellátott metódusok

---

## Test fixture példa

```java
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee employee;

    @BeforeEach
    void initEmployee() {
    	employee = new Employee("John Doe", 1970);
    }

    @Test
    void testGetAge() {
        assertEquals(49, employee.getAge(2019));
    }

    @Test
    void testWithZeroAge() {
    	assertEquals(0, employee.getAge(1970));
    }
}
```

